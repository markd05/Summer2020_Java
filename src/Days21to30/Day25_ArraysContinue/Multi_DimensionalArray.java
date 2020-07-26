package Days21to30.Day25_ArraysContinue;

import javafx.util.converter.NumberStringConverter;

import java.util.Arrays;

public class Multi_DimensionalArray {
    /*
        n dimensional array contains multiple (n-1) dimensional array
     */
    public static void main(String[] args) {

        int[] arr1D = {1,2,3};

        // 2 dimensional array: array that contains 1 dimensional arrays

        int[][] arr2D = { {1,2,3}, {4,5,6} };

        String[] arr = {"A", "B"};

        //                     0    1      0    1    2
        String[][] str2D = { {"A", "B"}, {"C", "D", "E"} };
        //                       0           1
        //[represents the index number of one dimensional arrays][represents the index number of the values]

        //print A:
        System.out.println(str2D[0][0]);

        //print D:
        System.out.println(str2D[1][1]);

        //print E:
        System.out.println(str2D[1][2]);

        //print A,B:
        System.out.println(Arrays.toString(str2D[0]));

        //print C,D,E:
        System.out.println(Arrays.toString(str2D[1]));

        //Arrays.deepToString(variableName): converts multi-dimensional Arrays to String

        //print [[A,B], [C,D,E]]
        System.out.println(Arrays.toString(str2D));
        System.out.println(Arrays.deepToString(str2D));

        int[][] numbers2D = { {1,2}, {3,4}, {5,6,7,8,9,10} };

        //print 6:
        System.out.println(numbers2D[2][1]);

        //print 10:
        System.out.println(numbers2D[2][5]);

        //print {5,6,7,8,9,10}:
        System.out.println(Arrays.toString(numbers2D[2]));

        //print the entire 2D array:
        System.out.println(Arrays.deepToString(numbers2D));

        //3 dimensional arrays contains multiple 2 dimensional arrays
        int[][] Array2D = { {1,2}, {3,4} };

        int[][][] Array3D = { { {1,2} , {3,4} } , { {5,6} , {7,8} } };
        //[index oF 2D array][index of 1D array][index number of values]

        //print 8:
        System.out.println(Array3D[1][1][1]);

        //print {5,6}:
        System.out.println(Arrays.toString(Array3D[1][0]));

        //print the entire 3d array
        System.out.println(Arrays.deepToString(Array3D));

        int[][][] numbers3D = { { {1,2} } , { {3,4} } };



    }
}
