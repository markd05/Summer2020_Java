package Assignments.Assignments1to50.Assignments41to50;
import java.util.Scanner;
public class A048 {
    /*
     Write a program that will print a week day according to the day number. Use switch statement.
Example
Display message: "Enter number:"
1
Display message: "Monday"

import java.util.*;

public class Main {
  public static void main(String[] args) {
	//WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
