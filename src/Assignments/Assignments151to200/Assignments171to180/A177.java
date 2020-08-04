package Assignments.Assignments151to200.Assignments171to180;

import java.util.Arrays;

public class A177 {
    /*
    Write the definition of a method reverse, whose parameter is an array of Strings.
    The method reverses the elements of the array. The method returns an array of strings in the reversed order.
Example:
input: ["apple", "pear"]
output: ["pear", "apple"]

class Main {
  public static void main(String[] args) {

  }
   * Reverses the order of the elements in the specified array
 * @param arr
 * @return array of strings

    public static String[] reverse(String[] arr) {
//Write code here, remember to test
    }
}
     */
    public static String[] reverse(String[] arr) {
        //Write code here, remember to test
        String[] rev = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length-1-i];
        }
        return rev;
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "pear"};
        System.out.println(Arrays.toString(reverse(arr)));
    }
}
