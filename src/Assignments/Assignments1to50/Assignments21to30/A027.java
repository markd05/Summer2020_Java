package Assignments.Assignments1to50.Assignments21to30;
import java.util.Scanner;
public class A027 {
    /*
    U have an Integer number already declared and assigned value.
Using conditional statements, check if number is odd or even. Please follow the below examples and print message accordingly:
Enter a number:
10
10 is even

Enter a number:
33
33 is odd

Enter a number:
0
0 is even

import java.util.*;

public class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number:");
	int number = input.nextInt();
	//CODE HERE

  }
}
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        //CODE HERE
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
