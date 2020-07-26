package Days21to30.Day26_ForEach;

import java.util.Arrays;

public class ForEach {

    public static void main(String[] args) {

         /*
            syntax:
                for (dataType each: ArrayName) {

                }
            IntelliJ will try to simplify normal for loops into for each loops if it can
          */

        int[] arr = {1,2,3,4,5};
        for (int value : arr) {
            System.out.println(value);
        }

        System.out.println("===================");
        for (int each : arr) {
            System.out.println(each);
        }

        String[] str1 = {"A", "B", "C", "D", "E", "F"};
        for (String each : str1) {
            System.out.println(each);
        }

        char[] ch = {'z', 'x', 'y', 'c', 'a', 'b'};
        Arrays.sort(ch);
        for (int each : ch) {
            System.out.println(each);
        }

        int[] arr1 = {1,2,3,4,4,5,6,7,8,9,10};
        for (int varname : arr1) {
            if (varname % 2 == 0) {
                System.out.print(varname + " ");
            }
        }
        System.out.println();

    }

}
