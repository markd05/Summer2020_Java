package Days21to30.Day24_JavaRecap;

public class warmUp2 {
    /*
        3. write a program that returns the minimum value from an int array
        4. write a program that returns that second minimum value from an int array
     */
    public static void main(String[] args) {
        int[] arr = {100, 2, 2, 3, 4, 5, 6};
        int min = 999999999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum is: " + min);

        int secondMin = 999999999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }
        System.out.println("Second minimum is: " + secondMin);
    }
}
