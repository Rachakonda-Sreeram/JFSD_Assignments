package com.hexaware.ecom.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Product{
	@Id
	 private int productId;        // Primary Key
	 @ManyToOne
	 @JoinColumn(name = "sellerId")
	 private Seller seller;
	    private String productName;
	    private String productImageURL;
	    private String description;
	    private double price;
	    private int stockQuantity;
	    private String brand;
	    private LocalDateTime createdAt;
	    private LocalDateTime modifiedAt;
	    @ManyToOne
	    @JoinColumn(name = "categoryId")
	    private Category category;
	    @ManyToOne
	    @JoinColumn(name = "subCategoryId")
	    private SubCategory subCategory;
	    @ManyToOne
	    @JoinColumn(name = "cartId")
	    private Cart cart; 
	    
}