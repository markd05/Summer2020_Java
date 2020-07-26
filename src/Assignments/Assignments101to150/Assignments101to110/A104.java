package Assignments.Assignments101to150.Assignments101to110;

import java.util.Scanner;

public class A104 {
    /*
    In this problem you need to write a program that checks for the bigger of 3 numbers.

You are given 3 int variables: num1 , num3 and num3.

if num1 is biggest - output: "n1 is bigger"
if num2 is biggest - output: "n2 is bigger"
if num3 is biggest - output: "n3 is bigger"

import java.util.*;
class Main {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int num1 = s.nextInt();
	int num2 = s.nextInt();
	int num3 = s.nextInt();
	//your code here

  }
}
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        //your code here

        if (num1 > num2 && num1 > num3) {
            System.out.println("n1 is bigger");
        } else if (num2 > num1 && num2 > num3){
            System.out.println("n2 is bigger");
        } else {
            System.out.println("n3 is bigger");
        }

    }
}
