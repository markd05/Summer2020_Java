package Assignments.Assignments51to100.Assignments91to100;

import java.util.Scanner;

public class A098 {
    /*
    Instructions from your teacher:
In this exercise you get a string called txt .

output txt without its last letter.

for example:

txt = "foo"

output will be:
fo

============================================
import java.util.*;
class Main {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String txt = s.next();
	//your code here

  }
}
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here

        System.out.println(txt.substring(0,txt.length()-1));
    }
}
