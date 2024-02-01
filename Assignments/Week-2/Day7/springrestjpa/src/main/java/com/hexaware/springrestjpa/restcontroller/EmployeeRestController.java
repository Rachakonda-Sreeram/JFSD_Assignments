package com.hexaware.springrestjpa.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestjpa.entities.Employee;
import com.hexaware.springrestjpa.exception.EmployeeNotFound;
import com.hexaware.springrestjpa.service.EmployeeServiceImpl;
import com.hexaware.springrestjpa.service.IEmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
	
	Logger logger = LoggerFactory.getLogger(EmployeeRestController.class);
	
	@Autowired
	IEmployeeService service;
	
	@PostMapping("/add")
	public Employee insertEmployee(@RequestBody Employee emp) {
		
		boolean isValid = EmployeeServiceImpl.isValidEmployeeData(emp);
		logger.info("Employee Rest Controller excecuted");
		Employee emp1 = null;
		if(isValid) {
			emp1 = service.addEmployee(emp);
			logger.warn("Employee object is not null in rest controler");
		}
		logger.debug("debugger");
		return emp1;
		
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody @Valid Employee emp) {
		
		
		return service.updateEmployee(emp);
		
	}
	
	@GetMapping("/get/{eid}")
	public Employee getEmployeeById(@PathVariable int eid) throws EmployeeNotFound {
		Employee emp =  service.getEmployeeById(eid);
		if(emp == null) {
			throw new EmployeeNotFound();
		}
		return emp;
	}
	
	@DeleteMapping("/delete/{eid}")
	public String deleteEmployeeById(@PathVariable int eid) {
		
		return service.deleteEmployee(eid);
	}
	
	@GetMapping("/getbyename/{ename}")
	public List<Employee> getByEname(@PathVariable String ename) {
		return service.getByEname(ename);
	}
	
	
	@GetMapping("/getAll")
	public List<Employee> getAll() {
		return service.getAllEmployees();
	}
	
	
	
	@GetMapping("/getbysalarygt/{salary}")
	public List<Employee> getBySalarygt(@PathVariable double salary) {
		return service.getBySalaryGreaterThan(salary);
	}
	
	@GetMapping("/getbysalarysorted")
	public List<Employee> getBySalarysorted() {
		return service.getBySalarySorted();
	}
	
	@GetMapping("/getsalarybyrange/{min}/{max}")
	public List<Employee> getSalaryByRange(@PathVariable double min,@PathVariable double max) {
		return service.getSalaryRange(min,max);
	}
	
	@DeleteMapping("/deletebyename/{ename}")
	public String deleteEmployeebyname(@PathVariable String ename) {
		
		int count =  service.deleteByEname(ename);
		return count +"record deleted.";
	}
	
	
	
	

}
