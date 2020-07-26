package Assignments.Assignments51to100.Assignments91to100;

import java.util.Scanner;

public class A096 {
    /*
    you get a number, write a code that draws a rectangle outline the size of that number.
each rectangle row is 3 x: xxx
inner rectangle row is "x  x"

for example:

n = 2

xxx
x  x
x  x
xxx


n=3

xxx
x  x
x  x
x  x
xxx


import java.util.*;
class Main {
  public static void main(String[] args) {
 	Scanner s = new Scanner(System.in);
	int n = s.nextInt();

	//WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        //WRITE YOUR CODE HERE
        for (int i = 0; i <= n+1; i++) {
            if (i == 0 || i == n + 1) {
                System.out.println("***");
            } else {
                System.out.println("* *");
            }
        }

    }
}
