package Assignments.Assignments101to150.Assignments101to110;

import java.util.Scanner;

public class A101 {
    /*
    Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = .
Example:
input: javapython
output: true

Example:
input: cjavac++
output: true

Example:
input: c#javaruby
output: false

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	boolean exists = false;
	Scanner scan = new Scanner(System.in);
	String word = scan.next();

         //your code here

  }
}
     */
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //your code here

        if (word.length() >= 4) {
            if (word.substring(0, 4).equalsIgnoreCase("java") || word.substring(1, 5).equalsIgnoreCase("java")) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } else {
            System.out.println(false);
        }
    }
}
