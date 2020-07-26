package Days21to30.Day26_ForEach;

import java.util.Arrays;

public class ForEach_MulitD {

    public static void main(String[] args) {

        //n dimensional array contains (n -1) dimensional arrays

        int[] arr1D = {1,2,3,4};
        for (int each : arr1D) {
            System.out.println(each);
        }

        int[][] arr2D = { {1,2,3,4} , {5,6,7,8} };

        for (int i = 0; i < arr2D.length; i++) {
        //counts the 1D arrays
            for (int j = 0; j < arr2D[i].length; j++) {
            //counts the 2D arrays
                System.out.print(arr2D[i][j] + " ");
            }
        }
        System.out.println();

        for (int[] each : arr2D) {
            for (int each2 : each) {
                System.out.println(each2 + " ");
            }
        }

        String[][] str2D = { {"Bibish" , "Syfo"} , {"Syfoooo" , "Julia"} };

        for (String[] each1 : str2D) {
            for (String each2 : each1) {
                System.out.println(each2 + " ");
            }
        }

        int[][] num2D = { {1,2}, {3,4} };

        int[][][] num3D = { { {1,2} , {3,4} } , { {5,6} , {7,8} } };

        for (int[][] each2D : num3D) {
            for (int[] each1D : each2D) {
                for (int each : each1D) {
                    System.out.println(each);
                }
            }
        }

    }

}
