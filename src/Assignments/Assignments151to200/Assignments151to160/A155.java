package Assignments.Assignments151to200.Assignments151to160;

public class A155 {
    /*
    This method gets a string and returns the word count of that string.

example:
wordCount("foo bar")
returns 2
wordCount("one two three")
returns 3
wordCount("bla")
returns 1

hint:
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)

class Main { // remember to test your code
  public static int wordCount(String words) {
	//Write your code here

  }
}
     */
    public static void main(String[] args) {
        String str = "foo bar";
        int count = wordCount(str);
        System.out.println(count);
    }

    public static int wordCount(String words) {
        //Write your code here
        int count = 0;
        String[] arr = words.split(" ");
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        return count;
    }
}
