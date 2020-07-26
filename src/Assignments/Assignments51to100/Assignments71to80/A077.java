package Assignments.Assignments51to100.Assignments71to80;

import java.util.Scanner;

public class A077 {
    /*
    You have a word, do the following:
If the word has an odd number of characters and has 5 or more characters, print the middle three characters of the word.

Otherwise print "invalid".

fifteen ==> fte
apple ==> ppl
hey ==> invalid
java ==> invalid
whatsup ==> ats
$ ==> invalid

import java.util.*;

public class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String word = scan.next();
	//WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        if (word.length() % 2 == 1 && word.length() >= 5) {
            System.out.println(word.substring(word.length()/2-1,(word.length()/2)+2));
        } else {
            System.out.println("invalid");
        }
    }
}
