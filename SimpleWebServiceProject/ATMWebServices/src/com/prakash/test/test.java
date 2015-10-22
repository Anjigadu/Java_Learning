package com.prakash.test;
import com.prakash.web.AtmServiceEndPointImpl;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AtmServiceEndPointImpl testobj = new AtmServiceEndPointImpl();
		//int i =0;
		//for (i =0; i< 10 ; i++){
		//	System.out.print(testobj.AddAccount(i, "UserNum_" + i, 1234));
		//}
		
		testobj.WithdrawMoney(8, 1234, -1);
	}
}

