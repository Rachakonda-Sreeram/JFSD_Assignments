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
public class Customer{
	@Id
	private int customerId;        // Primary Key
    private String fullName;
    private String gender;
    private String contactNumber;
    @OneToOne
    @JoinColumn(name = "addressId")
    private Address address;
    @OneToOne
    @JoinColumn(name = "userId")
    private User user;
    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    private Cart cart;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orders;
	
}