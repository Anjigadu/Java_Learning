/* PropertyTest.java
 - Copyright (c) 2014, HerongYang.com, All Rights Reserved.
 */

package mypackage;
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