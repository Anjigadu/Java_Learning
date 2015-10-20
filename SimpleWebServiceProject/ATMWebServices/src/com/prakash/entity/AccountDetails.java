/* psql -U postgres
 * dell_123
 * 
 */

package com.prakash.entity;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class AccountDetails {
	@Id
	private int accountNum;
	private String accountName;
	private long balance;
	private int pin;
	
	
	public int getAccountNum() {
		return accountNum;
	}
	
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public int getPin() {
		return pin;
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}
	

}
