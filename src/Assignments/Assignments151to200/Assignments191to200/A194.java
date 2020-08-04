package Assignments.Assignments151to200.Assignments191to200;

import java.util.ArrayList;
import java.util.Arrays;

public class A194 {
    /*
    Create a method that:
is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers
This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.

For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)

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
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,5,3,7));
        System.out.println(twoTimes(arr));
    }
    //create your method below
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> arr) {
        ArrayList<Integer> dub = new ArrayList<>();
        for (int each : arr) {
            dub.add(each);
            dub.add(each);
        }
        return dub;

    }
}
