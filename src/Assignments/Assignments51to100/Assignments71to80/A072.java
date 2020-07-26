package Assignments.Assignments51to100.Assignments71to80;

import java.util.Scanner;

public class A072 {
    /*
    Write a program that will print out the longest word between two words.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	//DO NOT CHANGE
	Scanner scan = new Scanner(System.in);
	String word1 = scan.next();
	String word2 = scan.next();
	//WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WRITE YOUR CODE HERE

        if (word1.length() > word2.length()) {
            System.out.println(word1);
        } else {
            System.out.println(word2);
        }

    }
}
