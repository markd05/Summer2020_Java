package Assignments.Assignments201to246.Assignments211to220;

import java.util.Scanner;

public class A213 {
    /*
    Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

Function Description
It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
s: a string representing time in  12 hour format
Input: 07:05:45PM
Output: 19:05:45

import java.util.*;
public class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	timeConversion(scan.nextLine());
  }
  public static void timeConversion(String s) {
 * Write your code here.

}
}

        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
        }
    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        if (s.substring(s.length() - 2).equals("AM")) {
            System.out.println(s.substring(0,s.length()-2));
        }
        if (s.substring(s.length() - 2).equals("PM")) {
            int hour = Integer.parseInt(s.substring(0,2));
            hour += 12;
            s = s.substring(0,s.length()-2);
            System.out.println(s.replace(s.substring(0,2), ""+hour));
        }
    }
}
