package Assignments.Assignments51to100.Assignments61to70;
import java.util.Scanner;
public class A062 {
    /*
    using charAt method output the 3rd letter of txt string then the 5th letter then the 6th letter.

use print not println.

import java.util.*;
class Main {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String txt = s.next();
	//WRITE YOUR CODE HERE:

  }
}
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //WRITE YOUR CODE HERE:
        System.out.print(txt.substring(3,4) + txt.substring(5,6) + txt.substring(6,7));

    }
}
