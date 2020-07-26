package Assignments.Assignments1to50.Assignments21to30;
import java.util.Scanner;
public class A024 {
    /*
    an automated test also needs a way to grade students.
in this assignment you will get a grade int and using ifs output if its a passing grade or failure.
if grade is bigger then 90 output "excellent"
if the grade is bigger then 70 and smaller then 90 output "good"
if grade is bigger then 60 and smaller then 70 output "pass"
if grade is smaller then 60 output "fail"
hint: && is the operator for and in java.

import java.util.*;
class Main {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int grade = s.nextInt();
	//your code here

  }
}
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int grade = s.nextInt();
        //your code here
        String g = (grade >= 90)? "excellent" :(grade >= 70 && grade < 90)? "good"
                :(grade > 60 && grade < 70)? "pass": "fail";
        System.out.println(g);
    }
}
