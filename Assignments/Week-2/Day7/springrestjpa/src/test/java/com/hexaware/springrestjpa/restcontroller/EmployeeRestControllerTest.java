package com.hexaware.springrestjpa.restcontroller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexaware.springrestjpa.entities.Employee;

import jakarta.transaction.Transactional;
@SpringBootTest
@Transactional
class EmployeeRestControllerTest {
	
	@Autowired
	RestTemplate restTemplate;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testInsertEmployee() {
		//fail("Not yet implemented");
		Employee emp = new Employee(402,"ABCDE",34000);
		ResponseEntity<Employee> response = restTemplate.postForEntity("http://localhost:8080/api/employees/add", emp, Employee.class);
		Employee e = response.getBody();
		assertEquals(402,e.getEid());
	}

	@Test
	void testUpdateEmployee() {
		Employee emp = new Employee(301,"SEHWAG",45000);
		ResponseEntity<Employee> response = restTemplate.postForEntity("http://localhost:8080/api/employees/add", emp, Employee.class);
		Employee e = response.getBody();
		e.setSalary(50000);
		restTemplate.put("http://localhost:8080/api/employees/update",e);
		ResponseEntity<Employee> updatedResponse = restTemplate.getForEntity("http://localhost:8080/api/employees/get/{eid}", Employee.class,e.getEid());
		Employee updated = updatedResponse.getBody();
		assertEquals(50000, updated.getSalary());
		//fail("Not yet implemented");
	}

	@Test
	void testGetEmployeeById() {
		//fail("Not yet implemented");
		int eid = 401;
		ResponseEntity<Employee> response = restTemplate.getForEntity("http://localhost:8080/api/employees/get/"+eid,Employee.class);
		Employee emp = response.getBody();
		assertNotNull(emp);
		assertEquals(401,emp.getEid());
	}
	
	@Test
	void testGetAll() {
		ResponseEntity<List> response = 
				restTemplate.getForEntity("http://localhost:8080/api/employees/getAll",List.class);
		List<Employee> list = response.getBody();
		assertTrue(list.size() > 0);
	}

}
