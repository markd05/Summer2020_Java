package Assignments.Assignments201to246.Assignments201to210;

public class A203 {
    /*
    The LameCalculator class has instance methods that can do simple math operations on two numbers.
the methods are: plus, minus, multiply and divide .
all the methods get two ints then the method does the required math operation and returns the result as an int.

for example:
LameCalculator lc = new LameCalculator();
lc.plus(1,1)
returns:2
lc.minus(1,1)
returns:0
lc.multiply(2,1)
returns:2
lc.divide(10,2)
returns:5

NOTE: Must create 2 class files for this assignment
class Main {
  public static void main(String[] args) {
  LameCalculator lc = new LameCalculator();
  System.out.println("1+1 = "+lc.plus(1,1));
  System.out.println("2-3 = "+lc.minus(2,3));
  System.out.println("2x3 = "+lc.multiply(2,3));
  System.out.println("10:2 = "+lc.divide(10,2));
  }
}
class LameCalculator {
  //Write code here, remember to test

}
     */
    public static void main(String[] args) {
        LameCalculator lc = new LameCalculator();
        System.out.println("1+1 = "+lc.plus(1,1));
        System.out.println("2-3 = "+lc.minus(2,3));
        System.out.println("2x3 = "+lc.multiply(2,3));
        System.out.println("10:2 = "+lc.divide(10,2));
    }
}
class LameCalculator {
    //Write code here, remember to test
    int plus(int a, int b) {
        return a+b;
    }
    int minus(int a, int b) {
        return a-b;
    }
    int multiply(int a, int b) {
        return a*b;
    }
    int divide(int a, int b) {
        return a/b;
    }
}
