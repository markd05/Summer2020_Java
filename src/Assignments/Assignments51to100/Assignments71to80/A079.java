package Assignments.Assignments51to100.Assignments71to80;

import java.util.Scanner;

public class A079 {
    /*
    Write a program that will reverse a string. Your program should reverse a string only 5 characters long.
    If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!".
    Otherwise, reverse this word and print out result into the console.
Example:
input: cat
output: Too short!
Example:
input: singularity
output: Too long!
Example:
input: apple
output: elppa

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
        if (word.length() < 5) {
            System.out.println("Too short!");
        } else if (word.length() > 5) {
            System.out.println("Too long!");
        } else {
            for (int i = word.length(); i > 0; i--) {
                System.out.print(word.substring(i-1,i));
            }
        }
    }
}
