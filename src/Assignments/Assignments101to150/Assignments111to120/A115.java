package Assignments.Assignments101to150.Assignments111to120;

import java.util.Scanner;

public class A115 {
    /*
    Given a string, print out true if the number of appearances of "java" anywhere in the string
    is equal to the number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false

public class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String sentence = scan.nextLine();

         //WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        //WRITE YOUR CODE HERE
        int java = 0;
        int python = 0;
        for (int i = 0; i < sentence.length()-3; i++) {
            if (sentence.substring(i, i + 4).equals("java")) {
                java++;
            }
        }
        for (int i = 0; i < sentence.length()-5; i++) {
            if (sentence.substring(i, i+6).equals("python")) {
                python++;
            }
        }
        System.out.println(java == python);

    }
}
