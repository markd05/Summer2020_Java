package Days21to30.Day25_ArraysContinue;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {

        int num1 = 10;
        System.out.println(num1);

        int[] arr = {10, 20, 30};
        System.out.println(arr);

        /*
            to print entire array as whole
                Arrays.toString(variableName):
                    used for converting single dimensional arrays to String value
         */
        String str = (Arrays.toString(arr));
        System.out.println(str);

        String[] names = {"Elvira", "Bibish", "Tural", "Daulet", "Hakan"};

        System.out.println(names[0]);
        System.out.println(names); //hashcode
        System.out.println(Arrays.toString(names));

        /*
            Arrays.sort(variableName):
                used to sort the values of the Array in ascending order
                (smallest to largest for numbers,) alphabetical order for Strings
         */
        int[] numbers = {9,8,100,3000,4,5,6};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("Maximum: " + numbers[numbers.length-1]);
        System.out.println("Minimum: " + numbers[0]);

        String[] NameLists = {"Alma", "Enes", "Myra", "Smith", "Sarah", "Lexi"};
        Arrays.sort(NameLists); //alphabetical order
        System.out.println(Arrays.toString(NameLists));

        char[] ch = {'0', '9', '8', '5', '3', '2', '1'};
        Arrays.sort(ch);
        System.out.println(ch);
        System.out.println(Arrays.toString(ch));

        int[] nums = {2000, 90, 89, 78, 65, 5555, 444, -5};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Minimum number: " + nums[0]);
        System.out.println("Maximum number: " + nums[nums.length-1]);
        System.out.println("Second Maximum Number: " + nums[nums.length-2]);
        System.out.println("Second Minimum number: " + nums[1]);

        /*
            write a program that can print the arrays in descending order
         */

        int[] myNumbers = {99, 10, 200, 3000, 40, 50, 5000};
        Arrays.sort(myNumbers);

        System.out.println(Arrays.toString(myNumbers));

        String result = "[";
        for (int i = myNumbers.length-1; i >= 0; i--) {
            result += myNumbers[i] + ", ";
        }
        System.out.println();
        result = result + "]";
        result = result.substring(0,result.length()-3) + "]";
        System.out.println(result);

        int[] arr2 = {99, 10, 200, 3000, 40, 50, 5000};
        int[] arr3 = new int[arr2.length];
        int z = 0;
        Arrays.sort(arr2);

        for (int i = arr2.length-1; i >= 0; i--) {
            arr3[z] = arr2[i];
            z++;
        }
        System.out.println("Ascending order: " + Arrays.toString(arr2));
        System.out.println("Descending order: " + Arrays.toString(arr3));

    }
}