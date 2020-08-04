package Assignments.Assignments151to200.Assignments171to180;

public class A175 {
    /*
    A static method can be called through its class name
in the calculator class, please create plus and minus methods. so that it enables the codes in main class to compile
plus: gets two ints and returns the addition of the to numbers as an int

calc.plus(1,1)
returns:2
calc.plus(10,1)
returns:11

minus:  the same as plus its also static, but it returns the substructed value of the two ints it gets
calc.minus(1,1)
returns:0
calc.plus(10,1)
returns:9


NOTE: Must create 2 class files for this assignment
class Main {
  public static void main(String[] args) {
  System.out.println("1+1 = "+calc.plus(1,1) );
  System.out.println("1-1 = "+calc.minus(1,1) );
  }
}
class calc {
  //Write code here, remember to test
}
     */
    public static void main(String[] args) {
        System.out.println("1+1 = "+calc.plus(1,1) );
        System.out.println("1-1 = "+calc.minus(1,1) );
    }
}
class calc {
    //Write code here, remember to test
    public static int plus(int a, int b) {
        return a+b;
    }

    public static int minus(int a, int b) {
        return a-b;
    }
}
