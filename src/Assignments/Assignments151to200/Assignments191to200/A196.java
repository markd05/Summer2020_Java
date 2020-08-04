package Assignments.Assignments151to200.Assignments191to200;
import java.util.ArrayList;
import java.util.Arrays;
public class A196 {
    /*
    Create a static method that:
is called removeAll
returns nothing
takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord
This method should go through every element of wordList and remove every instance of targetWord from the ArrayList.

Example:
ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
removeAll(wordList,"hi");
now wordList is ["hey","yo"]

import java.util.ArrayList;
import java.util.Arrays;
class Main {
     	//remember to test your code
//create your method below

}
     */
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("hi", "hey", "hi", "yo"));
        removeAll(wordList, "hi");
    }

    static void removeAll(ArrayList<String> wordList, String targetWord) {
        for (int i = wordList.size()-1; i >= 0; i--) {
            if (wordList.get(i).equals(targetWord)) {
                wordList.remove(i);
            }
        }
        System.out.println(wordList);
    }
}
