package com.hexaware.springboot1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hexaware.springboot1.entity.Employee;
import com.hexaware.springboot1.service.EmpServiceImpl;

@SpringBootApplication
public class Springboot1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springboot1Application.class, args);
		System.out.println(context);
		EmpServiceImpl service = context.getBean(EmpServiceImpl.class);
		Employee emp = new Employee();
		emp.setEid(101);
		emp.setEname("KING");
		emp.setEid(40000);
		System.out.println(service.welcomeEmp(emp));
		
	}

}
