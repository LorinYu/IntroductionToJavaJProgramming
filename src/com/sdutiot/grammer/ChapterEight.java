package com.sdutiot.grammer;

import java.io.IOException; 

public class ChapterEight {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    function5();
  }
  
  public static void function1() {
    //String message = new String("welcome to java!");
    String s = "this is a dog.";
    s = "html";
    System.out.println(s.length());  
  }
  
  public static void function2() {
    String message = new String("welcome to java!");
    System.out.println(message.charAt(3));
  } 
  
  public static void function3() {
    String message = new String("   java!  ");
    message = message.trim();
    System.out.println(message);
  }
  
  public static void function4() {
    StringBuffer str = new StringBuffer();
    str = str.append("C");
    str = str.append("OS");
    str = str.append("!");
    str.insert(1, "ent");
    System.out.println(str);
  }
  public static void function5() {
    java.io.File file = new java.io.File("txt1.txt");
    try {  
      file.createNewFile(); // 创建文件  
    } catch (IOException e) {  
      e.printStackTrace();  
    }
    //System.out.println("does it exist? " + file.exists());
    //System.out.println("Can it be read? " + file.canRead());
    //System.out.println(new java.util.Date(file.lastModified()));
    //java.io.printWriter output = new java.io.PrintWriter(file);
  }
}
