package Assignments.Assignments151to200.Assignments191to200;

import java.util.ArrayList;
import java.util.Arrays;

public class A200 {
    /*
    Create a method that:
is called removeEveryOther
returns nothing
takes in a single parameter - an ArrayList of Strings called words
This method should take the ArrayList parameter and modify it by removing every other element in the list,
starting with removing the 0th element.

For example, if the parameter is:
("hi","yo","sup","yolo","boop")
The modified ArrayList should be:
("yo","yolo")

import java.util.ArrayList;
class Main {
public static void main(String[] args) {
//test your code
}
//create your method below

}
     */
    public static void main(String[] args) {
        //test your code
        ArrayList<String> words = new ArrayList<>(Arrays.asList("hi","yo", "sup", "yolo", "boop"));
        removeEveryOther(words);
    }
    //create your method below
    public static void removeEveryOther(ArrayList<String> words) {
        for (int i = 0; i < words.size()/2+1; i++) {
            words.remove(i);
        }
        System.out.println(words);
    }
}
