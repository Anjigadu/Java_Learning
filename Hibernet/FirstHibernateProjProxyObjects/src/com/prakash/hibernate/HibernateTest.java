package com.prakash.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.prakash.hibernate.dto.Address;
import com.prakash.hibernate.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails obj = new UserDetails();
		obj.setUserName("Prakash Ranjan");
		
		
		Address addr1 = new Address();
		addr1.setCity("bangalore");
		addr1.setPincode("560035");
		addr1.setState("Karnataka");
		addr1.setStreet("Sarjapur");
		
		Address addr2 = new Address();
		addr2.setCity("Patna");
		addr2.setPincode("560057");
		addr2.setState("Bihar");
		addr2.setStreet("BoringRoad");
		
		
		Address addr3 = new Address();
		addr3.setCity("Patna");
		addr3.setPincode("560058");
		addr3.setState("Jharkhand");
		addr3.setStreet("Chandrapura");
		
		
		obj.getListOfAddress().add(addr1);
		obj.getListOfAddress().add(addr2);
		obj.getListOfAddress().add(addr3);

		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.save(obj);
		
		session.getTransaction().commit();
		
		session.close();
		
		obj = null;
		session = sessionFactory.openSession();
		obj = (UserDetails) session.get(UserDetails.class, 1);
		session.close();
		System.out.println(obj.getListOfAddress().size());
		
		
		
	}
}
