package com.hibernate.chap1;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class RunEmployee {

	private static SessionFactory factory;
	public static void main(String[] args) {
		
		try {
	         factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	      } catch (HibernateException ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	      }
		
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		Employee alex = new Employee();
		alex.setEmpId(10);
		alex.setEmpName("Alex");
		
		session.save(alex);
		session.getTransaction().commit();
		
		session.close();
		

	}

}
