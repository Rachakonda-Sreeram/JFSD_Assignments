package com.hexaware.ecommerce.entity;

public class Customer {
	private int customerId;        // Primary Key
    private String fullName;
    private String gender;
    private String contactNumber;
    private int addressId;
    private int userId;
	
    public Customer(int customerId, String fullName, String gender, String contactNumber, int addressId, int userId) {
		super();
		this.customerId = customerId;
		this.fullName = fullName;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.addressId = addressId;
		this.userId = userId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", fullName=" + fullName + ", gender=" + gender
				+ ", contactNumber=" + contactNumber + ", addressId=" + addressId + ", userId=" + userId + "]";
	}

    
}