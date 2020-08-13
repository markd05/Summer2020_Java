package Assignments.Assignments201to246.Assignments221to230;
/*
Write the definition of a class Telephone.
The class has no constructors, one instance variable of type String called number, and two public static variables.
One is of type int called quantity, initialized to 250;
the other is of type double called total, initialized to 15658.92.
Create getNumber() and setNumber() methods that will manipulate with number instance variable.


NOTE: Must create 2 class files for this assignment
class Main {
  public static void main(String[] args) {
	// Test code here
  }
}
public class Telephone{
  //Write your code here

}
 */
class Main228 {
    public static void main(String[] args) {
        // Test code here
    }
}
public class Telephone{
    //Write your code here
    String number;
    public static int quantity = 250;
    public static double total = 15658.92;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
