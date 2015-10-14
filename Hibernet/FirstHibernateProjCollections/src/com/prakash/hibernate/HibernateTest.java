package com.prakash.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.prakash.hibernate.dto.Address;
import com.prakash.hibernate.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails obj = new UserDetails();
		//obj.setUserId(1);
		obj.setUserName("Prakash Ranjan");
		
		UserDetails obj2 = new UserDetails();
		obj2.setUserName("Vikash Ranjan");
		
		Address addr = new Address();
		addr.setCity("bangalore");
		addr.setPincode("560035");
		addr.setState("Karnataka");
		addr.setStreet("Sarjapur");
		
		Address addr1 = new Address();
		addr1.setCity("Patna");
		addr1.setPincode("560057");
		addr1.setState("Bihar");
		addr1.setStreet("BoringRoad");
		
		obj.getListOfAddress().add(addr);
		obj.getListOfAddress().add(addr1);
		
//		obj.setAddress(addr);
//		obj2.setAddress(addr1);
		
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
