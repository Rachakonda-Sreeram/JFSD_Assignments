package com.hexaware.springrestjpa2.controller;

import static org.junit.jupiter.api.Assertions.*;
import jakarta.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.hexaware.springrestjpa2.entity.Payment;
import org.springframework.web.client.RestTemplate;
@SpringBootTest
@Transactional
class PaymentControllerTest {
	
	@Autowired
	RestTemplate restTemplate;

	@Test
	void testInsertPayment() {
		//fail("Not yet implemented")
		Payment pay = new Payment();
		pay.setPayment_ID(111);
		pay.setOrder_ID(211);
		pay.setPayment_date(LocalDate.of(2024, 1, 29));
		pay.setAmount(10010);
		pay.setPayment_Type("Credit card");
		pay.setPayment_Status("Success");
		ResponseEntity<Payment> response = restTemplate.postForEntity("http://localhost:8080/quitqueue/payment/add",pay,Payment.class);
		Payment p = response.getBody();
		assertEquals(111,pay.getPayment_ID());
	}

	@Test
	void testUpdatePayment() {
		//fail("Not yet implemented");
		Payment pay = new Payment();
		pay.setPayment_ID(112);
		pay.setOrder_ID(212);
		pay.setPayment_date(LocalDate.of(2024, 1, 28));
		pay.setAmount(10110);
		pay.setPayment_Type("COD");
		pay.setPayment_Status("Success");
		ResponseEntity<Payment> response = restTemplate.postForEntity("http://localhost:8080/quitqueue/payment/add",pay,Payment.class);
		Payment p = response.getBody();
		p.setAmount(25000);
		
		restTemplate.put("http://localhost:8080/quitqueue/payment/update",p);
		ResponseEntity<Payment> updated = restTemplate.getForEntity(
	            "http://localhost:8080/quitqueue/payment/getbyid/{payment_ID}",
	            Payment.class,
	            p.getPayment_ID()
	    );
	    Payment updatedPayment = updated.getBody();
	    assertEquals(25000,updatedPayment.getAmount());
		
		
	}

	@Test
	void testGetAllPayments() {
		//fail("Not yet implemented");
		ResponseEntity<List> response = restTemplate.getForEntity("http://localhost:8080/quitqueue/payment/getall", List.class);
		List<Payment> list = response.getBody();
		assertTrue(list.size()>0);
	}

	@Test
	void testDeletePayment() {
		//fail("Not yet implemented");
		int pid = 110;
		ResponseEntity<Payment> pay = restTemplate.getForEntity(
	            "http://localhost:8080/quitqueue/payment/getbyid/{payment_ID}",
	            Payment.class,pid);
		 restTemplate.delete("http://localhost:8080/quitqueue/payment/delete/{payment_ID}",pid);
		 assertNull(pay.getBody());
			
	}

}
