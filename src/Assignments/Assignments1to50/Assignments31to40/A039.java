package Assignments.Assignments1to50.Assignments31to40;
import java.util.Scanner;
public class A039 {
    /*
    Write an expression using the conditional operator (? :) that compares the values of the variables num1 and num2. The result (that is the value) of this expression should be the value of the larger of the two variables.  Larger value should be printed out.

import java.util.*;

class Main {
  public static void main(String[] args) {
	//DO NOT CHANGE
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number1:");
int num1 = scan.nextInt();
System.out.println("Enter number2:");
int num2 = scan.nextInt();
//WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number2:");
        int num2 = scan.nextInt();
        //WRITE YOUR CODE HERE
        String num = (num1 > num2)? num1 + " is the larger value": num2 + " is the larger value";
        System.out.println(num);
    }
}
