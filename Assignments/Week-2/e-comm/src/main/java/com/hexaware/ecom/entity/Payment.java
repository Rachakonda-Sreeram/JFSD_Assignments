package com.hexaware.ecom.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Payment{
	@Id
	 private int paymentId;        // Primary Key
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderId")
    private Order order;
	    private LocalDateTime paymentDate;
	    private double amount;
	    private String paymentMethod;
	    private String paymentStatus;
	
	    
	    
	   
}