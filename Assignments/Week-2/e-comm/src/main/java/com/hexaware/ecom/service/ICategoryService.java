package com.hexaware.ecom.service;

import java.util.List;

import com.hexaware.ecom.entity.Category;

public interface ICategoryService {
	public Category addCategory(String name);
	public List<Category> getCategories();
	public Boolean deleteCategory(int id);
	public Category updateCategory(int id,String name);
	public Category getCategory(int id);
}
