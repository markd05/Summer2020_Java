package Days11to20.Day15_Scanner_StringClass;
import java.util.Scanner;
public class Task01 {
    /*
        write a program that calculates the sum of two numbers entered by the user
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = scan.nextInt();

        System.out.println("Enter the second number");
        int n2 = scan.nextInt();

        System.out.println("The sum is: " + (n1 + n2));

    }

}
