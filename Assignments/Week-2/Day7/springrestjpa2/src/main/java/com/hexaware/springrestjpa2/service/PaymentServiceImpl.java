package com.hexaware.springrestjpa2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrestjpa2.entity.Payment;
import com.hexaware.springrestjpa2.repository.PaymentRepoInterface;

import jakarta.transaction.Transactional;
@Service
public class PaymentServiceImpl implements IPaymentService {
	
	@Autowired
	PaymentRepoInterface repo;
	@Transactional
	@Override
	public Payment insertPayment(Payment pay) {
		// TODO Auto-generated method stub
		return repo.save(pay);
	}

	@Override
	public List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Payment updatePayment(Payment pay) {
		// TODO Auto-generated method stub
		return repo.save(pay);
	}
	@Override
	public boolean deletePayment(int payment_ID) {
	    try {
	        repo.deleteById(payment_ID);
	        return true;
	    } catch (Exception e) {
	        return false; 
	    }
	}



	@Override
	public List<Payment> getPaymentByType(String payment_Type) {
		// TODO Auto-generated method stub
		return repo.getPaymentByType(payment_Type);
	}

	@Override
	public int deleteByPaymentStatus(String payment_Status) {
		// TODO Auto-generated method stub
		return repo.deleteByPaymentStatus(payment_Status);
	}

	@Override
	public Payment getPaymentById(int payment_ID) {
		// TODO Auto-generated method stub
		return repo.findById(payment_ID).orElse(null);
	}

}
