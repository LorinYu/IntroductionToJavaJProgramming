package com.sdutiot.grammer;

public class ChapterSix {

  public static void main(String[] args) {
    
    //int i = linerSearch(list, 4);  
    //System.out.println(i);
  }
  
  public void arrayvariableClaim() {
    //����������������� 
    double myList[];
    //�����������,���Ҹ�ֵ��myList
    myList = new double[5];
    //�����������͸�ֵ������һ��������
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
  
  // ʵ�δ��ݸ�����ʱ����������ǻ����������ͣ��򴫵�ʵ�ε�ֵ��
  // ����������������ͣ��򴫵ݵ�����������á�
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
