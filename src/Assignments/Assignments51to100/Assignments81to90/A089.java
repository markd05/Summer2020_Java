package Assignments.Assignments51to100.Assignments81to90;

import java.util.Scanner;

public class A089 {
    /*
    calculate the multiplied sum of all the numbers up to the n variable.

for example:

n=2

sum = 1*2 = 2

n=3

sum = 1*2*3 = 6

n = 5
 sum = 1*2*3*4*5 = 120

hint: use a loop, and set sum and i (loop iterator) to one at the start

import java.util.*;
class Main {
  public static void main(String[] args) {
 	Scanner s = new Scanner(System.in);
	int n = s.nextInt();

	//your code here

  }
}
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        //your code here
        int total = n;
        for (int i = n; n > 0; n--) {
            if (total == n) {
                continue;
            }
            total *= n;
        }
        System.out.println(total);

    }
}
