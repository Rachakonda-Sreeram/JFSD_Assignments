package com.hexaware.ecommerce.entity;

public class Seller {
	 private int sellerId;        // Primary Key
	    private String businessName;
	    private String phone;
	    private int addressId;
	    private int userId;
		
	    public Seller(int sellerId, String businessName, String phone, int addressId, int userId) {
			super();
			this.sellerId = sellerId;
			this.businessName = businessName;
			this.phone = phone;
			this.addressId = addressId;
			this.userId = userId;
		}

		public int getSellerId() {
			return sellerId;
		}

		public void setSellerId(int sellerId) {
			this.sellerId = sellerId;
		}

		public String getBusinessName() {
			return businessName;
		}

		public void setBusinessName(String businessName) {
			this.businessName = businessName;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
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
			return "Seller [sellerId=" + sellerId + ", businessName=" + businessName + ", phone=" + phone
					+ ", addressId=" + addressId + ", userId=" + userId + "]";
		}
	    
	    
}