package Assignments.Assignments51to100.Assignments81to90;

import java.util.Scanner;

public class A083 {
    /*
    In this task, you need to swap the first name with the last name in the email.
    If the email doesn't contain underscore - do not do anything.

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String email = scan.next();

	//your code here

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        //your code here

        if (email.contains("_")) {
            String first = email.substring(0,email.indexOf("_"));
            String last = email.substring(email.indexOf("_")+1,email.indexOf("@"));
            System.out.println(last + "_" + first + "@gmail.com");
        } else {
            System.out.println(email);
        }
    }
}
