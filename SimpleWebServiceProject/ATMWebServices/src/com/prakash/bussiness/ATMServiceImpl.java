package com.prakash.bussiness;

import com.prakash.DAO.AccountDetailsDAOImpl;


public class ATMServiceImpl implements ATMService{
	
	public String AddAccount(int accountNum, String AccountName, int Pin){
		
		AccountDetailsDAOImpl obj = new AccountDetailsDAOImpl();
		obj.AddAccount(accountNum, AccountName, Pin);
		return "PASS";
	}

}
