package Assignments.Assignments1to50.Assignments21to30;
import java.util.Scanner;
public class A021 {
    /*
    using an if statement check which int is larger a or b, and then output:
"number is greater".
for example:
a=1
b=2
output:
2 is greater

a=5
b=7
output:
7 is greater

import java.util.*;
class Main {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int b = s.nextInt();
	//WRITE YOUR CODE HERE:

  }
}
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        //WRITE YOUR CODE HERE:
        if (a > b) {
            System.out.println(a + " is greater");
        }
        if (b > a) {
            System.out.println(b + " is greater");
        }
    }
}
