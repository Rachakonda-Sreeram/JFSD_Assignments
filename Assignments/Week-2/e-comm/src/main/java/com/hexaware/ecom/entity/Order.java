package com.hexaware.ecom.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "custom_orders")
public class Order{
	@Id
	  private int orderId;        // Primary Key
	@ManyToOne
    @JoinColumn(name = "customerId")
	  private Customer customer;
	    private LocalDate orderDate;
	    private double totalAmount;
	    private String status;
	    private String statusDescription;
	    @OneToOne
	    @JoinColumn(name = "cartId")
	    private Cart cart;
	    private LocalDate deliveryDate;
	    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    private Payment payment;
		
	    
	    
	    
}