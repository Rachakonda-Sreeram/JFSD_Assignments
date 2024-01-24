package com.hexaware.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hexaware.hibernate.entity.Employee;
public class EmployeeDao {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactoryBuilder();

	Session session = sessionFactory.openSession();

	public List<Employee> geAllEmployees() {

		Query query = session.createNamedQuery("geAllEmployees");

		List<Employee> list = query.getResultList();

		return list;
				
		}
	
	
	
		public  Employee  getEmployeeByName() {
			
			
			
			Query query = session.createNamedQuery("getEmployeeByName");
			
					query.setParameter("name", "Smith");
			
				Employee emp = (Employee) query.getSingleResult();
			
			return emp;
		}
		
		public List<Employee> getEmployeesBySal(){
			
			Query query = session.createNamedQuery("getEmployeesBySal");
			query.setParameter("sal", 20000.0);
			List<Employee> list = query.getResultList();

			return list;
					
			
		}
	
}
