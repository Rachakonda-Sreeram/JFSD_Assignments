package com.hexaware.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.springbatch.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
