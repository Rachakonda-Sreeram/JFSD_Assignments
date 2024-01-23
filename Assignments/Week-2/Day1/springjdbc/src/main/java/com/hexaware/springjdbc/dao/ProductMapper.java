package com.hexaware.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.springjdbc.model.Product;

public class ProductMapper implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setProductID(rs.getInt("ProductID"));
		product.setProductName(rs.getString("ProductName") );
		product.setPrice(rs.getInt("Price"));
		return product;
	}
	
	

	
}
