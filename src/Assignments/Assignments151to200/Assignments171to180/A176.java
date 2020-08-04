package Assignments.Assignments151to200.Assignments171to180;

public class A176 {
    /*
    coverString method will take 2 string parameters from the caller.
Your job is to write an important code that will:

- to search and find each appearance of coverME within main
- then surround it with [coverMe] (square brackets)
- if you cannot find the coverME within main after tirelessly looping then just return whole main itself covered [main].
- keep in mind that coverME value can be of any length.

Examples:
coverString("java methods", "me") ) ; ==> "java [me]thods"
coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"
coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"
coverString("apples", "pears") ) ; ==> "[apples]"

class Main {
  public static void main(String[] args) {
	System.out.println(coverString("java methods", "me") ) ; //java [me]thods
  }
  public static String coverString(String main, String coverME) {
//Write code here, remember to test
  }
}
     */
    public static void main(String[] args) {
        System.out.println(coverString("java methods", "me") ) ; //java [me]thods
    }
    public static String coverString(String main, String coverME) {
        //Write code here, remember to test
        if (coverME.length() > main.length()) {
            return "[" + main + "]";
        } else {
            if (main.contains(coverME)) {
                main = main.replace(coverME, "[" + coverME + "]");
            }
        }
        return main;
    }
}
