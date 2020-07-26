package Assignments.Assignments1to50.Assignments41to50;
import java.util.Scanner;
public class A041 {
    /*
    Write a program that asks user to input int values: areaCode and localNumber.
-Using concatenation put together in this format and assign to String phoneNumber  variable:
-(222)-3334444
-Write a print statement that displays (use phoneNumber variable ):
Calling number (222)-3334444

import java.util.Scanner;

public class Main {
  //YOUR CODE HERE

}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your area code");
        String area = "(" + scan.nextLine() + ")";
        System.out.println("Please enter your local number");
        String local = scan.nextLine();
        String phoneNumber = area + "-" + local;
        System.out.println("Calling number " + phoneNumber);



    }
}
