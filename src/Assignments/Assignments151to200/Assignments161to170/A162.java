package Assignments.Assignments151to200.Assignments161to170;

import java.util.Scanner;

public class A162 {
    /*
    Complete a method fib() that will compute Fibonacci numbers
In Fibonacci series, next number is the sum of previous two numbers
for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……...
The first two numbers of Fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.

Input  : 2
Output : 1
Input  : 9
Output : 34

import java.util.*;

public class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	fib(num);
  }

  public static void fib(int num){
	//WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int a = 0;
        int b = 1;
        for (int i = 1; i < num; i++) {
            int c = b;
            b = a+b;
            a = c;
        }
        System.out.println(b);
    }
}
