package Assignments.Assignments51to100.Assignments91to100;

import java.util.Scanner;

public class A092 {
    /*
    Write a program that will print out route instructions.
    Your program should take 2 parameters: start point and end point.
    Use left, right, up and down for navigation. Insert ">" between commands.
    If start point equals to end point - display: "start/end(start or end variable!) found".
Note: you may move only clock wise.

Example:
Input: A
Input: D
Output: right > down > left: D found

Input: C
Input: C
Output: C found


import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String start = scan.next();
	String end = scan.next();

         //your code here

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        //your code here

        String r = "right", d = "down", l = "left", u = "up";
        if (start.equalsIgnoreCase(end)) {
            System.out.println(start + " found");
        } else if (start.equalsIgnoreCase("A")) {
            if (end.equalsIgnoreCase("B")) {
                System.out.println(r + ":" + start);
            }
            if (end.equalsIgnoreCase("C")) {
                System.out.println(r + ">" + d + ":" + end + " found");
            }
        }
    }
}
