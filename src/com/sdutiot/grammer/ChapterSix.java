package com.sdutiot.grammer;

public class ChapterSix {

  public static void main(String[] args) {
    
    //int i = linerSearch(list, 4);  
    //System.out.println(i);
  }
  
  public void arrayvariableClaim() {
    //数组变量必须先声明 
    double myList[];
    //创建数组变量,并且赋值给myList
    myList = new double[5];
    //声明，创建和赋值可以用一条语句完成
    double[] myList1 = new double[10];
    //double[] myList;
    System.out.println(myList.length);
    System.out.println(myList1.length);
  }
  
  public void arrayInitializer() {
    double[] myList1 =  {1.1,2.2,3.3,4.4};
    for (double element: myList1) {
      System.out.println(element);
    }
  }
  
  // 实参传递给方法时，如果参数是基本数据类型，则传递实参的值，
  // 如果参数是数组类型，则传递的是数组的引用。
  /*
  public static int linerSearch(int[] list, int key) {
    for (int i = 0; i < list.length; i++) {
      if (key == list[i]) {
        return i;
      }
      return -1;
    }
  }
  */
  
}
