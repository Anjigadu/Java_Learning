package com.prakash.test;
import com.prakash.web.HelloWorldImpl;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloWorldImpl testobj = new HelloWorldImpl();
		int i =0;
		for (i =0; i< 10 ; i++){
			System.out.print(testobj.AddAccount(1236, "Prakash Ranjan", 1234));
	
		}
	}
}
