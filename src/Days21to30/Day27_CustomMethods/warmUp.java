package Days21to30.Day27_CustomMethods;

public class warmUp {
    /*
        1. create an int array called numbers that has a length of 100
        2. assign 1~100 to the array's indexes
        3. use for each loop to print out all even numbers
     */
    public static void main(String[] args) {

        int[] numbers = new int[100];
        for (int i = 1; i < 100; i++) {
            numbers[i] = i + 1;
        }
        for (int each : numbers) {
            if (each % 2 != 0) {
                continue;
            }
            System.out.print(each + " ");
        }

    }
}
