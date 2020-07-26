package Assignments.Assignments101to150.Assignments111to120;

import java.util.Scanner;

public class A113 {
    /*
    Return the number of times that the string "java" appears anywhere in the given string word.

Example:
input: javaxjava
output: 2

Example:
input: javaxjavaapplepearjavaegg
output: 3

class Main {
  public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	String word = scan.next();

         //WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE HERE
        int count = 0;
        for (int i = 0; i < word.length()-3; i++) {
            if (word.substring(i, i + 4).equals("java")) {
                count++;
            }
        }
        System.out.println(count);

    }
}
