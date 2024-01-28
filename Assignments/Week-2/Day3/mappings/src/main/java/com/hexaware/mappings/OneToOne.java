package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entities.Address;
import com.hexaware.mappings.entities.Student;

/**
 * Hello world!
 *
 */
public class OneToOne 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactoryBuilder();
    	Session session = sessionFactory.openSession();
    	System.out.println(session);
    	
    	//Address address = new Address(21,"Hyd");
    	//Student student = new Student(101,"raju",address);
    	//Address address = new Address(23,"Delhi");
    	//Student student = new Student(102,"Smith",address);
    	Student student = new Student(104,"king");
    	//Address address = new Address(24,"Chennai",student);
    	Address address = new Address();
    	address.setAddressID(25);
    	address.setCity("Mumbai");
    	address.setStudent(student);
    	Transaction txn = session.beginTransaction();
    	session.persist(address);
    	txn.commit();
    }
}
