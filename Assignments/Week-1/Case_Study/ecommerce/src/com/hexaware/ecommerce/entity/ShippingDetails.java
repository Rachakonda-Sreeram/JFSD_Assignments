package com.hexaware.ecommerce.entity;

import java.time.LocalDate;

public class ShippingDetails {
	private int shippingDetailId;        // Primary Key
    private int orderId;
    private int addressId;
    private LocalDate deliveryDate;
	
    public ShippingDetails(int shippingDetailId, int orderId, int addressId, LocalDate deliveryDate) {
		super();
		this.shippingDetailId = shippingDetailId;
		this.orderId = orderId;
		this.addressId = addressId;
		this.deliveryDate = deliveryDate;
	}

	public int getShippingDetailId() {
		return shippingDetailId;
	}

	public void setShippingDetailId(int shippingDetailId) {
		this.shippingDetailId = shippingDetailId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	@Override
	public String toString() {
		return "ShippingDetails [shippingDetailId=" + shippingDetailId + ", orderId=" + orderId + ", addressId="
				+ addressId + ", deliveryDate=" + deliveryDate + "]";
	}
    
    
}