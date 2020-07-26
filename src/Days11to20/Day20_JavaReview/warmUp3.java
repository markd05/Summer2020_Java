package Days11to20.Day20_JavaReview;
import java.util.Scanner;
public class warmUp3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = 0;

        for (int i = 1; i <=5; i++) {
            System.out.println("Enter a number");
            int inputNum = scan.nextInt();
            if (inputNum > max) {
                max = inputNum;
            }
        }
        System.out.println("The max number is :" + max);

    }
}
