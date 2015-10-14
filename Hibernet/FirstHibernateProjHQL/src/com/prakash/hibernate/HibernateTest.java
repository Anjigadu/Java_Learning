package com.prakash.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.prakash.hibernate.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from UserDetails where userId > 1");
		List <UserDetails> users = (List<UserDetails>) query.list();
		
		System.out.println("Number of Items pulled from database: " + users.size());
		
		for (UserDetails u : users){
			System.out.println(u.getUserName());
		}
		
		query.setFirstResult(3);
		query.setMaxResults(4);
		
		List <UserDetails> secondusers = (List<UserDetails>) query.list();
		
		System.out.println("Number of Items pulled from database: " + secondusers.size());
		
		for (UserDetails u : secondusers){
			System.out.println(u.getUserName());
		}
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println("Number of Items pulled from database: " + users.size());
		
		for (UserDetails u : users){
			System.out.println(u.getUserName());
		}
	}
}