package Assignments.Assignments151to200.Assignments171to180;

public class A172 {
    /*
    Palindrome is a word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run.
So method isPalindrome checks that and returns true if check is palindrome and false if it is not.

- make your conditions case insensitive.  ex: Civic and civic are both palindromes
- make your conditions space insensitive.  Race car is a palindrome even though there is space in between.

Examples:
isPalindrome("Noon") ==> true
isPalindrome("I am not palindrome") ==> false
isPalindrome("wooden") ==> false
isPalindrome("Nurses Run") ==> true

class Main {
  public static boolean isPalindrome(String check) {
//Write code here, remember to test
  }
}
     */
    public static boolean isPalindrome(String check) {
//Write code here, remember to test
        check = check.replace(" ", "");
        String rev = "";
        for (int i = check.length(); i > 0; i--) {
            rev += check.substring(i-1,i);
        }
        if (rev.equalsIgnoreCase(check)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Race car"));
    }
}
