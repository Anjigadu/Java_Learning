package com.prakash.DAO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prakash.entity.AccountDetails;

public class AccountDetailsDAOImpl implements AccountDetailsDAO {

	public String AddAccount(int accountNum, String AccountName, int Pin){
		
		AccountDetails acc = new AccountDetails();
		acc.setAccountName(AccountName);
		acc.setAccountNum(accountNum);
		acc.setPin(Pin);
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.save(acc);

		session.getTransaction().commit();
		return "PASS";
	}
	
	public String DeleteAccount(int accountNum, String AccountName, int Pin){
		return "PASS";
		
	}
	
	public AccountDetails ReadAccount(int accountNum, int Pin){
		AccountDetails acc = new AccountDetails();
		acc.setAccountNum(accountNum);
		acc.setPin(Pin);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		
		acc = (AccountDetails) session.get(AccountDetails.class, 6);

		return acc;
		

	}

	
}
