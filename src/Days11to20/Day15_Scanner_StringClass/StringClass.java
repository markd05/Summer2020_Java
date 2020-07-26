package Days11to20.Day15_Scanner_StringClass;

public class StringClass {

    public static void main(String[] args) {

        String str = "Cybertek";
        String A = "Cybertek";
        String B = "Cybertek";
        //All 3 Strings, str, A, and B are all the same, inside of the string pool
        System.out.println(A == B);

        String str2 = new String("Cybertek");
        //This String is not the same as the other 3 strings because this object is created outside the string pool
        System.out.println(str == str2); //different memory locations

        String str3 = new String("Cybertek");
        System.out.println(str2 == str3);

        String s1 = "cat";
        String s2 = "cat";
        System.out.println(s1 == s2); //same memory locations in string pool

        String s3 = new String("cat");
        String s4 = new String("cat");
        System.out.println(s3 == s4); //different memory locations

        System.out.println(s1 == s4); //different memory locations

        String a = "Batch 12";
        String b = "batch 12";
        System.out.println(a == b); //false, case sensitivity
    }
}
