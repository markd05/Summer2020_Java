package Assignments.Assignments101to150.Assignments111to120;

import java.util.Scanner;

public class A112 {
    /*
    Print true if the string "cat" and "dog" appear the same number of times in the given string word.
Example:
input: catdog
output: true

Example:
input: catcat
output: false

Example:
input: cat-cheetah-dog-cat
output: false

public class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int countOfCats = 0;
	int countOfDogs = 0;
	String word = scan.next();


	//WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();


        //WRITE YOUR CODE HERE
        for (int i = 0; i < word.length()-2; i++) {
            if (word.substring(i, i + 3).equals("cat")) {
                countOfCats++;
            }
            if (word.substring(i, i + 3).equals("dog")) {
                countOfDogs++;
            }
        }
        if (countOfCats == countOfDogs) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
