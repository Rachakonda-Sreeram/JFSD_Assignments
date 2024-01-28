package com.hexaware.ecom.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class SubCategory{
	@Id
    private int subCategoryId;        // Primary Key
    private String subCategoryName;
    @ManyToOne
    @JoinColumn(name="categoryID")
    private Category category;
    @OneToMany(mappedBy = "subCategory", cascade = CascadeType.ALL)
    private List<Product> products;

    
}