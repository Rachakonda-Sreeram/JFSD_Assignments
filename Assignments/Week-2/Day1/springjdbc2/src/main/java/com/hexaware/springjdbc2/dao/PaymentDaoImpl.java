package com.hexaware.springjdbc2.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springjdbc2.model.Payment;

@Repository
public class PaymentDaoImpl implements IPaymentDao {
	
	
JdbcTemplate jdbcTemplate;
	
	@Autowired
	public PaymentDaoImpl(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
		
	}
	
	

	@Override
	public boolean createPayment(Payment pay) {
		// TODO Auto-generated method stub
		String insert = "insert into Payments(Payment_ID, Order_ID, Payment_Date , Amount,  Payment_Type, Payment_Status) values(?,?,?,?,?,?);";
		int count = jdbcTemplate.update(insert,pay.getPayment_ID(),pay.getOrder_ID(),pay.getPayment_date(),pay.getAmount(),pay.getPayment_Type(),pay.getPayment_Status());
		return count>0;
	}

	@Override
	public List<Payment> selectPaymentsByPayment_Type(String payment_Type) {
		// TODO Auto-generated method stub
		String selectType = "select Payment_ID, Order_ID, Payment_Date , Amount,  Payment_Type, Payment_Status from Payments where payment_type = ?;";
		List<Payment> method = jdbcTemplate.query(selectType,  new PaymentMapper(), payment_Type);
		return method;
	}

	@Override
	public List<Payment> selectAllPayments() {
		// TODO Auto-generated method stub
		String selectAll = "select Payment_ID, Order_ID, Payment_Date , Amount,  Payment_Type, Payment_Status from payments ;";
		List<Payment> pay = jdbcTemplate.query(selectAll, new PaymentMapper()); 
		return pay;
	}

}
