package com.hexaware.mappings;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entities.Order;
import com.hexaware.mappings.entities.Product;

public class ManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactoryBuilder();
    	Session session = sessionFactory.openSession();
    	System.out.println(session);
    	Transaction txn = session.beginTransaction();
    	Product p = new Product();
    	p.setProductID(100);
    	p.setProductName("p");
    	Product p1 = new Product();
    	p1.setProductID(101);
    	p1.setProductName("p1");
    	Product p2 = new Product();
    	p2.setProductID(102);
    	p2.setProductName("p2");
    	Order o =  new Order();
    	o.setOrderID(200);
    	o.setDate(LocalDate.now());
    	o.addProduct(p);
    	Order o1 =  new Order();
    	o1.setOrderID(201);
    	o1.setDate(LocalDate.now());
    	o1.addProduct(p);
    	o1.addProduct(p1);
    	o1.addProduct(p2);
    	session.persist(o);
    	session.persist(o1);
    	txn.commit();
    	session.close();
	}

}
