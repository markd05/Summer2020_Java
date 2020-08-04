package Assignments.Assignments151to200.Assignments191to200;

import java.util.ArrayList;

public class A191 {
    /*
    Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList of Strings called wordList2

This method should create a new ArrayList of Strings, add all the words (in order) from wordList1,
then add all the words (in order) from wordList2.
In other words, it is combining all the elements from the two parameters.

import java.util.ArrayList;
class Main {
//create your method below

}
     */
    public static void main(String[] args) {
        ArrayList<String> wordList1 = new ArrayList<>();
        wordList1.add("Hello");
        ArrayList<String> wordList2 = new ArrayList<>();
        wordList2.add("World");
        System.out.println(combineAL(wordList1, wordList2));
    }

    public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2) {
        ArrayList<String> combine = new ArrayList<>();
        combine.addAll(wordList1);
        combine.addAll(wordList2);
        return combine;
    }
}
