package Assignments.Assignments151to200.Assignments171to180;

public class A174 {
    /*
    Anagram is a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.
isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.

each letter in word1 should appear in word2 exact number of times
ignore empty spaces
make your code case insensitive

Examples:
isAnagram("listen", "Silent") ==> true
isAnagram("earth", "heart") ==> true
isAnagram("star", "rats") ==> true
isAnagram("hi", "bye") ==> false
isAnagram("java", "cava") ==> false

import java.util.Arrays;
class Main {
  public static boolean isAnagram(String word1, String word2) {
//Write code here, remember to test
  }
}
     */
    public static boolean isAnagram(String word1, String word2) {
//Write code here, remember to test
        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                if (word1.substring(i, i + 1).equalsIgnoreCase(word2.substring(j, j + 1))) {
                    word2 = word2.replace(word2.substring(j,j+1), "");
                }
            }
        }
        return word2.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
    }
}
