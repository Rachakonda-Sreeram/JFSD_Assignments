package com.hexaware.springrestdemo.repository;


import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.springrestdemo.entity.Employee;


public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setEid(rs.getInt("eid"));
		employee.setEname(rs.getString("ename") );
		employee.setSalary(rs.getDouble("salary"));
		return employee;
	}
	
	

	
}
