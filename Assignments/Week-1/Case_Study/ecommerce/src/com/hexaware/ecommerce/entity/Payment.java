package com.hexaware.ecommerce.entity;

import java.time.LocalDateTime;

public class Payment {
	 private int paymentId;        // Primary Key
	    private int orderId;
	    private LocalDateTime paymentDate;
	    private double amount;
	    private String paymentMethod;
	    private String paymentStatus;
		
	    public Payment(int paymentId, int orderId, LocalDateTime paymentDate, double amount, String paymentMethod,
				String paymentStatus) {
			super();
			this.paymentId = paymentId;
			this.orderId = orderId;
			this.paymentDate = paymentDate;
			this.amount = amount;
			this.paymentMethod = paymentMethod;
			this.paymentStatus = paymentStatus;
		}

		public int getPaymentId() {
			return paymentId;
		}

		public void setPaymentId(int paymentId) {
			this.paymentId = paymentId;
		}

		public int getOrderId() {
			return orderId;
		}

		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}

		public LocalDateTime getPaymentDate() {
			return paymentDate;
		}

		public void setPaymentDate(LocalDateTime paymentDate) {
			this.paymentDate = paymentDate;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public String getPaymentMethod() {
			return paymentMethod;
		}

		public void setPaymentMethod(String paymentMethod) {
			this.paymentMethod = paymentMethod;
		}

		public String getPaymentStatus() {
			return paymentStatus;
		}

		public void setPaymentStatus(String paymentStatus) {
			this.paymentStatus = paymentStatus;
		}

		@Override
		public String toString() {
			return "Payment [paymentId=" + paymentId + ", orderId=" + orderId + ", paymentDate=" + paymentDate
					+ ", amount=" + amount + ", paymentMethod=" + paymentMethod + ", paymentStatus=" + paymentStatus
					+ "]";
		}
	    
	    
	    
}