package Assignments.Assignments101to150.Assignments141to150;

import java.util.Scanner;

public class A143 {
    /*
    Create a method called next3 .
    This method gets an int argument and prints the next 3 numbers after that number.
    Call the method from main method and pass num to it.
enter number
1
next 3 are:
2 3 4
(put a space between numbers)

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
 	Scanner inp = new Scanner(System.in);
 	System.out.print("enter number");
 	int num = inp.nextInt();
 	next3(num);
  }
  //your code here

}
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();
        next3(num);
    }
    //your code here
    public static void next3(int a) {
        System.out.println("Next 3 are: \n" + (a+1) + " " + (a+2) + " " + (a+3));
    }
}
