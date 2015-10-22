package com.prakash.web;

import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.jws.WebService;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) //optional
public interface AtmServiceEndPoint {
	
	@WebMethod
	public String SayHello(String name);
	
	@WebMethod
	public String AddAccount(int accountNum, String AccountName, int Pin);
	
	@WebMethod
	public String WithdrawMoney(int accountNum, int Pin, int Money);
}
