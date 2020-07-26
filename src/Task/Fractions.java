package Task;
import java.util.Scanner;
public class Fractions {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        double total = 0;
        double a;
        for (double i = 1; i <= n; i++) {
            a = (1/i);
            total += a;
            System.out.println(i + "             " + a + "           " + total);
        }

        System.out.println("1 over every number from 1 to " + n + " is " + total);

    }
}
