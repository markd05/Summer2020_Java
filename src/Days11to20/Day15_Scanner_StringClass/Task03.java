package Days11to20.Day15_Scanner_StringClass;
import java.util.Scanner;
public class Task03 {
    /*
        write a program that asks the user to enter their first and last name, at the end, system should display
        their full name
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.nextLine();
        System.out.println("Enter your last name");
        String lastName = input.nextLine();
        System.out.println("Your full name is: " + firstName + " " + lastName);

        System.out.println("Enter char value");
        char ch = input.next().charAt(0);

    }

}
