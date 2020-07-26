package Assignments.Assignments101to150.Assignments121to130;

import java.util.Scanner;

public class A121 {
    /*
    Given a String array words, iterate through each word and print first and last letter of each element in the format below.

Example:
words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]

class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	//TODO: Write your code below

  }
}
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        //TODO: Write your code below

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i].substring(0,1) + words[i].substring(words[i].length()-1));
        }

    }
}
