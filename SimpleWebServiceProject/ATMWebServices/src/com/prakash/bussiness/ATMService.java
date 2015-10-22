package com.prakash.bussiness;

public interface ATMService {
	
	public String AddAccount(int accountNum, String AccountName, int Pin);
	public String WithdrawMoney(int accountNum, int Pin, int Money);

}
