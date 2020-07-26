package Assignments.Assignments51to100.Assignments71to80;

import java.util.Scanner;

public class A080 {
    /*
    Write a program that will print out the first half of the word twice.
Example:
input: java     output: jaja

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String word = scan.next();
	//WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        String half = word.substring(0,word.length()/2);
        System.out.println(half+half);
    }
}
