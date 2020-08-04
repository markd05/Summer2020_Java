package Assignments.Assignments151to200.Assignments181to190;

import java.util.Scanner;

public class A181 {
    /*
    You are given two inputs:
int num1;
int num2;
You can assume that the following:
num2 > num1 ==> TRUE

You are to write a program that will print out all the ODD numbers in between num1 and num2 inclusive.
Your output should all be on one line, separated by spaces.

Sample input/output:
#1: 3
#2: 11
3 5 7 9 11

#1: 4
#2: 20
5 7 9 11 13 15 17 19

#1: -2
#2: 6
-1 1 3 5

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("#1: ");
	int num1 = s.nextInt();
	System.out.print("#2: ");
	int num2 = s.nextInt();
	//Write code after this line

  }
}
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("#1: ");
        int num1 = s.nextInt();
        System.out.print("#2: ");
        int num2 = s.nextInt();
        String odd = "";
        //Write code after this line
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 1) {
                odd += "" + i +" ";
            }
        }
        System.out.print(odd.trim());
    }
}
