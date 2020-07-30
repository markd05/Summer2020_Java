package Assignments.Assignments151to200.Assignments161to170;

import java.util.Scanner;

public class A161 {
    /*
    Complete a method isPalindrome() that will check if number is a palindrome.
    Print your result as a boolean (true or false).
Example:
input: 1001
output: true
Example:
input: 1234
output: false

import java.util.*;
class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	isPalindrome(num);
  }
  public static void isPalindrome(int num){
	//WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }
    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        String n = ""+num;
        String a = "";
        for (int i = n.length()-1; i >= 0; i--) {
            a += n.charAt(i);
        }
        System.out.println(a.equals(n));
    }
}
