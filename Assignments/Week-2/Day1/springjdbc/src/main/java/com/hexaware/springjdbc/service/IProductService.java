package com.hexaware.springjdbc.service;

import java.util.List;

import com.hexaware.springjdbc.model.Product;

public interface IProductService {
	
	public boolean createProduct(Product product);
	public boolean updateProduct(Product product);
	
	public boolean deleteProductByID(int productID);
	public Product selectProductByID(int productID);
	
	public List<Product> selectAllProducts();
	
	

}
