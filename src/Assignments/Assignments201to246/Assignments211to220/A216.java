package Assignments.Assignments201to246.Assignments211to220;

import java.util.ArrayList;
import java.util.Arrays;

public class A216 {
    /*
    Create a static method that:

is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers

This method should:
Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element

For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3), the ArrayList that gets
returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).  The original ArrayList should remain unchanged.

import java.util.ArrayList;
class Main {
public static void main(String[] args) {
// Test code here
}
//create your method below
public static ArrayList<Integer> appendPosSum(ArrayList<Integer> a) {

}
}
     */
    public static void main(String[] args) {
        // Test code here
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
        System.out.println(appendPosSum(a));
    }
    //create your method below
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> a) {
        ArrayList<Integer> arr = new ArrayList<>();
        int total = 0;
        for (Integer each : a) {
            if (each > 0) {
                total += each;
                arr.add(each);
            }
        }
        arr.add(total);
        return arr;
    }
}
