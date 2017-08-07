package com.sdutiot.grammer;

public class ChapterSeven {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
  }
  
  public void function1() {
    java.util.Date date = new java.util.Date();
    System.out.println("the time since Jan 1,1970 is " + date.getTime() + " milliseconds");
    System.out.println(date.toString());
  }
 
  
  
  public class Circle3 {
    private double radius = 1.0;
    
    public Circle3(double newRadius) {
      radius = newRadius;
    }
    
    public double getRadius() {
      return radius;
    }
  }
  
  
}
