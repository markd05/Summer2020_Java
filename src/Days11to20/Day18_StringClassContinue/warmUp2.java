package Days11to20.Day18_StringClassContinue;
import java.util.Scanner;
public class warmUp2 {
    /*
        DoNaLd
        TrUMp

        output:
        Donald Trump
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String firstName = scan.next();
        String lastName = scan.next();
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);

    }
}
