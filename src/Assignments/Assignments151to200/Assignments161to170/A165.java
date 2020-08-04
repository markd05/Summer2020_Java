package Assignments.Assignments151to200.Assignments161to170;

public class A165 {
    /*
    the method gets two strings and return the longest one

biggerS("apple","orange") ==> "orange"

class Main {
  public static String biggerS(String a ,String b)
  {
   //Write code here, remember to test
  }
}
     */
    public static String biggerS(String a ,String b)
    {
        //Write code here, remember to test
        String result = "";
        if (a.length() > b.length()) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }

    public static void main(String[] args) {
        String result = biggerS("apple", "orange");
        System.out.println(result);
    }
}
