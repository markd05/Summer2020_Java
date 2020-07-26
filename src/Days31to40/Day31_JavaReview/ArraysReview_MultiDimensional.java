package Days31to40.Day31_JavaReview;

import java.util.Arrays;

public class ArraysReview_MultiDimensional {
    /*
        n dimensional array: contains (n-1) arrays
     */
    public static void main(String[] args) {

        int[] arr1D = {1, 2, 3};

        int[][] arr2D = { {1, 2, 3} , {4, 5, 6} };

        //[index num of 1D arrays][index num of each value]

        //print 2:
        System.out.println(arr2D.length); //2

        //print: {4, 5, 6}:
        System.out.println(arr2D[1]); //hashcode
        System.out.println(Arrays.toString(arr2D[1]));

        //print: { {1, 2, 3} , {4, 5, 6} }:
        System.out.println(Arrays.toString(arr2D)); //hashcodes

        //Arrays.deepToString(variableName): converts multi dimensional arrays to String
        String str = Arrays.deepToString(arr2D);
        System.out.println(str);

        char[] ch = {'a', 'b', 'c', 'd'};
        for (char each : ch) {
            if (each == 'c') {
                continue;
            }
            System.out.print(each + " ");
        }
        System.out.println();


        String[][] names = { {"Erhan", "Holy", "Denis", "John Snow", "Tarzan"} , {"Muhtar", "Mike", "Ariya", "Dilyar", "Nadira"} };

        for (String[] each1D : names) {
            //System.out.println(Arrays.toString(each1D));
            for (String eachValue : each1D) {
                if (eachValue.equals("Holy") || eachValue.equalsIgnoreCase("John Snow")) {
                    continue;
                }
                System.out.println(eachValue);
            }
        }

    }
}
