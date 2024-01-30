package com.hexaware.ecom.service;

import java.util.List;

import com.hexaware.ecom.entity.Product;


public interface IProductService {
	public List<Product> getProducts();
	
	public Product addProduct(Product product);
	
	public Product getProduct(int id);

	public Product updateProduct(int id,Product product);
	
	public boolean deleteProduct(int id);
}
