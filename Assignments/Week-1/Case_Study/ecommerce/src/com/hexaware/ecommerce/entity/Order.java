package com.hexaware.ecommerce.entity;

import java.time.LocalDate;


public class Order {
	  private int orderId;        // Primary Key
	    private int customerId;
	    private LocalDate orderDate;
	    private double totalAmount;
	    private String status;
	    private int addressId;
	    private String statusDescription;
	    private int cartId;
		
	    public Order(int orderId, int customerId, LocalDate orderDate, double totalAmount, String status, int addressId,
				String statusDescription, int cartId) {
			super();
			this.orderId = orderId;
			this.customerId = customerId;
			this.orderDate = orderDate;
			this.totalAmount = totalAmount;
			this.status = status;
			this.addressId = addressId;
			this.statusDescription = statusDescription;
			this.cartId = cartId;
		}

		public int getOrderId() {
			return orderId;
		}

		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public LocalDate getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(LocalDate orderDate) {
			this.orderDate = orderDate;
		}

		public double getTotalAmount() {
			return totalAmount;
		}

		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public int getAddressId() {
			return addressId;
		}

		public void setAddressId(int addressId) {
			this.addressId = addressId;
		}

		public String getStatusDescription() {
			return statusDescription;
		}

		public void setStatusDescription(String statusDescription) {
			this.statusDescription = statusDescription;
		}

		public int getCartId() {
			return cartId;
		}

		public void setCartId(int cartId) {
			this.cartId = cartId;
		}

		@Override
		public String toString() {
			return "Order [orderId=" + orderId + ", customerId=" + customerId + ", orderDate=" + orderDate
					+ ", totalAmount=" + totalAmount + ", status=" + status + ", addressId=" + addressId
					+ ", statusDescription=" + statusDescription + ", cartId=" + cartId + "]";
		}
	    
	    
	    
}