package com.hexaware.customerapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hexaware.customerapi.dto.CustomerDTO;
import com.hexaware.customerapi.dto.CustomerProductVO;
import com.hexaware.customerapi.dto.Product;
import com.hexaware.customerapi.entity.Customer;
import com.hexaware.customerapi.repository.CustomerRepository;
@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	CustomerRepository repo;
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public Customer addCustomer(CustomerDTO customerDTO) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setCustomerID(customerDTO.getCustomerID());
		customer.setCustomerName(customerDTO.getCustomerName());
		customer.setDateOfBirth(customerDTO.getDateOfBirth());
		customer.setProductID(customerDTO.getProductID());
		return repo.save(customer);
	}

	@Override
	public CustomerDTO getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		Customer customer = repo.findById(customerId).orElse(null);
		CustomerDTO dto = new CustomerDTO();
		dto.setCustomerID(customer.getCustomerID());
		dto.setCustomerName(customer.getCustomerName());
		dto.setDateOfBirth(customer.getDateOfBirth());
		dto.setProductID(customer.getProductID());
		return dto;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public CustomerProductVO getCustomerAndProductById(int customerId) {
		// TODO Auto-generated method stub
		CustomerDTO customer = getCustomerById(customerId);
		int pid = customer.getCustomerID();
		Product product = restTemplate.getForObject("http://localhost:8080/api/products/get/"+pid,Product.class);
		return new CustomerProductVO(customer,product);
		
	}

	@Override
	public CustomerProductVO deleteProductFromCustomer(int customerId) {
		// TODO Auto-generated method stub
		CustomerDTO customer = getCustomerById(customerId);
		int pid = customer.getCustomerID();
		restTemplate.delete("http://localhost:8080/api/products/delete/"+pid,Product.class);
		return new CustomerProductVO(customer, null);
		
		
	}

	@Override
	public CustomerProductVO updateProductThroughCustomer(int customerId) {
		// TODO Auto-generated method stub
		CustomerDTO customer = getCustomerById(customerId);
		int pid = customer.getProductID();
		Product product = restTemplate.getForObject("http://localhost:8080/api/products/get/"+pid,Product.class);
		
		restTemplate.put("http://localhost:8080/api/products/update",product);
		return new CustomerProductVO(customer,product);
	}

	
	
	 

}
