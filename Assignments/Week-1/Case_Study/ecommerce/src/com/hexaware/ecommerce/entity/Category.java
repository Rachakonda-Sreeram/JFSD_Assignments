package com.hexaware.ecommerce.entity;

public class Category {
	private int categoryId;        // Primary Key
    private String categoryName;
    private int subCategoryId;
	public Category(int categoryId, String categoryName, int subCategoryId) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.subCategoryId = subCategoryId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", subCategoryId="
				+ subCategoryId + "]";
	}
   
}