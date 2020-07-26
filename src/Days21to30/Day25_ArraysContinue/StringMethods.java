package Days21to30.Day25_ArraysContinue;

import java.util.Arrays;

public class StringMethods {
    /*
        split(str): splits the string by the given value and returns it as a String array

        toCharArray(): returns a char array from the String
     */
    public static void main(String[] args) {

        //split(str):
        String sentence = "Today is great day, Good day to learn java";
        String[] arr = sentence.split(" ");
        System.out.println(Arrays.toString(arr));

        String email = "FirstName_LastName";
        String[] arr2 = email.split("_");
        String str = (Arrays.toString(arr2));
        System.out.println(str.replace("[", "").replace("]", ""));

        String fullName = "Cybertek School Batch12";
        String[] array1 = fullName.split(" ");
        System.out.println(array1);

        String Java = "I love Java and Java is fun, Java is life";
        String[] array2 = Java.split("Java");
        System.out.println(Arrays.toString(array2));
        System.out.println(array2.length-1);

        String emailAddress = "Cybertek.school.batch12@gmail.com";
        String FullName = emailAddress.substring(0,emailAddress.indexOf("@"));
        System.out.println(FullName);

        String[] AllNames = FullName.split("\\.");
        System.out.println(Arrays.toString(AllNames));

        //toCharArray():
        String Str = "Java";
        char[] ch = Str.toCharArray();
        System.out.println(Arrays.toString(ch));

    }
}
