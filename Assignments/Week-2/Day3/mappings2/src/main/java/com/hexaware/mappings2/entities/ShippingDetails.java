package com.hexaware.mappings2.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ShippingDetails {
	
	@Id
	private int shippingDetails_ID;
	private int order_ID;
	private LocalDate deliveryDate;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_ID")
	private Address address;
	

	public int getShippingDetails_ID() {
		return shippingDetails_ID;
	}
	public void setShippingDetails_ID(int shippingDetails_ID) {
		this.shippingDetails_ID = shippingDetails_ID;
	}
	public int getOrder_ID() {
		return order_ID;
	}
	public void setOrder_ID(int order_ID) {
		this.order_ID = order_ID;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ShippingDetails(int shippingDetails_ID, int order_ID, LocalDate deliveryDate, Address address) {
		super();
		this.shippingDetails_ID = shippingDetails_ID;
		this.order_ID = order_ID;
		this.deliveryDate = deliveryDate;
		this.address = address;
	}
	public ShippingDetails() {
		super();
	}
	@Override
	public String toString() {
		return "ShippingDetails [shippingDetails_ID=" + shippingDetails_ID + ", order_ID=" + order_ID
				+ ", deliveryDate=" + deliveryDate + ", address=" + address + "]";
	}
	

}
