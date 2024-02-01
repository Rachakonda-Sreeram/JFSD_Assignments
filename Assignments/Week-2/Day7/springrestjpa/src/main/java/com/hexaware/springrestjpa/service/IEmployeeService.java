package com.hexaware.springrestjpa.service;

import java.util.List;

import com.hexaware.springrestjpa.entities.Employee;

public interface IEmployeeService {
	
	public Employee addEmployee(Employee emp);
	public Employee getEmployeeById(int eid);
	public List<Employee> getAllEmployees();
	public Employee updateEmployee(Employee emp);
	public String deleteEmployee(int eid);
	List<Employee> getByEname(String ename);
	List<Employee> getBySalaryGreaterThan(double salary);
	List<Employee> getBySalarySorted();
	List<Employee> getSalaryRange(double min,double max);
	public int deleteByEname(String ename);
}
