package Assignments.Assignments101to150.Assignments121to130;

import java.util.Scanner;

public class A125 {
    /*
    Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length
Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa

class Main {
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
String[] words = new String[5];
for(int i = 0; i < 5;  i++) {
  words[i] = input.nextLine();
}
//write your code below

}
}
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }
        //write your code below
        String longest = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        System.out.println(longest);

    }
}
