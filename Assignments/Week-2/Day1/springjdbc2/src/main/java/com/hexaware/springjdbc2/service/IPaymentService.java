package com.hexaware.springjdbc2.service;

import java.util.List;

import com.hexaware.springjdbc2.model.Payment;

public interface IPaymentService {
	
	public boolean createPayment(Payment pay);
	public List<Payment> selectPaymentsByPayment_Type(String payment_Type);
	public List<Payment> selectAllPayments();

}
