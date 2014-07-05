/*
	Example of objects creation in java
*/


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

	 
class ObjectCreation{  
 	int length;  
 	int width;  
  
 	void insert(int l,int w){  
  		length=l;  
  		width=w;  
 	}  
  
 	void calculateArea(){
 		System.out.println(length*width);
 	}  
  
 	public static void main(String args[]){  
  		ObjectCreation r1=new ObjectCreation(),r2=new ObjectCreation();//creating two objects  
  		r1.insert(11,5);  
  		r2.insert(3,15);  
  
  		r1.calculateArea();  
  		r2.calculateArea();  

 	}
}