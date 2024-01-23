package com.hexaware.springjdbc2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.springjdbc2.model.Payment;

public class PaymentMapper implements RowMapper<Payment> {

	@Override
	public Payment mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Payment pay = new Payment();

        pay.setPayment_ID(rs.getInt("payment_ID"));
        pay.setOrder_ID(rs.getInt("order_ID"));

       
        String dateStr = rs.getString("payment_date");
        pay.setPayment_date(parseDate(dateStr));

        pay.setAmount(rs.getDouble("amount"));
        pay.setPayment_Type(rs.getString("payment_Type"));
        pay.setPayment_Status(rs.getString("payment_Status"));

        return pay;
	}
	
	private Date parseDate(String dateInput) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
        try {
            return dateFormat.parse(dateInput);
        } catch (ParseException e) {
           
            e.printStackTrace(); // Consider logging the exception instead
            return null;
        }
    }

}
