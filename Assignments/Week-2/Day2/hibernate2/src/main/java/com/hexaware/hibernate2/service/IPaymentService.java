package com.hexaware.hibernate2.service;


import java.util.List;

import com.hexaware.hibernate2.entity.Payment;


public interface IPaymentService {
	
	public Payment createPayment(Payment pay);
	public List<Payment> selectPaymentsByPayment_Type(String payment_Type);
	public List<Payment> selectAllPayments();
	public boolean deletePaymentByID(int payment_ID);
	public boolean updatePayment(Payment pay);
}
