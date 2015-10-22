package com.prakash.bussiness;

import com.prakash.DAO.AccountDetailsDAOImpl;
import com.prakash.entity.AccountDetails;


public class ATMServiceImpl implements ATMService{
	
	public String AddAccount(int accountNum, String AccountName, int Pin){
		
		AccountDetailsDAOImpl obj = new AccountDetailsDAOImpl();
		obj.AddAccount(accountNum, AccountName, Pin);
		return "PASS";
	}
	
	
	public String WithdrawMoney(int accountNum, int pin, int money){
		AccountDetailsDAOImpl obj = new AccountDetailsDAOImpl();
		AccountDetails acc = obj.ReadAccount(accountNum, pin);
		if(acc.getBalance() < money){
			System.out.print("Insufficient money\n");
		}else{
			System.out.println("===================================");
			System.out.println("===================================");
			System.out.print(acc.getAccountName());
			long temp = acc.getBalance();
			temp = temp - money;
			acc.setBalance(temp);
		}
		
		
		return "PASS";
	}

}
