package Days21to30.Day29_ReturnMethods;

import java.util.Arrays;

public class MethodOverloading {
    //overloading: same method name, different parameters

    public static void main(String[] args) {
        int result = sum(10,20,30);
        System.out.println(result);

        System.out.println(sum(10,20,30));

        System.out.println(sum(0.5,10.5));

        //overload method example: the sort methods of Array class, it accepts all data types

        int[] arr = {1,2,3,4,5};
        sort(arr);

        char[] ch = {'a', 'b', 'c'};
        sort(ch);

        String[] str = {"A", "B", "C", "D"};
        sort(str);
    }


    public static int sum(int a, int b) {
        return a+b;
    }

    public static int sum(int a, int b, int c) {
        return a + (int)b + c;
    }

    //public static double sum(int a, int b) { //parameters must be different
    //    return a+b;}

    public static double sum(double a, double b) {
        return a+b;
    }

    //write a method called sort, that can sort an int array in descending order
    public static void sort(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(char[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(String[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
