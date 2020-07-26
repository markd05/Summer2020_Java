package Days11to20.Day16_Recap;
import java.util.Scanner;
public class WarmUp {
    /*
        write a java program that asks user to enter first and last name, then print out the user's
        full name in all capital letters
        full name: LastName FirstName
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String firstName = scan.next(), lastName = scan.next();
        String fullName = firstName.concat(" " + lastName);
        fullName = fullName.toUpperCase();
        System.out.println("Your full name is: " + fullName);

    }

}
