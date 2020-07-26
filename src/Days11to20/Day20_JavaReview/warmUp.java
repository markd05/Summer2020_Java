package Days11to20.Day20_JavaReview;

public class warmUp {

    public static void main(String[] args) {

        //01:
        int sum1 = 0;
        for (int i = 1; i <= 1000; i++) {
            sum1 += i;
        }
        System.out.println("sum of all nums: " + sum1);

        //02:
        int sum2 = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                sum2 += i;
            }
        }
        System.out.println("sum of all even numbers: " + sum2);

        //03:
        int sum3 = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 1) {
                sum3 += i;
            }
        }
        System.out.println("sum of all odd numbers " + sum3);

    }

}
