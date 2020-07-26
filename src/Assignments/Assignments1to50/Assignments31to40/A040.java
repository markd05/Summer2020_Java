package Assignments.Assignments1to50.Assignments31to40;
import java.util.Scanner;
public class A040 {
    /*
    In this assignment you will create a Scanner object and ask user to enter 3 number inputs.
-Declare integer variables num1, num2, num3, sum.
-Create a Scanner object named scan.
-Display prompt "Enter 3 numbers:"
-Using scanner object let user input 3 numbers
-Add 3 numbers and assign to sum variable
-Print "Sum of numbers: ValueOfSum"

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	//WRITE YOUR CODE HERE:

  }
}
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int sum = a + b + c;
        System.out.println("Sum of numbers: " + sum);
    }
}
