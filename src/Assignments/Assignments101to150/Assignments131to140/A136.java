package Assignments.Assignments101to150.Assignments131to140;

import java.util.Scanner;

public class A136 {
    /*
    create a static method called "plus", its return is void and it gets no arguments.
It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within plus method.
Example:
enter first number:
1
enter second number:
2
result: 3

class Main {
  public static void main(String[] args) {
  	plus();
  }
  public static void plus(){
	//your code here

  }
}
     */
    public static void main(String[] args) {
        plus();
    }

    public static void plus(){
        //your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = scan.nextInt();
        System.out.println("Enter second number");
        int second = scan.nextInt();
        System.out.println("result: " + (first+second));

    }
}
