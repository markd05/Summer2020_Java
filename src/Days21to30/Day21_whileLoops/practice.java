package Days21to30.Day21_whileLoops;
import java.util.Scanner;
public class practice {

    public static void main(String[] args) {

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter two numbers");
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println("The sum of the two numbers is: " + (a + b));

            System.out.println("Do you want to continue?");
            String answer = scan.next();
            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        } while (true);

    }
}
