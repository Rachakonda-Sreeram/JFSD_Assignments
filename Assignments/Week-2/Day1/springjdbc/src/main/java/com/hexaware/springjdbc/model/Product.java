package com.hexaware.springjdbc.model;

public class Product {
	
	private int productID;
	private String productName;
	private double price;
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", price=" + price + "]";
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(int productID, String productName, double price) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.price = price;
	}
	public Product() {
		super();
	}

}
