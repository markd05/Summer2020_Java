package Days31to40.Day33_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class warmUp {
    /*
    write a return method that accepts an int array and sorts it in descending order

    write a return method that accepts an double array and sorts it in descending order

    write a return method that accepts an char array and sorts it in descending order

    write a return method that accepts an String array and sorts it in descending order

        Hint: method overloading is preferred here
     */
    public static void main(String[] args) {
        int[] arr = {10, 89, 20, 300, 10, 900, 0, 1};
        arr = sortDe(arr);
        System.out.println(Arrays.toString(arr));

        double[] arr2 = {10.5, 5.5, 300, 2.0, 6.5};
        System.out.println(Arrays.toString(sortDe(arr2)));

        char[] ch = {'c', 'a', 'b', 'z', 'x', 'k'};
        ch = sortDe(ch);
        System.out.println(Arrays.toString(ch));

        String[] names = {"Mikray", "Jin", "Minever", "Nurzat", "Viktoria", "Erhan"};
        names = sortDe(names);
        System.out.println(names);
    }

    public static int[] sortDe(int[] arr) {
        Arrays.sort(arr); //ascending order
        int[] arr2 = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            arr2[j] = arr[i];
            j++;
        }
        return arr2;
    }

    public static double[] sortDe(double[] arr) {
        Arrays.sort(arr); //ascending order
        double[] arr2 = new double[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            arr2[j] = arr[i];
            j++;
        }
        return arr2;
    }

    public static char[] sortDe(char[] arr) {
        Arrays.sort(arr); //ascending order
        char[] arr2 = new char[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            arr2[j] = arr[i];
            j++;
        }
        return arr2;
    }

    public static String[] sortDe(String[] arr) {
        Arrays.sort(arr); //ascending order
        String[] arr2 = new String[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            arr2[j] = arr[i];
            j++;
        }
        return arr2;
    }

}
