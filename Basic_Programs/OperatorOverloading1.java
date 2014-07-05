/*
	Operator Overloading By changing the datatype.
*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

	 
class OperatorOverloading1{  
  	void sum(int a,int b){
  		System.out.println(a+b);
  	}  
  	void sum(double a,double b){
  		System.out.println(a+b);
  	}  
  
  	public static void main(String args[]){  
  		OperatorOverloading1 obj=new OperatorOverloading1();  
  		obj.sum(10.5,10.5);  
 		obj.sum(20,20);  
   	 }  
}  
