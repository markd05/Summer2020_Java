package Assignments.Assignments51to100.Assignments61to70;

import java.util.Scanner;

public class A068 {
    /*
    Write a program that will output length of the text (string).

Example:
Display message: "Please enter the text:"
input: java
Display message: "Length is: 4"

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	//WRITE YOU CODE HERE:

  }
}
     */
    public static void main(String[] args) {
        //WRITE YOU CODE HERE:
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String txt = scan.nextLine();
        System.out.println("Length is: " + txt.length());

    }
}
