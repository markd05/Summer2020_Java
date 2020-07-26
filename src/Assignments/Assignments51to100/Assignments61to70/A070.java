package Assignments.Assignments51to100.Assignments61to70;

import java.util.Scanner;

public class A070 {
    /*
    070. Print last character_String Methods
Write a program that will print out last letter of the word (string).

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

        System.out.println(word.substring(word.length()-1));
    }
}
