package com.hexaware.mappings2;

import java.time.LocalDate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings2.entities.Address;
import com.hexaware.mappings2.entities.ShippingDetails;

public class OneToOne 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactoryBuilder();
    	Session session = sessionFactory.openSession();
    	System.out.println(session);
    	Address address = new Address();
    	address.setAddress_ID(1);
    	address.setAddress_Line1("ABC Colony");
    	address.setAddress_Line2("DEF Nagar");
    	address.setHouseNo("GHI");
    	address.setCity("JKL");
    	address.setCountry("MNO");
    	address.setState("PQR");
    	address.setPostalCode(555666);
    	ShippingDetails SD = new ShippingDetails();
    	SD.setShippingDetails_ID(101);
    	SD.setOrder_ID(201);
    	SD.setDeliveryDate(LocalDate.now());
    	SD.setAddress(address);
    	Transaction txn = session.beginTransaction();
    	session.persist(SD);
    	txn.commit();
    	
    	
    }
}
