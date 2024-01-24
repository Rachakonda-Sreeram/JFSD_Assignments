package com.hexaware.ecommerce.entity;

public class OrderDetails {
	private int orderDetailId;        // Primary Key
    private int orderId;
    private int productId;
    private int paymentId;
    private int quantity;
    private double subtotal;
	
    public OrderDetails(int orderDetailId, int orderId, int productId, int paymentId, int quantity, double subtotal) {
		super();
		this.orderDetailId = orderDetailId;
		this.orderId = orderId;
		this.productId = productId;
		this.paymentId = paymentId;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}

	public int getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderDetailId=" + orderDetailId + ", orderId=" + orderId + ", productId=" + productId
				+ ", paymentId=" + paymentId + ", quantity=" + quantity + ", subtotal=" + subtotal + "]";
	}
    
    
    
    
    
}