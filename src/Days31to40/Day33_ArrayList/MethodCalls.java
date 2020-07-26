package Days31to40.Day33_ArrayList;

import javax.swing.plaf.IconUIResource;

public class MethodCalls {

    public static void main(String[] args) {
        method1(); //method cannot call itself
        method3();

        int max2 = max(10, 20); //20
        System.out.println(max2);

        int max3 = max(100, 200, 50);
        System.out.println(max3);

        maximum(400, 50000, 999999);

        String str = print(10, 20, 30);
        System.out.println(str);

        removeDup("AABBBCCCDD");

        occurred("ABAB", "A");

        //frequency("AAABBBCCCDD", "A");
    }

    public static void method1() {
        //method2();
        System.out.println("A");
    }

    public static void method2() {
        method1();
        System.out.println("B");
    }

    public static void method3() {
        method2();
        System.out.println("C");
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int max(int a, int b, int c) {
        //int largestNum = max(a, b);

        return (max(a, b) > c) ? max(a, b) : c;
    }

    public static int max(int a, int b, int c, int d) {
        /*
        int result = max(a, b, c);
        if (result > d) {
            return result;
        }
        return d;
         */

        return max(max(a, b) , max(c, d));
    }

    public static void maximum(int a, int b, int c) {
        System.out.println(max(a, b, c));
    }

    public static String print(int a, int b, int c) {
        maximum(a, b, c);
        return "";
    }

    public static int max(int a, int b, int c, int d, int e) {
        //return max(max(a, b, c, d), e);

        return max(max(a,b,c), max(d,e));
    }

    /*
        Assignment:
            1. write a return method that can remove duplicates from a String
                Ex: removeDup("AABBBCCCDD") ==> ABCD

            2. write a return method that passes two String parameters, a and b,
                and return the number of appearances of b in a
                    Ex: occurred("ABAB", "A") ==> 2

            3. combine method1 and method2 to write a method that can find the frequency of characters
                Ex: frequency("AAABBBCCCDD") ==> A3B3C3D2
     */

    public static void removeDup(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.substring(i, i + 1))) {
                result += str.substring(i,i+1);
            }
        }
        System.out.println(result);
    }

    public static void occurred(String str, String str2) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            if (str.substring(i, i + str2.length()).contains(str2)) {
                count++;
            }
        }
        System.out.println(count);
    }

    /*
    public static void frequency(String str, String str2) {
        String result = "";
        int count = 0;
        occurred(str, str2);
        removeDup(str);
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(i,i+1) + count;
        }
     */

}
