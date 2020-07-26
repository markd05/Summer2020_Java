package Assignments.Assignments1to50.Assignments11to20;
import java.util.Scanner;
public class A020 {
    /*
    In this assignment, you will write code to put together time of day.
Like this: 12:24:33 PM
1. Declare variables: hour, minute, second that can hold int values.
	Declare amOrPm variable that can hold a String ("AM" or "PM")
2. Instructor will set different values to your variables
3. Using the variables and concatenation, print values in the format mentioned above.

import java.util.*;

public class Main {
  public static void main(String[] args) {
	//1. WRITE YOUR CODE HERE:

	//DO NOT TOUCH BELOW LINES. TEACHER WILL SET VALUES
	Scanner sc = new Scanner(System.in);
	hour   = sc.nextInt();
	minute = sc.nextInt();
	second = sc.nextInt();
	amOrPm = sc.next();
	//#############################
	//2. WRITE YOUR CODE HERE:

  }
}
     */
    public static void main(String[] args) {
        //1. WRITE YOUR CODE HERE:
        int hour, minute, second;
        String amOrPm;
        //DO NOT TOUCH BELOW LINES. TEACHER WILL SET VALUES
        Scanner sc = new Scanner(System.in);
        hour   = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();
        amOrPm = sc.next();
        //#############################
        //2. WRITE YOUR CODE HERE:
        System.out.println(hour + ":" + minute + ":" + second + " " + amOrPm);
    }
}
