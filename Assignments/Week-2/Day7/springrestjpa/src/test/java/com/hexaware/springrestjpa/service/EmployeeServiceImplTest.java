package com.hexaware.springrestjpa.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import com.hexaware.springrestjpa.entities.Employee;

import jakarta.transaction.Transactional;
@SpringBootTest
@Transactional
class EmployeeServiceImplTest {
	
	
	Logger logger = LoggerFactory.getLogger(EmployeeServiceImplTest.class);
	
	@Autowired
	IEmployeeService service;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	@Commit
	void testAddEmployee() {
		
		Employee emp = new Employee(401,"JERRY",60000);
		Employee e1 = service.addEmployee(emp);
		assertNotNull(e1);
		assertEquals(401,e1.getEid());
		assertTrue(e1.getEid()>0);
		logger.info("TEST ADD EMPLOYEE EXCECUTED");
		//fail("Not yet implemented");
	}

	@Test
	void testGetEmployeeById() {
	//	fail("Not yet implemented");
		Employee e2 = service.getEmployeeById(401);
		assertEquals("JERRY",e2.getEname());
		assertNotEquals("TOM",e2.getEname());
		
	}

	@Test
	void testGetAllEmployees() {
	//	fail("Not yet implemented");
		
		List list = service.getAllEmployees();
		boolean flag = list.isEmpty();
		assertFalse(flag);
	}

	@Test
	@Commit
	void testUpdateEmployee() {
		Employee emp = new Employee(205,"BatMan",50000);
		Employee e1 = service.updateEmployee(emp);
		assertEquals("BatMan",e1.getEname());
		//fail("Not yet implemented");
	}

}
