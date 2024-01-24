package com.hexaware.hibernate2.service;

import java.util.List;

import com.hexaware.hibernate2.dao.IPaymentDao;
import com.hexaware.hibernate2.dao.PaymentDaoImpl;
import com.hexaware.hibernate2.entity.Payment;

public class PaymentServiceImpl implements IPaymentService {

		IPaymentDao dao = new PaymentDaoImpl();
	@Override
	public Payment createPayment(Payment pay) {
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

	@Override
	public boolean deletePaymentByID(int payment_ID) {
		// TODO Auto-generated method stub
		return dao.deletePaymentByID(payment_ID);
	}

	@Override
	public boolean updatePayment(Payment pay) {
		// TODO Auto-generated method stub
		return dao.updatePayment(pay);
	}
	
	
	

}
