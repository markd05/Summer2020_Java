package Assignments.Assignments151to200.Assignments191to200;

import java.util.ArrayList;
import java.util.Arrays;

public class A192 {
    /*
    Create a static method that:
is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers

This method should:
Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element

For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).
The original ArrayList should remain unchanged.

import java.util.ArrayList;
class Main {
public static void main(String[] args) {
//Test your code
}
//create your method below

}
     */
    public static void main(String[] args) {
        //Test your code
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
        System.out.println(appendPosSum(arr));
    }
    //create your method below
    static ArrayList<Integer> appendPosSum(ArrayList<Integer> arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        for (int each : arr) {
            if (each > 0) {
                pos.add(each);
            }
        }
        int total = 0;
        for (int each : pos) {
            total += each;
        }
        pos.add(total);
        return pos;
    }

}
