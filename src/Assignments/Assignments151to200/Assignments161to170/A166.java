package Assignments.Assignments151to200.Assignments161to170;

public class A166 {
    /*
    The method gets a string and returns a string minus the first letter.
for example:
removeFirst("aaa")
returns "aa"

class Main {
  public static String removeFirst(String target) {
	//Write code here, remember to test
  }
}
     */
    public static String removeFirst(String target) {
        //Write code here, remember to test
        return target.substring(1);
    }

    public static void main(String[] args) {
        System.out.println(removeFirst("aaa"));
    }
}
