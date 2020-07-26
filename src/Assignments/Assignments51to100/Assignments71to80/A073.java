package Assignments.Assignments51to100.Assignments71to80;

import java.util.Scanner;

public class A073 {
    /*
    Write a program that will print out first and last letters together.
adobe
ae

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	//DO NOT CHANGE
	Scanner scan = new Scanner(System.in);
	String word = scan.next();
	//WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        System.out.println(word.substring(0,1) + word.substring(word.length()-1));
    }
}
