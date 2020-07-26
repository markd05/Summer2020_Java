package Assignments.Assignments101to150.Assignments141to150;

public class A150 {
    /*
    This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.
It returns true only if both a and b are true or c is true.
https://en.wikipedia.org/wiki/Truth_table

class Main { // remember to test your code
  public static boolean threeLocks(boolean a, boolean b, boolean c) {

  }//end threeLocks
}
     */
    public static boolean threeLocks(boolean a, boolean b, boolean c) {
        boolean i = true;
        if (c == true) {
            if (a == true && b == true) {
                i = false;
            } else if (a == false || b ==  false) {
                i = true;
            }
        } else {
            if (a && b) {
                    i = true;
            } else {
                i = false;
            }
        }
        return i;
    }//end threeLocks

    public static void main(String[] args) {
        boolean a = threeLocks(false, false, false);
        System.out.println(a);
    }
}
