package com.hexaware.ecom.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Seller{
	@Id
	
	 private int sellerId;        // Primary Key
	    private String businessName;
	    private String phone;
	    @OneToOne
	    @JoinColumn(name = "addressId")
	    private Address address;
	    @OneToOne
	    @JoinColumn(name = "userId")
	    private User user;
	    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
	    private List<Product> products;
	    
	    
	    
}