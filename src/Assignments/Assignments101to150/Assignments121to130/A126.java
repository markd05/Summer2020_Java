package Assignments.Assignments101to150.Assignments121to130;

import java.util.Scanner;

public class A126 {
    /*
    Given a String variable sentence, write code to type each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java
 class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String sentence = input.nextLine();

	//TODO: Type your code below

  }
}
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below
        String[] arr = sentence.split(" ");
        for (int i = arr.length; i >= 1; i--) {
            System.out.println(arr[i-1]);
        }

    }
}
