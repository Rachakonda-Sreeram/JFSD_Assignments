package com.hexaware.springboot1.dao;

import org.springframework.stereotype.Repository;

import com.hexaware.springboot1.entity.Employee;

@Repository
public class EmpDaoImpl implements IEmpdao {

	@Override
	public String welcomeEmp(Employee emp) {
		// TODO Auto-generated method stub
		String welcome = "Hello Employee "+emp.getEname() ;
		return welcome;
	}
	
	

}
