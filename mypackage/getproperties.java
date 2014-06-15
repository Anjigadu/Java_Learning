/*
 http://www.studytonight.com/java/package-in-java.php

 Java - >  Built in packages  
		1. lang
		2. util
		3. io
		4. net
		5. awt
 
 
 import ->
	import keyword is used to import the built in and user 
	defined packages into your java source code.

Note:
import statement is used after the package statement.	
 

To Read and understand: 
	Static import
	
 */
package mypackage;  // Creating a  package using package keyword.
public class getproperties {
   public static void main(String[] a) {
      setProgramInfo();
      printMessage();
   }
   public static void setProgramInfo() {
      // Modifying a system property
      System.setProperty("java.io.tmpdir","c:\\var\\tmp");
      // Adding my own properties
      System.setProperty("program.name","Property Test");
      System.setProperty("program.version","3.01");
   }
   public static void printMessage() {
      String userName = System.getProperty("user.name");
      String programName = System.getProperty("program.name");
      String programVersion = System.getProperty("program.version");
      String ioTempDir = System.getProperty("java.io.tmpdir");
      System.out.println("Hello "+userName+",");
      System.out.println("");
      System.out.println("Welcome to \""+programName+", "
         +programVersion+"\".");
      System.out.println("Note that the Java I/O "
         +" temporary directory is located at "+ioTempDir+".");
   }
}