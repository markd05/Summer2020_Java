package Assignments.Assignments151to200.Assignments161to170;

public class A167 {
    /*
    In this task, you need to write 2 methods findMax() that will find a maximum number in the array.
    First method should work with array of integers (int[]) and return int,
    and second method should work with an array of doubles (double[]) and return double as a result.
Methods must have the same name and different parameters.
For more information:  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
Comment: Methods should be non static and with a return type.

import java.util.*;

public class Main {
  //WRITE YOUR CODE HERE

}
     */

    public int findMax(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int each : a) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public double findMax(double[] a) {
        double max = Integer.MIN_VALUE;
        for (double each : a) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        A167 obj = new A167();
        int[] arr = {1,2,5,7,9,2,4,6,8};
        System.out.println(obj.findMax(arr));
        double[] array = {2,4,7,4,2,8,6,9,54,2,5};
        System.out.println(obj.findMax(array));
    }
}
