package Days11to20.Day15_Scanner_StringClass;

import java.util.Scanner;

public class StringInput {
    /*
        next vs nextLine();

        nextLine: takes the entire input
        next: takes the first word
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next(); //returns the user input as a string

        System.out.println("Enter your last name");
        String lastName = scan.next();

        System.out.println("first name is: " + firstName);
        System.out.println("last name is: " + lastName);

    }

}
