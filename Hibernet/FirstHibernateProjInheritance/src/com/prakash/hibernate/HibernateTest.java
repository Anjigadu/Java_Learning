package com.prakash.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.prakash.hibernate.dto.FourWheeler;
import com.prakash.hibernate.dto.TwoWheeler;
import com.prakash.hibernate.dto.UserDetails;
import com.prakash.hibernate.dto.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {

		Vehicle vehicle1 = new Vehicle();
		vehicle1.setVehicleName("Honda Amaze");

		
		TwoWheeler bike= new TwoWheeler();
		bike.setVehicleName("Yahama");
		bike.setSteeringHandle("Bike steering handle");
		
		
		FourWheeler car = new FourWheeler();
		car.setVehicleName("Honda City");
		car.setSteeringWheel("Car steering wheel");
		

		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(vehicle1);
		session.save(bike);
		session.save(car);
		session.getTransaction().commit();
		session.close();
		
	}
}
