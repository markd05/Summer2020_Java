package Assignments.Assignments51to100.Assignments61to70;
import java.util.Scanner;
public class A061 {
    /*
    ask the user for his name, capture it on a string using scanner.
then output the length of the name string.

import java.util.*;
class Main {
  public static void main(String[] args) {

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String firstName = scan.next();
        String lastName = scan.next();
        int length = firstName.length() + lastName.length();
        System.out.println("Length of name: " + length);
    }
}
