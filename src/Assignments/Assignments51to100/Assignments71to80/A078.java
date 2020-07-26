package Assignments.Assignments51to100.Assignments71to80;

import java.util.Scanner;

public class A078 {
    /*
    You have 2 words, both of them have 3 characters.
If either of them does not have exactly 3 characters, print "cannot merge"
Merge their characters one by one and print together like below:
aok
lol
alookl

ear
pie
epaire

java
wow
cannot merge

Hint: by inserting +""+ (empty string) between chars, you can concatenate char values.

import java.util.*;

public class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String word1 = scan.next();
	String word2 = scan.next();
	//WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WRITE YOUR CODE HERE
        if (word1.length() == 3 && word2.length() == 3) {
            for (int i = 0; i < 3; i++) {
                System.out.print(word1.substring(i,i+1) + word2.substring(i,i+1));
            }
        } else {
            System.out.println("cannot merge");
        }
    }
}
