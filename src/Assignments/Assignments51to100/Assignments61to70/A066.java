package Assignments.Assignments51to100.Assignments61to70;

import java.util.Scanner;

public class A066 {
    /*
    Write a program that will verify if word contains in the sentence. Print out the result as boolean value.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String word = scan.nextLine();
	String sentence = scan.nextLine();
	//WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE

        boolean contain = sentence.contains(word);
        System.out.println(contain);
    }
}
