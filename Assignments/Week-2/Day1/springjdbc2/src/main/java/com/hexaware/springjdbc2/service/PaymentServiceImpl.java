package com.hexaware.springjdbc2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springjdbc2.dao.IPaymentDao;
import com.hexaware.springjdbc2.model.Payment;

@Service
public class PaymentServiceImpl implements IPaymentService{
	
	@Autowired
	IPaymentDao dao;

	@Override
	public boolean createPayment(Payment pay) {
		// TODO Auto-generated method stub
		return dao.createPayment(pay);
	}

	@Override
	public List<Payment> selectPaymentsByPayment_Type(String payment_Type) {
		// TODO Auto-generated method stub
		return dao.selectPaymentsByPayment_Type(payment_Type);
	}

	@Override
	public List<Payment> selectAllPayments() {
		// TODO Auto-generated method stub
		return dao.selectAllPayments();
	}

}
