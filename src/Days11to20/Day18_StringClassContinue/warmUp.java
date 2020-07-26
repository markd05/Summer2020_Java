package Days11to20.Day18_StringClassContinue;
import java.util.Scanner;
public class warmUp {
    /*
        write a program that asks the user's first and last name, then prints out the initials of the user
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String firstName = scan.next();
        String lastName = scan.next();
        String initials = firstName.substring(0,1).concat(".").concat(lastName.substring(0,1));
        initials = initials.toUpperCase();
        System.out.println("Your initials are: " + initials);

        String lastLetters = firstName.charAt(firstName.length()-1) + "." + lastName.charAt(lastName.length()-1);
        System.out.println("Last letters are: " + lastLetters);
    }
}
