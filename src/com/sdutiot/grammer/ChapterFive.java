package com.sdutiot.grammer;

public class ChapterFive {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int maxnum = max(3,5);
    System.out.println(maxnum);
  }
 
  public static int max(int num1,int num2) {
    int result;
    if (num1 > num2) 
      result = num1;
    else
      result = num2;
    
    return result;
    
  }
}
