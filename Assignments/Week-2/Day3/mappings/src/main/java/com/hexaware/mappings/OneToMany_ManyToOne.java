package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entities.Department;
import com.hexaware.mappings.entities.Employee;

public class OneToMany_ManyToOne {
	
	 public static void main( String[] args )
	    {
	       // System.out.println( "Hello World!" );
	    	SessionFactory sessionFactory = HibernateUtil.getSessionFactoryBuilder();
	    	Session session = sessionFactory.openSession();
	    	System.out.println(session);
	    	Transaction txn = session.beginTransaction();
	    	Employee e1 = new Employee(2101,"King",55000.0);
	    	Employee e2 = new Employee(2102,"Smith",45000.0);
	    	Employee e3 = new Employee(2103,"Ford",35000.0);
	    	Department d = new Department();
	    	d.setDepartmentID(201);
	    	d.setDepartmentName("Development");
	    	d.addEmployee(e1);
	    	d.addEmployee(e2);
	    	d.addEmployee(e3);
	    	session.persist(d);
	    	txn.commit();
	    	
	    	
	    	
	    }

}
	 
