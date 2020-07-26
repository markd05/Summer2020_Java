package Assignments.Assignments1to50.Assignments21to30;
import java.util.Scanner;
public class A028 {
    /*
    U have an Integer number already declared and assigned value.
Using Multi-Branch if statements, check if number is positive, negative or zero. Please follow the below examples and print message accordingly:
Enter a number:
10
10 is positive

Enter a number:
-55
-55 is negative

Enter a number:
0
it is zero

import java.util.*;

public class Main {
  public static void main(String[] args) {
	//DO NOT Change:
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number:");
	int number = input.nextInt();
	//write your CODE HERE:

  }
}
     */
    public static void main(String[] args) {
        //DO NOT Change:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        //write your CODE HERE:
        if (number == 0) {
            System.out.println("it is zero");
        } else if (number > 0) {
            System.out.println(number + "is positive");
        } else {
            System.out.println(number + "is negative");
        }
    }
}
