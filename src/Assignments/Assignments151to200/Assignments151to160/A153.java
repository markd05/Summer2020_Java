package Assignments.Assignments151to200.Assignments151to160;

import java.util.Scanner;

public class A153 {
    /*
    When gears merge and work together, one teeth from each one goes in order.
Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.
Please note one and two can be of different lengths. Please look at below examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"
mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
mergeStrings("java", "selenium") ==> "jsaevlaenium"

class Main { // remember to test your code
  //Write your code here


}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String s1 = scan.nextLine();
        System.out.println("Enter another String");
        String s2 = scan.nextLine();
        String str = mergeStrings(s1,s2);
        System.out.println(str);
    }

    public static String mergeStrings(String s1, String s2) {
        String str = "";
        if (s1.length() > s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                str += s1.substring(i, i+1) + s2.substring(i,i+1);
            }
        } else {
            for (int i = 0; i < s2.length(); i++) {
                str += s1.substring(i,i+1) + s2.substring(i,i+1);
            }
        }
        return str;
    }
}
