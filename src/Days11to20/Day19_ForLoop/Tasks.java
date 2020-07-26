package Days11to20.Day19_ForLoop;
import java.util.Scanner;
public class Tasks {

    public static void main(String[] args) {

        // 1:
        for (int i = 1; i <= 32; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number");
            }
            }

        // 2:
        for (int a = 1; a <= 32; a++) {
            if (a % 2 == 1) {
                System.out.println(a + " is an odd number");
            }
        }

        // 3:
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int a = scan.nextInt();
        for (int b = 1; b <= 12; b++) {
            System.out.println(a + " times " + b + " equals " + a*b);
        }

    }

}
