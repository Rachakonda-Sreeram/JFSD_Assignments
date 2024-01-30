package com.hexaware.springrestdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrestdemo.entity.Employee;
import com.hexaware.springrestdemo.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	IEmployeeRepository repo;

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repo.addEmployee(emp);
	}

	@Override
	public Employee getEmployeeById(int eid) {
		// TODO Auto-generated method stub
		return repo.getEmployeeById(eid);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.getAllEmployees();
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repo.updateEmployee(emp);
	}

	@Override
	public String deleteEmployee(int eid) {
		// TODO Auto-generated method stub
		return repo.deleteEmployee(eid);
	}

}
