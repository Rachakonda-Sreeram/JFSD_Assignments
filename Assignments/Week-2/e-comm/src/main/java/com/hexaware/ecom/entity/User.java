package com.hexaware.ecom.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User{
	@Id
		 private int userId;        // Primary Key
		    private String username;
		    private String email;
		    private String password;
		    private String userType;
		    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
		    private Seller seller;
		    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
		    private Customer customer;
			

}
