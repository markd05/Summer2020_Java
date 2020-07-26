package Assignments.Assignments51to100.Assignments51to60;
import java.util.Scanner;
public class A057 {
    /*
    In this assignment you are given two string variables word1 and word2.
you need to check if they are equal using an if.

Comparison should be case sensitive. "java" and "JaVa" are not equal.

if they are equal output  "word1 equals word2"
else output "word1 does not equal word2"

for example:
word1="java"
word2="java"

output:
"word1 equals word2"

word1="foo"
word2="bar"

output:
"word1 does not equal word2"

=============================================
import java.util.*;

public class Main {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String word1 = s.next();
	String word2 = s.next();

	//WRITE YOUR CODE HERE:

  }
}
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();

        //WRITE YOUR CODE HERE:

        if (word1.equals(word2)) {
            System.out.println("word1 equals word2");
        } else {
            System.out.println("word1 does not equal word2");
        }
    }
}
