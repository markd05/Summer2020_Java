package Assignments.Assignments1to50.Assignments41to50;
import java.util.Scanner;
public class A042 {
    /*
    Write a program that outputs the number of hours, minutes, and seconds that
corresponds to input total seconds.
-create a Scanner object
- declare int variables inputSeconds, hours, minutes, seconds
-Ask user enter seconds by printing:
"Enter seconds:"
-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result.

Example run:
Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
import java.util.*;

class Main {
  public static void main(String[] args) {
	//YOUR CODE HERE:

  }
}
     */
    public static void main(String[] args) {

        int inputSeconds, hours = 0, minutes = 0, seconds = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds");
        inputSeconds = scan.nextInt();
        if (inputSeconds > 59){
            if (inputSeconds/60 > 0){
                minutes += inputSeconds/60;
            seconds = inputSeconds%60;
            }
        }
        if (minutes > 59) {
            if (minutes / 60 > 0) {
                hours += minutes/60;
            minutes %= 60;
            }
        }
        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");


    }
}
