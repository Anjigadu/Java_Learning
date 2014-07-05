/*
	OperatorOverloading by changing the number of arguments in method.
*/


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

	 
class OperatorOverloading{  
  	void sum(int a,int b){
  		System.out.println(a+b);	
  	}  
 	void sum(int a,int b,int c){
 		System.out.println(a+b+c);
 	}  
  
  	public static void main(String args[]){  
  		OperatorOverloading obj=new OperatorOverloading();  
  		obj.sum(10,10,10);  
  		obj.sum(20,20);  
   	 }  
}  