package Assignments.Assignments201to246.Assignments221to230;
/*
This assignment is about another calculator class.
this time we will calculate two attributes x and y and put the result in an attribute named result.

x, y and results are all private attributes of int type.

3 Instance variables:
  1) names: x, y, result
  	type: int
  	Visibility/Access modifier: private

Instance Methods:
   - getResult() - getter method for private result
   - setY(int y) - setter method for private y
   - setX(int x) - setter method for private x
 -  void plus() - adds x and y (x+y) values and assigns to result
   - void minus() - subtracts x and y(x-y) values and assigns to result

example:
  Calc a = new Calc();
  a.setX(10);
  a.setY(5);
  a.minus();
  System.out.println(a.getResult());
  prints: 5
  a.plus();
  System.out.println(a.getResult());
  prints: 15

NOTE: Must create 2 class files for this assignment
class Main {  // don't change class Main
  public static void main(String[] args) {
  Calc a = new Calc();
  a.setX(1);
  a.setY(1);
  a.plus();
  System.out.println("1+1 = "+ a.getResult());//1+1 = 2
  }
}
class Calc {
  //Write code here

}
 */
public class A222 { // don't change class Main
    public static void main(String[] args) {
        Calc a = new Calc();
        a.setX(1);
        a.setY(1);
        a.plus();
        System.out.println("1+1 = "+ a.getResult());//1+1 = 2
    }
}
class Calc {
    //Write code here
    private int x, y, result;

    public int getResult() {
        return result;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    void plus() {
        result = x + y;
    }

    void minus() {
        result = x - y;
    }
}
