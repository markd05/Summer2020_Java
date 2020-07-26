package Days21to30.Day28_JavaRecap;

import java.util.Arrays;

public class quiz {
    public static void main(String[] args) {

        char[] ch = {'a', 'b', 'c'};
        int z = ch.length; //3
        int count = 0;

        while (count < z - 1) {

            count++;
        }
        System.out.println(count);

        String[] arr = {"Maral", "Nurullah"};
        arr[0] = arr[1]; //["Nurullah", "Nurullah"]
        arr[1] = arr[0]; //["Nurullah", "Nurullah"]
        System.out.println(Arrays.toString(arr));

        char[] characters = {'a', 'b', 'c'};
        for (char each : ch) {
            if (each == 'b') {
                continue;
            }
            System.out.print(each + " ");
        }
        System.out.println();

        long[] Arr = new long[2]; //[0,0]
        Arr[0] = 5L; //[5,0[
        Arr[1] = 10L; //[5,10]

        Arr = new long[4]; //[0,0,0,0]
        Arr[2] = 15L; //[0,0,15,0]
        Arr[3] = 20L; //[0,0,15,20]
        System.out.println(Arrays.toString(Arr));
    }
}
