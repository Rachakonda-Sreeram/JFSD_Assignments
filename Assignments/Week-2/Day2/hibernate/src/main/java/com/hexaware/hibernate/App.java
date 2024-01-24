package com.hexaware.hibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernate.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactoryBuilder();
       // System.out.println( "Hello World!" );
    	Session session = sessionFactory.openSession();
    	System.out.println(session);
    	
    	Employee emp = new Employee(101,"King",50000);
	/*
	 * Employee emp2 = new Employee(102,"Adam",30000); Employee emp3 = new
	 * Employee(103,"Ford",20000); Employee emp4 = new Employee(104,"Smith",40000);
	 * session.save(emp2); session.save(emp3); session.save(emp4);
	 */
    	
    	Transaction txn = session.beginTransaction();
    	//Serializable ser = session.save(emp); // insert or update
    	//System.out.println(ser.toString());
		/*
		 * Employee emp1 = session.get(Employee.class,101); System.out.println(emp1);
		 * emp1.setEname("King Khan"); emp1.setSalary(60000); Serializable ser =
		 * session.save(emp1); // insert or update System.out.println(ser.toString());
		 */
    	session.delete(emp);
    	//Employee e = new Employee(103,"John",25000);
    	//session.saveOrUpdate(e);
    	txn.commit();
    }
}
