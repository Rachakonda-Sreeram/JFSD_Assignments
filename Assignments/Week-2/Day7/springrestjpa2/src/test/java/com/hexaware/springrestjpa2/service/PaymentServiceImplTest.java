package com.hexaware.springrestjpa2.service;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import com.hexaware.springrestjpa2.entity.Payment;

import jakarta.transaction.Transactional;
@SpringBootTest
class PaymentServiceImplTest {
	
	@Autowired
	IPaymentService service;

	@Test
	@Commit
	void testInsertPayment() {
		//fail("Not yet implemented");
		Payment pay = new Payment();
		pay.setPayment_ID(109);
		pay.setOrder_ID(209);
		pay.setPayment_date(LocalDate.of(2024, 1, 29));
		pay.setAmount(10000);
		pay.setPayment_Type("Credit card");
		pay.setPayment_Status("Success");
		Payment pay1 = service.insertPayment(pay);
		assertNotNull(pay1);
		assertEquals(109,pay.getPayment_ID());
	}

	@Test
	void testGetAllPayments() {
		//fail("Not yet implemented");
		List<Payment>list = service.getAllPayments();
		boolean flag = list.isEmpty();
		assertFalse(flag);
	}

	@Test
	@Commit
	void testUpdatePayment() {
		//fail("Not yet implemented");
		Payment pay = new Payment();
		pay.setPayment_ID(108);
		pay.setOrder_ID(208);
		pay.setPayment_date(LocalDate.of(2024, 1, 29));
		pay.setAmount(1000);
		pay.setPayment_Type("Credit card");
		pay.setPayment_Status("Success");
		Payment pay1 = service.updatePayment(pay);
		assertEquals(1000,pay.getAmount());
		
	}

	@Test
	@Commit
	void testDeletePayment() {
		//fail("Not yet implemented");
		Payment pay = new Payment();
		pay.setPayment_ID(107);
		pay.setOrder_ID(207);
		pay.setPayment_date(LocalDate.of(2024, 2, 01));
		pay.setAmount(649.98);
		pay.setPayment_Type("Debit card");
		pay.setPayment_Status("Success");
		Payment del = service.insertPayment(pay);
		boolean isdeleted = service.deletePayment(del.getPayment_ID());
		assertTrue(isdeleted);
		
		
	}

}
