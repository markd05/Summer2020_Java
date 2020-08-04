package Assignments.Assignments151to200.Assignments171to180;
import java.util.Scanner;
public class A180 {
    /*
    Inputs:
String word;

Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
HINT:  vowel is a letter representing a vowel sound, such as a, e, i, o, u.

In: howdyho
oo

In: huehuehuehue
ueueueue

In: poopoo what idk what im doing
ooooaiaioi

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	//Write code here, remember to test
  }
}
     */
    public static void main(String[] args) {
        //Write code here, remember to test
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.nextLine();
        String vowel = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowel += str.charAt(i);
            }
        }
        System.out.println(vowel);
    }
}
