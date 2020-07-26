package Days11to20.Day20_JavaReview;

import java.util.Scanner;

public class StringMethods {
    /*
        methods:
            substring, indexOf, lastIndexOf, replace, replaceFirst, equal, equalIgnoreCase, contains, startsWith,
            endsWith, charAt, trim, length, concat, isEmpty
     */
    public static void main(String[] args) {

        /*
            substring: creating the subvalue of the String
                       ending index is excluded
         */
        String str = "Cybertek School";
        str = str.substring(0,str.indexOf(" "));
        System.out.println(str);


        // indexOf: returns the first occurred value's index number

        String s1 = "Java is a fun language, I love Java";
        System.out.println(s1.indexOf("a")); //1
        System.out.println(s1.indexOf("ag")); //19

        // lastIndexOf: returns the last occurred char's index num
        System.out.println(s1.lastIndexOf("a")); //34

        //replace: replaces the old value with then new one
        String name = "Cybertek School Batch 12";
        int length = name.length();
        System.out.println(length); //24

        name = name.replace(" ", "");
        System.out.println(name.length()); //21

        name = name.replace("e", "a");
        System.out.println(name);

        //replaceFirst: replaces the first occurred old character with the new character
        String A1 = "Java is fun, Java is object oriented";
        A1 = A1.replaceFirst("Java", "C++");
        System.out.println(A1);

        /*
            ==, equals, equalIgnoreCase
         */
        String R1 = "Cybertek"; //String pool
        String R2 = new String("Cybertek"); //heap
        String R3 = new String(("cybertek")); //heap

        System.out.println(R1 == R2); //false, different location

        System.out.println(R1.equals(R2)); //true

        System.out.println(R1.equals(R3)); //false, case sensitivity

        System.out.println(R1.equalsIgnoreCase(R3)); //true

        // trim: remove the unused spaces
        String spaces = "              M                ";
        spaces = spaces.trim();
        System.out.println(spaces);

        //charAt(index): returns a specific character from the String
        String C1 = "Cybertek";
        //           01234567
        char ch = C1.charAt(4);
        System.out.println(ch);

        String C2 = "Please do more and more java practices tomorrow";
        char ch2 = C2.charAt(C2.lastIndexOf("o") + 1);
        System.out.println(ch2);

        //startsWith & endsWith: returns boolean, checks the starting end ending values
        String Gmail = "cybertekSchol@gmail.com";
        boolean R = Gmail.endsWith("@gmail.com");
        System.out.println(R);

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your email address");
        String GmailAddress = scan.nextLine();

        if (GmailAddress.endsWith("@gmail.com")) {
            System.out.println("It's a valid gmail address");
        } else {
            System.out.println("Invalid gmail address");
        }

        // starts with www.
        System.out.println("Enter a web address");
        String URL = scan.nextLine().toLowerCase();

        if (URL.startsWith("www.") && URL.endsWith(".com")) {
            System.out.println("It's a valid web address");
        } else {
            System.out.println("it's invalid web address");
        }

        //contains: checks if the given value is contained in the String or not then returns boolean
        String salary = "1000$";
        boolean result = salary.contains("$");
        System.out.println(result);

        //concat: concats two String values
        String schoolName = "Cybertek";
        schoolName = schoolName.concat(" School"); //Cybertek School
        System.out.println(schoolName);

    }

}
