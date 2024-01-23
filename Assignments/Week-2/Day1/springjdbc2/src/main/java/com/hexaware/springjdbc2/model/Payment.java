package com.hexaware.springjdbc2.model;

import java.util.Date;

public class Payment {
	
	private int payment_ID;
	private int order_ID;
	private Date payment_date;
	private double amount;
	private String payment_Type;
	private String payment_Status;
	public int getPayment_ID() {
		return payment_ID;
	}
	public void setPayment_ID(int payment_ID) {
		this.payment_ID = payment_ID;
	}
	public int getOrder_ID() {
		return order_ID;
	}
	public void setOrder_ID(int order_ID) {
		this.order_ID = order_ID;
	}
	public Date getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPayment_Type() {
		return payment_Type;
	}
	public void setPayment_Type(String payment_Type) {
		this.payment_Type = payment_Type;
	}
	public String getPayment_Status() {
		return payment_Status;
	}
	public void setPayment_Status(String payment_Status) {
		this.payment_Status = payment_Status;
	}
	public Payment() {
		super();
	}
	public Payment(int payment_ID, int order_ID, Date payment_date, double amount, String payment_Type,
			String payment_Status) {
		super();
		this.payment_ID = payment_ID;
		this.order_ID = order_ID;
		this.payment_date = payment_date;
		this.amount = amount;
		this.payment_Type = payment_Type;
		this.payment_Status = payment_Status;
	}
	@Override
	public String toString() {
		return "Payment [payment_ID=" + payment_ID + ", order_ID=" + order_ID + ", payment_date=" + payment_date
				+ ", amount=" + amount + ", payment_Type=" + payment_Type + ", payment_Status=" + payment_Status + "]";
	}
	

}
