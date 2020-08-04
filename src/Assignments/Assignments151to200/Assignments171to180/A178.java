package Assignments.Assignments151to200.Assignments171to180;

public class A178 {
    /*
    Write a method appearsTwice() that returns true if value of variable target
    appears only twice in the string sentence, otherwise return false.

Examples:
Main.appearsTwice("java", "java is fun!") - returns false, because java appears only once.
Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.")
- returns true, because laptop appears twice.

class Main {
  public static void main(String[] args) {

  }


 * @param target - string that you need to check.
 * @param sentence - string where you need to lookup for target.
 * @return

    public static boolean appearsTwice(String target, String sentence) {
//Write code here, remember to test
    }
}
     */
    public static boolean appearsTwice(String target, String sentence) {
        //Write code here, remember to test
        int count = 0;
        for (int i = 0; i < sentence.length()-target.length(); i++) {
            if (sentence.substring(i, i + target.length()).contains(target)) {
                count++;
            }
        }
        return count == 2;
    }

    public static void main(String[] args) {
        System.out.println(appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old."));
    }
}
