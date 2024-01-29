package com.hexaware.springbootweb.dao;

import java.util.List;

import com.hexaware.springbootweb.entity.Employee;

public interface IEmployeedao {
	
	public String addEmployee(Employee emp);
	public List<Employee> getAll();
	public String updateEmployee(Employee emp);
	public String deleteEmployee(int eid); 
	public Employee selectByEmployeeId(int eid);

}
