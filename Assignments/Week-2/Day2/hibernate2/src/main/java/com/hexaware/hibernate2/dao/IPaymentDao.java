package com.hexaware.hibernate2.dao;


import java.util.List;

import com.hexaware.hibernate2.entity.Payment;


public interface IPaymentDao {
	
	public Payment createPayment(Payment pay);
	public List<Payment> selectPaymentsByPayment_Type(String payment_Type);
	public List<Payment> selectAllPayments();
	public boolean deletePaymentByID(int payment_ID);
	public boolean updatePayment(Payment pay);

}