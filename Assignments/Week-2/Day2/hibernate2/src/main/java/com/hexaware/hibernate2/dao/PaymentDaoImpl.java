package com.hexaware.hibernate2.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernate2.HibernateUtil;
import com.hexaware.hibernate2.entity.Payment;

public class PaymentDaoImpl implements IPaymentDao {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactoryBuilder();
    Session session = sessionFactory.openSession();
    @Override
    public Payment createPayment(Payment pay) {
    	
        	Transaction transaction = session.beginTransaction();
            Serializable identifier = session.save(pay);
            transaction.commit();
            Payment insert = session.get(Payment.class, identifier);
        

        return insert;
    }


	

	@Override
	public List<Payment> selectPaymentsByPayment_Type(String payment_Type) {
		// TODO Auto-generated method stub
		Query query = session.createNamedQuery("selectPaymentsByPayment_Type");
		query.setParameter("type", payment_Type);
		List<Payment> p =  query.getResultList();
		return p;

	}

	@Override
	public List<Payment> selectAllPayments() {
		// TODO Auto-generated method stub
		Query query = session.createNamedQuery("selectAllPayments");

		List<Payment> list = query.getResultList();

		return list;
		
	}




	@Override
	public boolean deletePaymentByID(int payment_ID) {
		Transaction transaction = session.beginTransaction();
		Payment delete = session.get(Payment.class, payment_ID);
		if(delete != null) {
		session.delete(delete);
		transaction.commit();
		return true;
		}
		return false;
		
		
	    
	}




	@Override
	public boolean updatePayment(Payment updatedPayment) {
	    Transaction transaction = null;
	        transaction = session.beginTransaction();
	        session.saveOrUpdate(updatedPayment);
	        transaction.commit();
	        return true;
	

}
}
