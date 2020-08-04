package Assignments.Assignments151to200.Assignments191to200;
import java.util.ArrayList;
import java.util.Arrays;

public class A193 {
    /*
    Create a method that:
is called timesTwo
returns nothing
takes in a single parameter - an ArrayList of Integers called nums
This method should take the ArrayList parameter and multiply every value by two.

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
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        timesTwo(nums);
    }
    //create your method below
    public static void timesTwo(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            nums.set(i,nums.get(i)*2);
        }
        System.out.println(nums);
    }
}
