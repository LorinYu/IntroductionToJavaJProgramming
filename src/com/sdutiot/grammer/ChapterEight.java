package com.sdutiot.grammer;

public class ChapterEight {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    function4();
  }
  
  public static void function1() {
    String message = new String("welcome to java!");
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
}
