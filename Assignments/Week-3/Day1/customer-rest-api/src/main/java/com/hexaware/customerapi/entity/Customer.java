package com.hexaware.customerapi.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer_info")
public class Customer {
	@Id
	private int customerID;
	private String customerName;
	private LocalDate dateOfBirth;
	private int productID;
	
	public Customer(int customerID, String customerName, LocalDate dateOfBirth, int productID) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.dateOfBirth = dateOfBirth;
		this.productID = productID;
	}
	public Customer() {
		super();
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
