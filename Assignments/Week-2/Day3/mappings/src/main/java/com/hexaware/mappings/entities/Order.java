package com.hexaware.mappings.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Order_Master")
public class Order {
	
	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", date=" + date + ", products=" + products + "]";
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public Order() {
		super();
	}

	public Order(int orderID, LocalDate date, Set<Product> products) {
		super();
		this.orderID = orderID;
		this.date = date;
		this.products = products;
	}
	public void addProduct(Product p) {
		this.getProducts().add(p);
	}

	@Id
	private int orderID;
	private LocalDate date;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
		    name = "products_orders_table",
		    joinColumns = @JoinColumn(name = "order_ID"),
		    inverseJoinColumns = @JoinColumn(name = "product_ID")
		)
	private Set<Product> products = new HashSet<Product>();

}
