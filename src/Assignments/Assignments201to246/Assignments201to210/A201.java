package Assignments.Assignments201to246.Assignments201to210;

public class A201 {
    /*
    extractNum
description:
a method that cleans any non number string from a string it gets
and returns the clean string
input:
-s (string)- a string the method gets
return: string: a string of numbers only

example use:
extractNum("aa2aa3") ==> 23
extractNum("aa2") ==> 2
extractNum("aa10aa") ==> 10
extractNum("aa!!%$#.10aa") ==> 10

hint:
you can use:
 Character.isDigit(ch)
 or Conditions (on ascii table, the characters between #48 ~ #57 are digits)

class Main {
  public static String extractNum(String s) {
	//Write code here, remember to test
  }
}
     */
    public static void main(String[] args) {
        System.out.println(extractNum("aa!!%$#.10aa"));
    }

    public static String extractNum(String s) {
        //Write code here, remember to test
        String digits = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                digits += s.charAt(i);
            }
        }
        return digits;
    }
}
