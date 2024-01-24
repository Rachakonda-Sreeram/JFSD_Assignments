package com.hexaware.ecommerce.entity;

public class SubCategory {
    private int subCategoryId;        // Primary Key
    private String subCategoryName;
	
    public SubCategory(int subCategoryId, String subCategoryName) {
		super();
		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
	}

	public int getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	@Override
	public String toString() {
		return "SubCategory [subCategoryId=" + subCategoryId + ", subCategoryName=" + subCategoryName + "]";
	}

    
}