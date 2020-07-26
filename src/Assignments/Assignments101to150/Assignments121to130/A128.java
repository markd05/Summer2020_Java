package Assignments.Assignments101to150.Assignments121to130;

import java.util.Arrays;
import java.util.Scanner;

public class A128 {
    /*
    Given a String variable sentence, write code to type each word in separate lines.
Example:
sentence -> "Java is fun"
Print
Java
is
fun
class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String sentence = input.nextLine();
	//type your code below

  }
}
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        //type your code below
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
