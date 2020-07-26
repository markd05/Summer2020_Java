package Days21to30.Day28_JavaRecap;

import java.util.Arrays;

public class ArraysReview {

    public static void main(String[] args) {
        /*
        single dimensional array:
            three was to declare:
                int[] arr1D = {1,2,3,4};
                int arr1D[] = {1,2,3,4};
                int arr1D[] = new int{1,2,3,4};
        */
        //int arr1D = new int[]{1, 2, 3, 4};
        int arr1D[] = {1, 2, 3, 4};
        //index:       0  1  2  3
        System.out.println(arr1D[2]); //3

        //initialize the size on 1D array: int[] arr = new int[Length number]
        int[] arr = new int[3]; //[0, 0, 0]
            //this array can contain three values
        arr[1] = 10; //[0, 10, 0]
        arr[0] = 30; //[30, 10, 0]
        arr[2] = 40; //[30, 10, 40]
        //arr[3] = 50; //Array's size is fixed
        //to print out the array: array needs to be converted into string
        System.out.println(Arrays.toString(arr));

        int[] numbers = {10, 20, 30, 40};

        for (int eachValues : numbers) {
            if (eachValues == 20) {
                continue; //skips every single statement after the continue
            }
            System.out.print(eachValues + " "); //10 30 40
            break; //exits the loop immediately
        }
        System.out.println();

        int[] nums = {100, 200, 300, 400};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 300) {
                break;
            }
            System.out.println(nums[i] + " ");
        }

        /*
        Arrays Util class: toString() , sort() , deepToString()

            toString(): converting single dimensional array to String
            sort(): sorting single dimensional array in ascending order
            deepToString(): converting multi-dimensional array to String
         */

        //sort()//
        long[] Larr = {20, 400, 500, 300, 10, 20};
        System.out.println(Arrays.toString(Larr));
        Arrays.sort(Larr);
        System.out.println(Arrays.toString(Larr));

        //deepToString90:
        int[][] arr2D = { {1, 2} , {3, 4} };
        System.out.println(Arrays.toString(arr2D)); //Arays.toString cannot convert multi-dimensional arrays into String
        System.out.println(Arrays.deepToString(arr2D));

    }
}
