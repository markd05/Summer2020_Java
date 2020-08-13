package Assignments.Assignments201to246.Assignments231to243;

import java.util.Scanner;

/*
Two horses. Five monkeys. Twenty flies. One cat. Nine lives.
Despite the English language being one of the most commonly used languages around the world,
it is also quite complicated to learn if you are not a native speaker.
Taking a noun and converting it to its plural form has a dozen rules and even more special cases.

In this project, you will be creating a program that takes a given non-negative integer
and a given singular noun as a String.
You will have to print out the number, followed by the string in its plural form (unless the number is 1).

The given inputs are:
int amt;
String word;

For example, let's say your inputs are as follows:
# in: 4
word: apple
Your program should print out "4 apples"

# in: 0
word: apple
Your program should print out "0 apples"

# in: 1
word: apple
Your program should print out "1 apple" Be prepared to handle the following rules:



Note that in order to handle cases where the word ends in “y” correctly, you will need to take some care.
It is important that you order your conditions so that your code will check for the special case endings of
“ay”, “oy”, “ey”, and “uy” before simply checking whether a word ends in “y”.

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
	System.out.print("# in:");
	int amt = inp.nextInt();
	inp.nextLine(); //this line is necessary
	System.out.print("word:");
	String word = inp.nextLine();
	//leave the above unedited, write your code below:

  }
}
 */
public class A233 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("# in:");
        int amt = inp.nextInt();
        inp.nextLine(); //this line is necessary
        System.out.print("word:");
        String word = inp.nextLine();
        //leave the above unedited, write your code below:

        String last2 = word.substring(word.length() - 2);
        if (amt == 1) {
            System.out.println(1 + " " + word);
        } else {
            switch (last2) {
                case "fe":
                    System.out.println(word.replace(last2, "ves"));
                    break;
                case "sh":
                case "ch":
                    System.out.println(word + "es");
                    break;
                case "us":
                    System.out.println(word.replace(last2, "i"));
                    break;
                case "y":
                    System.out.println(word.replace(word.substring(word.length()-1), "ies"));
                    break;
                case "ay":
                case "oy":
                case "ey":
                case "uy":
                default:
                    System.out.println(word + "s");
            }
        }

    }
}
