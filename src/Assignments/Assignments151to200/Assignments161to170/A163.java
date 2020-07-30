package Assignments.Assignments151to200.Assignments161to170;

import java.util.Scanner;

public class A163 {
    /*
    This method gets a string and an int, it returns a string.
what it dose is limit the inputted string to a cretin number of characters.
for example:
limit("abcd",2)
returns "ab"
limit("bla bla",3)
returns "bla"

hint:
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#substring(int)

class Main {
  public static String limit(String text, int maxLength)
  {
	//Write code here, remember to test
  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.nextLine();
        System.out.println("Enter a number");
        int num = scan.nextInt();
        String s = limit(str,num);
        System.out.println(s);
    }

    public static String limit(String text, int maxLength)
    {
        //Write code here, remember to test
        return text.substring(0,maxLength);
    }
}
