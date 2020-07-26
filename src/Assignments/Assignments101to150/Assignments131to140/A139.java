package Assignments.Assignments101to150.Assignments131to140;

public class A139 {
    /*
    Create a method printHollowRect that prints a 5 on 5 hollow rectangle:

*****
*   *
*   *
*   *
*****

hint: you will need to use two nested for loops for that, and an if that
checks if its the last or first iteration of the loop (so you will know whet to print "*" or " ")

class Main {
  public static void printHollowRect(){
	// write your code here:

  }// end your code
  public static void main(String[] args) {
	printHollowRect();
  }
}
     */
    public static void printHollowRect(){
        // write your code here:
        for (int i = 0; i < 5; i++) {
            String str = "";
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {
                    str += "*";
                } else {
                    if (j > 0 && j < 4) {
                        str += " ";
                    } else {
                        str += "*";
                    }
                }
            }
            System.out.println(str);
        }

    }// end your code
    public static void main(String[] args) {
        printHollowRect();
    }
}
