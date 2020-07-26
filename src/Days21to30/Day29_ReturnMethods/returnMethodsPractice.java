package Days21to30.Day29_ReturnMethods;

import java.util.Arrays;

public class returnMethodsPractice {

    public static void main(String[] args) {
        sum(10,20);
        //int max = sum(10,20); //the method sum does not return any value

        addition(10,20); //this method is an int value
        System.out.println(addition(10,20));
        long num = addition(10,20);
        System.out.println(num);

        int max = (int) greaterNumber(90,20,30);
        System.out.println(max);

        int[] arr = {20, 30, 1, 2, 3, 5, 9};
        int maxNum = maximum(arr);
        System.out.println(maxNum);

        int[] arr2 = {10000, 90000, 823112, 762112, 654312};
        int maxNum2 = maximum(arr2);
        System.out.println(maxNum2);

        int[] array = {1,2,3,4,5,6,7};
        array = Sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sum(int a, int b) {
        System.out.println(a+b);
    }

    public static int addition(int a, int b) {
        return a+b;
    }

    //write a method that accepts 3 numbers and returns the largest number
    public static double greaterNumber(int a, int b, int c) {
        int[] arr = {a,b,c};
        Arrays.sort(arr);

        return arr[arr.length-1];
    }

    //write a method that accepts an int array and returns the maximum number from the array
    public static int maximum(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    //write a method that accepts an int array and sorts it then returns an array
    public static int[] Sort(int[] arr) {
        Arrays.sort(arr);
        int[] numbers = new int[arr.length];
        int z = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            numbers[z] = arr[i];
            z++;
        }
        return numbers;
    }


}
