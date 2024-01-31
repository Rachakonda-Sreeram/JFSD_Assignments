package com.hexaware.springrestjpa2.controller;

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

import com.hexaware.springrestjpa2.entity.Payment;
import com.hexaware.springrestjpa2.service.IPaymentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/quitqueue/payment")
public class PaymentController {
	
	@Autowired
	IPaymentService service;
	
	@PostMapping("/add")
	public Payment insertPayment(@Valid @RequestBody Payment pay) {
		return service.insertPayment(pay);
	}
	
	@PutMapping("/update")
	public Payment updatePayment(@Valid @RequestBody Payment pay) {
		return service.updatePayment(pay);
	}
	
	@GetMapping("/getall")
	public List<Payment> getAllPayments(){
		return service.getAllPayments();
	}
	
	@DeleteMapping("/delete/{payment_ID}")
	public boolean deletePayment(@RequestBody @PathVariable int payment_ID) {
		return service.deletePayment(payment_ID);
	}
	
	@GetMapping("/getPaymentByType/{payment_Type}")
	public List<Payment> getPaymentByType(@RequestBody @PathVariable String payment_Type){
		return service.getPaymentByType(payment_Type);
	}
	
	@DeleteMapping("/deletePaymentByStatus/{payment_Status}")
	public String deleteByPaymentStatus(@RequestBody @PathVariable String payment_Status){
		int count = service.deleteByPaymentStatus(payment_Status);
		return count + " record deleted.";
	}

}
