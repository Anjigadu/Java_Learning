package com.prakash.DAO;

import com.prakash.entity.AccountDetails;

public interface AccountDetailsDAO {
	public String AddAccount(int accountNum, String AccountName, int Pin);
	public String DeleteAccount(int accountNum, String AccountName, int Pin);
	public AccountDetails ReadAccount(int accountNum, int Pin);
	

}
