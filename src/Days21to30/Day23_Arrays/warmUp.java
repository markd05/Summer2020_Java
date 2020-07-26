package Days21to30.Day23_Arrays;

import java.util.Scanner;

public class warmUp {

    public static void main(String[] args) {

        int x = 20;
        ;
        ;
        int y = 6;
        int count = 0;
        while (x >= y) {
            x -= y;
            count++;
        }

        System.out.println(count); //result after dividing two numbers
        System.out.println(20 / 6);
        System.out.println(x); //remainder

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = 0;

        int A, B;
        if (num1 > num2) {
            A = num1;
            B = num2;
        }

        if (num2 != 0) {
            while (num1 >= num2) {
                num1 -= num2;
                result++;
            }
            System.out.println("division is: " + result + " with a remainder of: " + num1);

        } else {
            System.out.println("Invalid Entry");
        }
    }

}
