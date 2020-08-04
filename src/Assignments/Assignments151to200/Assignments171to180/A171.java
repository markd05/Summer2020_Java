package Assignments.Assignments151to200.Assignments171to180;

public class A171 {
    /*
    This method gets two strings (text and badWord)  and returns a string.
basicly what it dose is take out all the occurrences of badWord in text.

for example:
clean ("one two three","two")
returns "one three"
clean ("foo bar","foo")
returns "bar"
clean ("he said bla bla bla","bla")
returns "he said "

hint:
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#replace(char,%20char)

class Main {
  public static String clean (String text ,String badWord) {
	//Write code here, remember to test
  }
}
     */
    public static String clean (String text ,String badWord) {
        //Write code here, remember to test
        text = text.replace(badWord + " ", "");
        return text;
    }

    public static void main(String[] args) {
        String result = clean("one two three", "two");
        System.out.println(result);
    }
}
