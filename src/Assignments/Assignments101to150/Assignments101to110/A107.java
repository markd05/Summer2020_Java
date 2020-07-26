package Assignments.Assignments101to150.Assignments101to110;

import java.util.Scanner;

public class A107 {
    /*
    Print out the number of times that the string "hi" appears anywhere in the given string.
Example:
input: abc hi how hi
output: 2

Example:
input: hi code java please
output: 1

public class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();

         //WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //WRITE YOUR CODE HERE

        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
