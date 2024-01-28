package com.hexaware.ecom;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexaware.ecom.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactoryBuilder();
    	Session session = sessionFactory.openSession();
    	System.out.println(session);
    }
}
