package com.prakash.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.prakash.hibernate.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails obj = new UserDetails();
		//obj.setUserId(1);
		obj.setUserName("Prakash Ranjan");
		
		UserDetails obj2 = new UserDetails();
		obj2.setUserName("Vikash Ranjan");
		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.save(obj);
		session.save(obj2);
		session.getTransaction().commit();
		
		session.close();
	}
}
