package Assignments.Assignments1to50.Assignments21to30;
import java.util.Scanner;
public class A022 {
    /*
    in this assignment you are given an int num.
you need to check if num is positive negative or equals to zero.
use 3 if statements to do this .
output if num is positive negative or zero
for example:
num  = 1
print:
"positive"

num = -6
print:
"negative"

num = 0
print:
"zero"

import java.util.*;
public class Main {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int num = s.nextInt();
	//write your code here

  }
}
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        //write your code here
        if (num == 0) {
            System.out.println("zero");
        }
        if (num > 0) {
            System.out.println("positive");
        }
        if (num < 0) {
            System.out.println("negative");
        }
    }
}
