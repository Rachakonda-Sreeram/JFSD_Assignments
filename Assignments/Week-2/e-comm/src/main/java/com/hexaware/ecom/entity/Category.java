package com.hexaware.ecom.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Category{
	@Id
	private int categoryId;        // Primary Key
    private String categoryName;
    private int subCategoryId;
    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private List<SubCategory> subCategories;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> products;
   
}