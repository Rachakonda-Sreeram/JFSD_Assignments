package com.hexaware.springjdbc2.dao;

import java.util.List;

import com.hexaware.springjdbc2.model.Payment;

public interface IPaymentDao {
	
	public boolean createPayment(Payment pay);
	public List<Payment> selectPaymentsByPayment_Type(String payment_Type);
	public List<Payment> selectAllPayments();

}
