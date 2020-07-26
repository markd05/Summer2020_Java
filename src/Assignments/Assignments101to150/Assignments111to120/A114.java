package Assignments.Assignments101to150.Assignments111to120;

import java.util.Scanner;

public class A114 {
    /*
    In mathematics, the factorial of a positive integer n, denoted by n!,
    is the product of all positive integers less than or equal to n.
    Calculate factorial and output result to the console.
Example:
input: 5
output: 120



public class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();

         //WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //WRITE YOUR CODE HERE
        int total;
        for (int i = n; i > 0; i--) {
            if (i == n) {
                continue;
            }
            n *= i;
        }
        System.out.println(n);

    }
}
