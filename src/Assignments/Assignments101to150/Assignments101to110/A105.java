package Assignments.Assignments101to150.Assignments101to110;

import java.util.Scanner;

public class A105 {
    /*
    One way to measure the amount of energy that is expended during exercise is to use metabolic equivalents (MET).
Here are some METS for various activities:
- Running 6 MPH: 10 METS
- Basketball: 8 METS
- Sleeping: 1 MET
METS are given per minute.

The number of calories burned per minute may be estimated using the following formula:
cal = 0.0175 * MET * Weight in kilograms

Write a program that asks user to enter his weight in pounds,
and then calculates and outputs the total number of calories burned for a  person who runs 6 MPH for 30 minutes,
plays basketball for 30 minutes, and then sleeps for 6 hours. One kilogram is equal to 2.2 pounds.
use (int)cal to round a double value.
Example:

output: Enter weight in pounds:
input: 150
output: Calories Burned: 1073

import java.util.*;

public class Main {
  public static void main(String[] args) {

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight in pounds");
        int weight = scan.nextInt();
        double cal = 0.0175 * 900 * (weight/2.2);
        System.out.println("Calories burned: " + cal);
    }
}
