package com.hexaware.hibernate;

import java.util.List;

import com.hexaware.hibernate.entity.Employee;

public class NamedQueryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDao dao = new EmployeeDao();
		List<Employee> list =	dao.geAllEmployees();
			
			System.out.println("Employees from Named Query");
			
			System.out.println(list);	
			
			
					Employee emp =	dao.getEmployeeByName();
					
					System.out.println(emp);
					List<Employee> e = dao.getEmployeesBySal();
					System.out.println(e);

	}

}
