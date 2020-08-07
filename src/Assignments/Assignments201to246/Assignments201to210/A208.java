package Assignments.Assignments201to246.Assignments201to210;

import java.util.Arrays;

public class A208 {
    /*
    Complete the combineNames method to return a new String array that is composed of the
    first name and last name of each of the parameters.
This may be confusing so look at the example:
first_names = {"bob","joe"}
last_names = {"jones","smith"}
returns a new String array with {"bob jones", "joe smith"}

class Main {
public static String[] combineNames(String[] first_names, String[] last_names) {
    	//Write code here, remember to test
}
public static void main(String[] args) {
//feel free to test code here
}
}
     */
    public static String[] combineNames(String[] first_names, String[] last_names) {
        //Write code here, remember to test
        String[] names = new String[first_names.length];
        for (int i = 0; i < first_names.length; i++) {
            names[i] = first_names[i]+" "+last_names[i];
        }
        return names;
    }
    public static void main(String[] args) {
        //feel free to test code here
        String[] first_names = {"bob", "joe"};
        String[] last_names = {"jones", "smith"};
        System.out.println(Arrays.toString(combineNames(first_names, last_names)));
    }
}
