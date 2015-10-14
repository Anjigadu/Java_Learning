package com.prakash.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.prakash.hibernate.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		for (int i = 0; i < 10; i++){
			UserDetails user = new UserDetails();
			user.setUserName("Prakash Ranjan " + i );
			session.save(user);
		}
		
		session.getTransaction().commit();
		session.close();
		
		// Reading the data from database
		session = sessionFactory.openSession();
		session.beginTransaction();
		UserDetails user = (UserDetails) session.get(UserDetails.class, 6);
		session.delete(user);
		session.getTransaction().commit();
		session.close();
//		System.out.println("==============================================\n\n\n\n");
//		System.out.println(user.getUserName() );
//		
	}
}
