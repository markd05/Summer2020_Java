package Days31to40.Day31_JavaReview;

import java.util.Arrays;
import java.util.Scanner;

public class warmUp {

    public static void main(String[] args) {

        // ask user to enter 3 numbers and find the maximum and minimum numbers
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Enter 3 numbers");
        arr[0] = scan.nextInt();
        arr[1] = scan.nextInt();
        arr[2] = scan.nextInt();
        Arrays.sort(arr);
        System.out.println("Maximum is: " + arr[arr.length-1]);
        System.out.println("Minimum is: " + arr[0]);

    }

}
