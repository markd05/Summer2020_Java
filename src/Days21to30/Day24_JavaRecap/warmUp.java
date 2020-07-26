package Days21to30.Day24_JavaRecap;

public class warmUp {
    /*
        1. write a program that can return the maximum value from an int array
        2. write a program that can return the second maximum value from an int array
     */
    public static void main(String[] args) {

        int[] arr = {20, 200, 30, 40, 50, 500};
        int maximum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        System.out.println("Maximum number is: " + maximum);

        int secondMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] != maximum) {
                secondMax = arr[i];
            }
        }
        System.out.println("Second maximum number is: " + secondMax);

    }
}
