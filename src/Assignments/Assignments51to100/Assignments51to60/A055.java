package Assignments.Assignments51to100.Assignments51to60;
import java.util.Scanner;
public class A055 {
    /*
    write a program that asks the user for his first name and last name.
use a scanner to get the user input.

import java.util.*;
public class Main {
  public static void main(String[] args) {

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you first and last name");
        String firstName = scan.next();
        String lastName = scan.next();
        System.out.println("Your full name is: " + lastName + ", " + firstName);
    }
}
