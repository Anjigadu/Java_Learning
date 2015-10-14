package com.prakash.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.prakash.hibernate.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails obj = new UserDetails();
		obj.setUserId(4);
		obj.setUserName("Santu Ranjan");
		obj.setAddress("Bangalore");
		obj.setDescription("Engineer");
		obj.setJoinedDate(new Date());

		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
		session.close();

		// Opening a new session and retrieving the object from database

		obj = null;

		session = sessionFactory.openSession();
		session.beginTransaction();
		
		obj = (UserDetails)session.get(UserDetails.class, 4);
		
		System.out.println(obj.getUserName());
		
		
	}
}
