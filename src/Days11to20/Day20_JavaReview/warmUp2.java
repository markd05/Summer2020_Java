package Days11to20.Day20_JavaReview;
import java.util.Scanner;
public class warmUp2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter your number");
            int inputNum = scan.nextInt();
            sum += inputNum;
        }
        System.out.println("sum is " + sum);

    }

}
