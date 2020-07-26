package Days31to40.Day34_Constructors;

import java.util.ArrayList;

public class warmUp {
    /*
     1. write a return method that can remove duplicates from a String
        Ex: removeDup("abcabc") ==> returns "abc";

     2. write a return method that accepts two parameters String a and b,
     and returns the total number of appearances of b in String a
        Ex: count(:abcaba") ==> returns 3;

     3. use the above two methods to write a new method that can find the frequency of characters
        Ex: frequency("aabcabcabc") ==> a4b3c3

     4. write a return method that can find the maximum number from an Integer arrayList
        (DO NOT use sort methods from Collections class)

     5. write a return method that can find the minimum number from an Integer arrayList
        (DO NOT use sort methods of collections class
     */

    public static void main(String[] args) {

        //task01
        String a = removeDup("abcabc");
        System.out.println(a);

        //task02
        int count = count("abcdabcdaaa", "a");
        System.out.println(count);

        //task03
        System.out.println(frequency("abcabcaabbcccc"));

        //task04
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(0);
        list.add(30);

        int num = maximum(list); //30
        System.out.println(num);

        //task05
        int num2 = minimum(list); //0
        System.out.println(num2);
    }

    //task01
    public static String removeDup(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.substring(i, i+1))) {
                result += str.substring(i, i+1);
            }
        }
        return result;
    }

    //task02
    public static int count(String a, String b) {
        int count = 0;
        while (a.contains(b)) {
            count++;
            a = a.replaceFirst(b, "");
        }
        return count;
    }

    //task03
    public static String frequency(String str) {
        String nonDup = removeDup(str);
        String result = "";

        for (int i = 0; i < nonDup.length(); i++) {
            int count = count(str, "" + nonDup.charAt(i));
            result += "a" + count;
        }
        return result;
    }

    //task04
    public static int maximum(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int each : list) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    //task05
    public static int minimum(ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int each : list) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }
}
