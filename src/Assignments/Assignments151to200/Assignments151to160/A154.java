package Assignments.Assignments151to200.Assignments151to160;

public class A154 {
    /*
    uniqueChars is a method that you will code now, should be able to accept any string in the world
    and return unique characters from the parameter.

Examples:
uniqueChars("java") ==> "jav"
uniqueChars("mama") ==> "ma"
uniqueChars("spoon") ==> "spon"

import java.util.*;

class Main {
  public static void main(String[] args) {
	//test your code
	System.out.println( uniqueChars("BugBusters") ) ;
  }
  public static String uniqueChars(String str) {
	//TODO: write your code below

  }
}
     */
    public static void main(String[] args) {
        //test your code
        System.out.println( uniqueChars("BugBusters") ) ;
    }
    public static String uniqueChars(String str) {
        //TODO: write your code below
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            if (!unique.contains(str.substring(i, i + 1))) {
                unique += str.substring(i,i+1);
            }
        }
        return unique;
    }
}
