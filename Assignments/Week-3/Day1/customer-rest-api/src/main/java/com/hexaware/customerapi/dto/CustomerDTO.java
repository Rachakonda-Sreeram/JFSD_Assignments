package com.hexaware.customerapi.dto;

import java.time.LocalDate;

public class CustomerDTO {
	
	private int customerID;
	private String customerName;
	private LocalDate dateOfBirth;
	private int productID;
	public CustomerDTO(int customerID, String customerName, LocalDate dateOfBirth, int productID) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.dateOfBirth = dateOfBirth;
		this.productID = productID;
	}
	public CustomerDTO() {
		super();
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
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	

}
