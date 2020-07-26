package Assignments.Assignments101to150.Assignments101to110;

import java.util.Scanner;

public class A108 {
    /*
    Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.

Example of the program:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no

Guest's list: Nick, Linda

class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// your code here
	// ------------------------------------------

  }
}
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // your code here
        // ------------------------------------------
        String names = "";
        do {
            System.out.println("Please enter guest name:");
            names += input.nextLine() + ", ";
            System.out.println("Do you want to enter new guest name:");
            String answer = input.nextLine();
            if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid");
                System.out.println("Do you want to enter new guest name:");
                answer = input.nextLine();
            }
            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        } while (true);
        System.out.println(names.substring(0,names.length()-2));

    }
}
