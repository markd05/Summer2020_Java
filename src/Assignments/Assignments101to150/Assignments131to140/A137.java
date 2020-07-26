package Assignments.Assignments101to150.Assignments131to140;

import java.util.Scanner;

public class A137 {
    /*
    Given method called cube. Write all required code inside this method in order
    to asks the user for a number and then prints the cubed value of that number:
Example:
input: 5
output: 125
hint: cube of a number n = n*n*n

class Main {
  public static void cube() {
	//your code here

  }//end your code here
  public static void main(String[] args) {
	cube();
  }
}
     */
    public static void cube() {
        //your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scan.nextInt();
        System.out.println(n*n*n);


    }//end your code here
    public static void main(String[] args) {
        cube();
    }
}
