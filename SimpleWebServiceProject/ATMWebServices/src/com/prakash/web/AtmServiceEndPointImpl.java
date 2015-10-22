package com.prakash.web;

import javax.jws.WebService;


import com.prakash.bussiness.ATMServiceImpl;

@WebService(endpointInterface = "com.prakash.web.HelloWorld",
serviceName="HelloWorld")

public class AtmServiceEndPointImpl implements AtmServiceEndPoint{
	
	
	public String SayHello(String name){
		return "Hello world from " + name;
	}
	
	public String AddAccount(int accountNum, String AccountName, int Pin){
		ATMServiceImpl account = new ATMServiceImpl();
		account.AddAccount(accountNum, AccountName, Pin);
		
		return "Success";
	}
	
	
	public String WithdrawMoney(int accountNum, int Pin, int Money){
		ATMServiceImpl account = new ATMServiceImpl();
		account.WithdrawMoney(accountNum, Pin, Money);
		
		return "PASS";
	}
	
	
}
