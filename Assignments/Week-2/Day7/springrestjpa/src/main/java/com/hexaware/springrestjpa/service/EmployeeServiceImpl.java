package com.hexaware.springrestjpa.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.hexaware.springrestjpa.entities.Employee;
import com.hexaware.springrestjpa.repository.EmployeeRepositoryInterface;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	
	Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
	EmployeeRepositoryInterface repo;

	@Override
	@Transactional
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		logger.info("ADD EMPLOYEE EXCECUTED");
		return repo.save(emp);
	}

	@Override
	public Employee getEmployeeById(int eid) {
		// TODO Auto-generated method stub
	return repo.findById(eid).orElse(null);
	
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	@Override
	public String deleteEmployee(int eid) {
		// TODO Auto-generated method stub
		repo.deleteById(eid);
		return "Record Deleted";
	}

	@Override
	public List<Employee> getByEname(String ename) {
		// TODO Auto-generated method stub
		return repo.findByEname(ename);
	}

	@Override
	public List<Employee> getBySalaryGreaterThan(double salary) {
		// TODO Auto-generated method stub
		return repo.findBySalaryGreaterThan(salary);
	}
	@Override
	public List<Employee> getBySalarySorted() {
		// TODO Auto-generated method stub
		//repo.findAll(Sort.by(Order.asc("salary")));
		
		return repo.findAll(Sort.by("salary"));
	}

	@Override
	public List<Employee> getSalaryRange(double min, double max) {
		// TODO Auto-generated method stub
		
		return repo.getSalaryRange(min, max);
	}

	@Override
	public int deleteByEname(String ename) {
		// TODO Auto-generated method stub
		return repo.deleteByEname(ename);
	}
	
	public static boolean isValidEmployeeData(Employee emp) {
	    return emp.getEid() > 100 && emp.getSalary() > 10000 && emp.getEname().equals(emp.getEname().toUpperCase());
	}


}
