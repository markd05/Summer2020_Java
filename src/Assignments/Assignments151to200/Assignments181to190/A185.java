package Assignments.Assignments151to200.Assignments181to190;

import java.util.ArrayList;

public class A185 {
    /*
    We will be manipulating elements of an ArrayList by using List methods.
The first List method we will learn is .add()
The following code will take an ArrayList of Strings called strs and add "Hello" to it.
str.add("Hello");
The syntax follows something like:
arraylistvariable.add(data to add);
In the space to the left, add three names (any names) to the ArrayList called names.

import java.util.ArrayList;
class Main {
public static ArrayList<String> test() {
ArrayList<String> names = new ArrayList<String>();
//write code below

//leave below code alone
return names;
}
}
     */
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static ArrayList<String> test() {
        ArrayList<String> names = new ArrayList<String>();
        //write code below
        names.add("Billy");
        names.add("Bob");
        names.add("Joe");

        //leave below code alone
        return names;
    }
}
