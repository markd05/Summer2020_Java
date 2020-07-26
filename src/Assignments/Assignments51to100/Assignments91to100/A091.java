package Assignments.Assignments51to100.Assignments91to100;

import java.util.Scanner;

public class A091 {
    /*
    Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,
otherwise print the string unchanged.

Example:
input: xHiX
output: Hi

Example:
input: apple
output: apple

input: xUxL
output: UxL

input: JavaX
output: Java

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String word = scan.next();

         //your code here

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //your code here
        if (word.substring(0, 1).equalsIgnoreCase("x") && word.substring(word.length()-1).equalsIgnoreCase("x")) {
            System.out.println(word.substring(1,word.length()-1));
        } else if (word.substring(0, 1).equalsIgnoreCase("x")) {
            System.out.println(word.substring(1));
        } else if (word.substring(word.length() - 1).equalsIgnoreCase("x")) {
            System.out.println(word.substring(0,word.length()-1));
        } else {
            System.out.println(word);
        }

    }
}
