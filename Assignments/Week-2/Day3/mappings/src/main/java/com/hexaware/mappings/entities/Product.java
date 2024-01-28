package com.hexaware.mappings.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product {
	
	@Id
	private int productID;
	private String productName;
	@ManyToMany(mappedBy="products", fetch=FetchType.LAZY)
	private Set<Order> orders = new HashSet<Order>();
	public Product(int productID, String productName, Set<Order> orders) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.orders = orders;
	}
	public Product() {
		super();
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", orders=" + orders + "]";
	}

}
