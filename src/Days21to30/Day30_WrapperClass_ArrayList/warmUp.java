package Days21to30.Day30_WrapperClass_ArrayList;

public class warmUp {
    /*
        1. write a return method that accepts a String and removes duplicate values from the String

        2. write a return method that accepts String and returns the unique values from the String
     */

    public static void main(String[] args) {
        String str = revDup("aabbc");
        System.out.println(str);

        String str2 =uniqueValue("AABBCDEEE");
        System.out.println(str2);
    }

    //task01:
    public static String revDup(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.substring(i, i + 1))) {
                result += str.substring(i,i+1);
            }
        }
        return result;
    }

    //task02:
    public static String uniqueValue(String str) {
        String result = "";
        for (int j = 0; j < str.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                result += "" + str.charAt(j);
            }
        }
        return result;
    }
}
