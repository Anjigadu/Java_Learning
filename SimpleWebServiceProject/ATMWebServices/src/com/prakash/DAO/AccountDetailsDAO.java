package com.prakash.DAO;

public interface AccountDetailsDAO {
	public String AddAccount(int accountNum, String AccountName, int Pin);
	public String DeleteAccount(int accountNum, String AccountName, int Pin);
	public String ViewAccount(int accountNum, String AccountName, int Pin);

}
