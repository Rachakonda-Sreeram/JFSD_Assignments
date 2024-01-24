package com.hexaware.ecommerce.entity;

import java.time.LocalDateTime;

public class Product {
	 private int productId;        // Primary Key
	    private int sellerId;
	    private String productName;
	    private String productImageURL;
	    private String description;
	    private double price;
	    private int stockQuantity;
	    private String brand;
	    private LocalDateTime createdAt;
	    private LocalDateTime modifiedAt;
	    private int categoryId;
	    private int subCategoryId;
	    private int rating;
		
	    public Product(int productId, int sellerId, String productName, String productImageURL, String description,
				double price, int stockQuantity, String brand, LocalDateTime createdAt, LocalDateTime modifiedAt,
				int categoryId, int subCategoryId, int rating) {
			super();
			this.productId = productId;
			this.sellerId = sellerId;
			this.productName = productName;
			this.productImageURL = productImageURL;
			this.description = description;
			this.price = price;
			this.stockQuantity = stockQuantity;
			this.brand = brand;
			this.createdAt = createdAt;
			this.modifiedAt = modifiedAt;
			this.categoryId = categoryId;
			this.subCategoryId = subCategoryId;
			this.rating = rating;
		}

		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}

		public int getSellerId() {
			return sellerId;
		}

		public void setSellerId(int sellerId) {
			this.sellerId = sellerId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductImageURL() {
			return productImageURL;
		}

		public void setProductImageURL(String productImageURL) {
			this.productImageURL = productImageURL;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getStockQuantity() {
			return stockQuantity;
		}

		public void setStockQuantity(int stockQuantity) {
			this.stockQuantity = stockQuantity;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public LocalDateTime getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}

		public LocalDateTime getModifiedAt() {
			return modifiedAt;
		}

		public void setModifiedAt(LocalDateTime modifiedAt) {
			this.modifiedAt = modifiedAt;
		}

		public int getCategoryId() {
			return categoryId;
		}

		public void setCategoryId(int categoryId) {
			this.categoryId = categoryId;
		}

		public int getSubCategoryId() {
			return subCategoryId;
		}

		public void setSubCategoryId(int subCategoryId) {
			this.subCategoryId = subCategoryId;
		}

		public int getRating() {
			return rating;
		}

		public void setRating(int rating) {
			this.rating = rating;
		}

		@Override
		public String toString() {
			return "Product [productId=" + productId + ", sellerId=" + sellerId + ", productName=" + productName
					+ ", productImageURL=" + productImageURL + ", description=" + description + ", price=" + price
					+ ", stockQuantity=" + stockQuantity + ", brand=" + brand + ", createdAt=" + createdAt
					+ ", modifiedAt=" + modifiedAt + ", categoryId=" + categoryId + ", subCategoryId=" + subCategoryId
					+ ", rating=" + rating + "]";
		}
	    
		
	    
}