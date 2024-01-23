package com.hexaware.springjdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springjdbc.model.Product;

@Repository
public class ProductDaoImpl implements IProductDao{
	
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public ProductDaoImpl(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
		
		System.out.println(jdbcTemplate);
		
	}

	@Override
	public boolean createProduct(Product product) {
		// TODO Auto-generated method stub
		
		String insertQuery = "insert into Product values(?,?,?);";
	int count = 	jdbcTemplate.update(insertQuery,product.getProductID(),product.getProductName(),product.getPrice());
		return count > 0;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		String updateQuery = "update Product set ProductName = ?, Price = ? where ProductID = ? ;";
		int count = 	jdbcTemplate.update(updateQuery,product.getProductName(),product.getPrice(),product.getProductID());
		return count > 0;
	}

	@Override
	public boolean deleteProductByID(int productID) {
		// TODO Auto-generated method stub
		String deleteQuery = "delete from product  where productID = ?";

		int count = jdbcTemplate.update(deleteQuery, productID);

		return count > 0;
	}

	@Override
	public Product selectProductByID(int productID) {
		// TODO Auto-generated method stub
		String selectQueryById = "select productid,productname,price from product where productid = ?";

		Product product = jdbcTemplate.queryForObject(selectQueryById, new ProductMapper(), productID);

		return product;
	}

	@Override
	public List<Product> selectAllProducts() {
		// TODO Auto-generated method stub
		String selectQuery = "select productid,productname,price from product";

		List<Product> list = jdbcTemplate.query(selectQuery, new ProductMapper());

		return list;
	}

}
