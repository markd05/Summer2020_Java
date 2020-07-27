package Assignments.Assignments151to200.Assignments151to160;

import java.util.Scanner;

public class A160 {
    /*
    Complete a void method printUniqueWords() that will print only unique words from an array of strings.
    Every single unique word should be printed from the new line.

Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python

import java.util.*;

public class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int size = scan.nextInt();
	String[] words = new String[size];
	for(int i=0; i < size; i++){
  	words[i] = scan.next();
	}
	printUniqueWords(words);
  }

  public static void printUniqueWords(String[] words){
	//WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE
        for (int i = 0; i < words.length; i++) {
            int dupe = 0;
            for (int j = 0; j < words.length; j++) {
                if (i != j) {
                    if (words[i].equals(words[j])) {
                        dupe = 1;
                    }
                }
            }
            if (dupe == 0) {
                System.out.println(words[i]);
            }
        }

    }
}
