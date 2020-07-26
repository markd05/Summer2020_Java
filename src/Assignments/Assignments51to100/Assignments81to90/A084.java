package Assignments.Assignments51to100.Assignments81to90;

import java.util.Scanner;

public class A084 {
    /*
    Write a program that will print out information about the user based on email.
    Print first and last name from the email with the upper case.
    (Assume that first and last names were separated by an underscore)

Example:
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com

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

        String first = email.substring(0,email.indexOf("_"));
        String last = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
        String topLevel = email.substring(email.indexOf(".")+1);

        System.out.println("First name: " + first.substring(0,1).toUpperCase() + last.substring(1));
        System.out.println("Last name: " + last.substring(0,1).toUpperCase() + last.substring(1));
        System.out.println("Domain: " + domain);
        System.out.println("Top-Level Domain: " + topLevel);
    }
}
