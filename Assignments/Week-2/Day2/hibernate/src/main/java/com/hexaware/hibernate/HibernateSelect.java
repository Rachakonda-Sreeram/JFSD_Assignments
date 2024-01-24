package com.hexaware.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.hexaware.hibernate.entity.Employee;

public class HibernateSelect {
	
	public static void main(String args[]) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactoryBuilder();
		Session session = sessionFactory.openSession();
    	System.out.println(session);
    	
    	// HQL
   	String selectQuery = "select e from Employee e";// select all
    	
    	
    	
    	Query<Employee> q = session.createQuery(selectQuery);
    	
    	List<Employee> list = q.getResultList();
		for(Employee i:list) {
			System.out.println(i);
		}
		String selectSal = "select e from Employee e where e.salary > ?1";
    	Query<Employee> q1 = session.createQuery(selectSal,Employee.class);
    	q1.setParameter(1,30000.0);
    	
		List<Employee> list1 = q1.getResultList();
		for(Employee i:list1) {
			System.out.println(i);
		}
		
		String sQ = "select e from Employee e where e.eid = :empid";
		Query<Employee> query2 = session.createQuery(sQ);
		query2.setParameter("empid",102);
		System.out.println(query2.getResultList());
		
		String selectName = "select e from Employee e where e.ename = :ename";
		Query<Employee> q2 = session.createQuery(selectName);
		q2.setParameter("ename", "Smith");
		System.out.println(q2.getSingleResult());
		
		String nQuery = "select * from employee e";
		NativeQuery<Employee> q3 = session.createNativeQuery(nQuery);
		List<Employee> listn = q3.list();
		System.out.println(listn);	
		
	}

}
