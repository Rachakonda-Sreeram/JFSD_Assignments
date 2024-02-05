package com.hexaware.customerapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.customerapi.dto.CustomerDTO;
import com.hexaware.customerapi.dto.CustomerProductVO;
import com.hexaware.customerapi.entity.Customer;
import com.hexaware.customerapi.service.ICustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	
	
	@Autowired
	ICustomerService service;
	
	
	@PostMapping("/add")
	public Customer	addCustomer(@RequestBody CustomerDTO customerDTO) {
		
		return service.addCustomer(customerDTO);
	}
	
	@GetMapping("/get/{customerId}")
	public CustomerDTO	getCustomerById(@PathVariable int customerId) {
		
		return service.getCustomerById(customerId);
	}
	@GetMapping("/getall")
	public List<Customer>	getAllCustomer(){
		
		return service.getAllCustomer();
	}
	
	@GetMapping("/customer-product/{customerId}")
	public CustomerProductVO getCustomerAndProductById(@PathVariable int customerId)
	{
		return service.getCustomerAndProductById(customerId);
	}
	@DeleteMapping("/deleteProductsof/{customerId}")
	public CustomerProductVO deleteProductFromCustomer(@PathVariable int customerId) {
		return service.deleteProductFromCustomer(customerId);
	}
	@PutMapping("/updateProductOfCustomer/{customerId}")
	public CustomerProductVO updateProductThroughCustomer(@PathVariable int customerId) {
		return service.updateProductThroughCustomer(customerId);
	}

}
