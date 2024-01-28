package com.hexaware.mappings2.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	private int address_ID;
	private String houseNo;
	private String address_Line1;
	private String address_Line2;
	private int postalCode;
	private String city;
	private String state;
	private String Country;
	public int getAddress_ID() {
		return address_ID;
	}
	public void setAddress_ID(int address_ID) {
		this.address_ID = address_ID;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getAddress_Line1() {
		return address_Line1;
	}
	public void setAddress_Line1(String address_Line1) {
		this.address_Line1 = address_Line1;
	}
	public String getAddress_Line2() {
		return address_Line2;
	}
	public void setAddress_Line2(String address_Line2) {
		this.address_Line2 = address_Line2;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public Address(int address_ID, String houseNo, String address_Line1, String address_Line2, int postalCode,
			String city, String state, String country) {
		super();
		this.address_ID = address_ID;
		this.houseNo = houseNo;
		this.address_Line1 = address_Line1;
		this.address_Line2 = address_Line2;
		this.postalCode = postalCode;
		this.city = city;
		this.state = state;
		Country = country;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [address_ID=" + address_ID + ", houseNo=" + houseNo + ", address_Line1=" + address_Line1
				+ ", address_Line2=" + address_Line2 + ", postalCode=" + postalCode + ", city=" + city + ", state="
				+ state + ", Country=" + Country + "]";
	}
	
	

}
