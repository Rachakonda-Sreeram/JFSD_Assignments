package com.hexaware.springrestjpa2.service;

import java.util.List;

import com.hexaware.springrestjpa2.entity.Payment;

public interface IPaymentService {
	
	public Payment insertPayment(Payment pay);
	public List<Payment> getAllPayments();
	public Payment updatePayment(Payment pay);
	public boolean deletePayment(int payment_ID);
	public List<Payment> getPaymentByType(String payment_Type);
	public int deleteByPaymentStatus(String payment_Status);
	public Payment getPaymentById(int payment_ID);

}
