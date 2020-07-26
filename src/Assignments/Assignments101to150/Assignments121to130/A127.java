package Assignments.Assignments101to150.Assignments121to130;

import java.util.Scanner;

public class A127 {
    /*
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:
sentence -> "Java is fun"
reversed -> "fun is Java"

class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String sentence = input.nextLine();
	String reversed = "";
	//TODO: start your code here

  }
}
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String reversed = "";
        //TODO: start your code here

        String str = "";
        String[] arr = sentence.split(" ");
        for (int i = arr.length; i >= 1; i--) {
            str += arr[i-1]+" ";
        }
        System.out.println(str);
    }
}
