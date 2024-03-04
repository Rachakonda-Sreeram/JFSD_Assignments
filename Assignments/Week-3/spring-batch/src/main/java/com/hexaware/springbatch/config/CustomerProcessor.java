package com.hexaware.springbatch.config;

import org.springframework.batch.item.ItemProcessor;

import com.hexaware.springbatch.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer,Customer>{

	@Override
	public Customer process(Customer item) throws Exception {
		// TODO Auto-generated method stub
		
		if(item.getCountry().equals("Indonesia")) {return item;}
		else {
		return null;
	}
	
	}

}
