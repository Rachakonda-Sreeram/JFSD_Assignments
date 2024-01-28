package com.hexaware.mappings.entities;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student{
	
	@Id
	private int studentID;
	private String studentName;
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", address=" + address + "]";
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student(int studentID, String studentName, Address address) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.address = address;
	}
	public Student(int studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
	}
	public Student() {
		super();
	}
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="addressID")
	private Address address;

}
