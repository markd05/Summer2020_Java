package Days11to20.Day15_Scanner_StringClass;
import java.util.Scanner;
public class Task02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();

        double largest = (n1 > n2 && n1 > n3)? n1 :(n2 > n1 && n2 > n3)? n2 :n3;
        System.out.println("The largest number is: " + largest);

    }

}
