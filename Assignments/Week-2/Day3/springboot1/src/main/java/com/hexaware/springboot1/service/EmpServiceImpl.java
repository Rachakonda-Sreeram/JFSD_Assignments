package com.hexaware.springboot1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springboot1.dao.IEmpdao;
import com.hexaware.springboot1.entity.Employee;

@Service
public class EmpServiceImpl implements IEmpService{

	@Autowired
	IEmpdao dao;
	@Override
	public String welcomeEmp(Employee emp) {
		// TODO Auto-generated method stub
		return dao.welcomeEmp(emp);
	}

}
