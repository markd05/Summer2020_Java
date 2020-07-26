package Assignments.Assignments51to100.Assignments61to70;

import java.util.Scanner;

public class A063 {
    /*
    using substring method output the first two letters of text string

for examole:
String txt = "foo"
the first two letters are "fo"
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
        System.out.print(txt.substring(0,2));

    }
}
