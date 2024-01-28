package com.hexaware.ecom.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Cart{
	@Id
	 private int cartId;        // Primary Key
	    private int quantity;
	    private LocalDateTime createdAt;
	    private LocalDateTime modifiedAt;
	    private boolean ordered;
	    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
	    private List<Product> products;
	    @OneToOne
	    @JoinColumn(name = "customerId", unique = true)
	    private Customer customer;
	    @OneToOne(mappedBy = "cart", cascade = CascadeType.ALL)
	    private Order order;
	   
}