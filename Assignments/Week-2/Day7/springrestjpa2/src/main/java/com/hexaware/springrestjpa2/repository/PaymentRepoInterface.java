package com.hexaware.springrestjpa2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.springrestjpa2.entity.Payment;
@Repository
public interface PaymentRepoInterface extends JpaRepository<Payment,Integer> {
	@Query("select p from Payment p where p.payment_Type = ?1")
	List<Payment> getPaymentByType(String payment_Type);
	@Modifying
	@Query("delete from Payment p where p.payment_Status = ?1")
	int deleteByPaymentStatus(String payment_Status);

}
