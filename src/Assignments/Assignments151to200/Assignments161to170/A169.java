package Assignments.Assignments151to200.Assignments161to170;

public class A169 {
    /*
    reverse method reverse a string.
it gets a string and returns it in reverse.

for example:
reverse("foo") ==> "oof"
reverse("student") ==> "tnedust"

class Main {
public static String reverse(String input) {
		//Write code here, remember to test
}
}
     */
    public static String reverse(String input) {
        //Write code here, remember to test
        String rev = "";
        for (int i = input.length(); i > 0; i--) {
            rev += input.substring(i-1,i);
        }
        return rev;
    }

    public static void main(String[] args) {
        String rev = reverse("student");
        System.out.println(rev);
    }
}
