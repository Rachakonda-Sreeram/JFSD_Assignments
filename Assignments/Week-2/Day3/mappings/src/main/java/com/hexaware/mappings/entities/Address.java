package com.hexaware.mappings.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	
	@Id
	private int addressID;
	@Override
	public String toString() {
		return "Address [addressID=" + addressID + ", city=" + city + ", student=" + student + "]";
	}
	public int getAddressID() {
		return addressID;
	}
	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(int addressID, String city) {
		super();
		this.addressID = addressID;
		this.city = city;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	public Address(int addressID, String city, Student student) {
		super();
		this.addressID = addressID;
		this.city = city;
		this.student = student;
	}
	private String city;
	@OneToOne(mappedBy = "address",cascade = CascadeType.ALL)
	Student student;
	public Address() {
		super();
	}
}
