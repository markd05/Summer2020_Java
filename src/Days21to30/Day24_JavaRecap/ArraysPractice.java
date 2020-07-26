package Days21to30.Day24_JavaRecap;

import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        /*
            ask user to enter 5 numbers, then find the sum of those 5 numbers
            MUST use Array
         */

        Scanner scan = new Scanner(System.in);

        /*
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter a number");
            num[i] = scan.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("The sum is: " + sum);
    */
        /*
            ask the user to enter 5 names, then return the longest name
         */

        String[] names = new String[5];
        String longestName = "";
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter a name");
            names[i] = scan.next();
        }
        for (int i =0; i < names.length; i++) {
            if (names[i].length() > longestName.length()) {
                longestName = names[i];
            }
        }
        System.out.println("Longest name is: " + longestName);

    }
}
