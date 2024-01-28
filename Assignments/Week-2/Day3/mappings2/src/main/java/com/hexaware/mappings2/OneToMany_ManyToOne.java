package com.hexaware.mappings2;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings2.entities.Author;
import com.hexaware.mappings2.entities.Book;

public class OneToMany_ManyToOne
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactoryBuilder();
    	Session session = sessionFactory.openSession();
    	System.out.println(session);
    	Author au = new Author();
    	
    	Book book1 = new Book();
    	Book book2 = new Book();
    	au.setAuthorName("APJ ABDUL KALAM");
    	book1.setTitle("Wings of Fire");
    	book2.setTitle("Ignited Minds");
    	au.addBook(book1);
    	au.addBook(book2);
    	Transaction txn = session.beginTransaction();
    	session.persist(au);
    	
    	txn.commit();
    	
    	
    }
}
