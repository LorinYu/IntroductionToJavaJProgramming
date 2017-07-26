
public class ChapterSix {

  public static void main(String[] args) {
    //数组变量必须先声明 
    double myList[] = null;
    //创建数组变量,并且赋值给myList
    myList = new double[9];
    //声明，创建和赋值可以用一条语句完成
    double[] myList1 = new double[9];
    //System.out.println(myList1.length);
    //for (int i = 0;i <= myList1.length;i++) {
    for (double element: myList1) {
      System.out.println(element);
    }
    double[] myList3 =  {1.1,2.2,3.3,4.4};
  }
  // 实参传递给方法时，如果参数是基本数据类型，则传递实参的值，
  // 如果参数是数组类型，则传递的是数组的引用。
}
