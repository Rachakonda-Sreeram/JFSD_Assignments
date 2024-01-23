package com.hexaware.springjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springjdbc.dao.IProductDao;
import com.hexaware.springjdbc.model.Product;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	IProductDao dao;

	@Override
	public boolean createProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.createProduct(product);
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.updateProduct(product);
	}

	@Override
	public boolean deleteProductByID(int productID) {
		// TODO Auto-generated method stub
		return dao.deleteProductByID(productID);
	}

	@Override
	public Product selectProductByID(int productID) {
		// TODO Auto-generated method stub
		return dao.selectProductByID(productID);
	}

	@Override
	public List<Product> selectAllProducts() {
		// TODO Auto-generated method stub
		return dao.selectAllProducts();
	}

}
