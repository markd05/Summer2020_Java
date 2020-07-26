package Days11to20.Day17_StringClass;
import java.util.Scanner;
public class warmUp {
    /*
        1. Declare scanner class object
        2. ask user to enter first and last name
        3. declare a variable called fullName
        4. concat first and lastName and assign it for fullName
        5. display in console total number of characters in full name
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String firstName = input.next();
        String lastName = input.next();
        String fullName = firstName.concat(lastName);
        System.out.println(fullName + " contains " + fullName.length() + " characters");

    }

}
