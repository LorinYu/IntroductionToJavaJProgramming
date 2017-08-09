package com.sdutiot.grammer;

import java.util.*;

public class ChapterSeventeen {

  public static void main(String[] args) {
    function1();
  }
  
  public static void function1() {
    Scanner scanner = new Scanner(System.in);
    boolean continueInput = true;
    
    do {
      try {
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
      
        //display the result 
        System.out.println("The number entered is " + number);
        continueInput = false;
        //scanner.close();
      }
      catch (InputMismatchException ex) {
        System.out.println("incorrect input; an integer is rquired.");
        scanner.nextLine();
      }
    } while (continueInput);
    scanner.close();
  }
}