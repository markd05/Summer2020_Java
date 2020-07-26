package Days21to30.Day26_ForEach;

import java.util.Arrays;

public class warmUp {
    /*
        write a program that can check if two Strings are built out of the same letters
        Ex:
            if str1 = "aabbcc"; str2 = "cab";
            output: true

            if str1 = "abcd"; str2 = "abc";
            output: false

            Hint: you will need Array and Array's methods
     */
    public static void main(String[] args) {

        String a = "aabbcc", b = "cab";

        String a1 = ""; //store all non duplicated values from a

        for (int j = 0; j < a.length(); j++) {
            for (int i = 0; i < a.length(); i++) {
                if (!a1.contains(a.substring(j, j+1))) {
                    a1 += a.substring(j, j+1);
                }
            }
        }
        System.out.println(a1);

        String b1 = "";
        for (int j = 0; j < b.length(); j++) {
            for (int i = 0; i < b.length(); i++) {
                if (!b1.contains(b.substring(j, j+1))) {
                    b1 += b.substring(j, j+1);
                }
            }
        }
        System.out.println(b1);

        char[] ch1 = a1.toCharArray();
        System.out.println(Arrays.toString(ch1));
        char[] ch2 = b1.toCharArray();
        System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println("======================");
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        String str1 = Arrays.toString(ch1);
        String str2 = Arrays.toString(ch2);

        if (str1.equals(str2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
