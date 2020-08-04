package Assignments.Assignments151to200.Assignments171to180;

public class A173 {
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
 or conditions

class Main {
  public static String extractNum(String s) {
//Write code here, remember to test
  }
}
     */
    public static String extractNum(String s) {
//Write code here, remember to test
        String nums = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                nums += s.charAt(i);
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        String nums = extractNum("aa!!%$#.10aa");
        System.out.println(nums);
    }
}
