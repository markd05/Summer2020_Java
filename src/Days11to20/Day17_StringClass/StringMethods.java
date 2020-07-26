package Days11to20.Day17_StringClass;

public class StringMethods {

    public static void main(String[] args) {
         // == :
        String str1 = "Hello Javengers";
        String str2 = "Hello Javengers";
        boolean R1 = str1 == str2; //true, same memory location
        System.out.println(R1);

        String str3 = new String("public pool");
        String str4 = new String("public pool");
        boolean R2 = str3 == str4; //false, different memory locations
        System.out.println(R2);

        boolean R3 = str1 == str3; //false, different memory locations
        System.out.println(R3);

        /*
            String Methods:
            1. concat, 2. length, 3. charAt, 4. toUpperCase, 5. toLowerCase
         */

        /*
            str1.concat(str2): it takes a String, ad combines the two Strings and returns it as a new String value
         */
        String a = "Cybertek";
        a.concat(" School"); //String is immutable
        System.out.println(a); //Cybertek
        a = a.concat(" School");
        System.out.println(a); //Cybertek School

        /*
            String.length(): it returns the total number of characters as an int value
         */
        String LongName = "ABCDEFGHIJKLMN";
        System.out.println(LongName.length());

        /*
            charAt(): it returns the character of the index number as a char value
         */
        String name1 = "Muhtar";
        //index:        012345
        char ch = name1.charAt(5);
        System.out.println(ch); //r

        /*
            String.toUpperCase(): converts the String to Upper case, and returns it as a new String value

            String.toLowerCase(): converts the String to Lower case, and returns it as a new String
         */
        String name2 = "cybertek";
        name2.toUpperCase();
        System.out.println(name2); //cybertek
        name2 = name2.toUpperCase();
        System.out.println(name2); //CYBERTEK

        String name3 = "CYBERTEK";
        name3.toLowerCase();
        System.out.println(name3); //CYBERTEK
        name3 = name3.toLowerCase();
        System.out.println(name3); //cybertek

        /*
            String.trim(): used for removing the unused spaces, keeps spaces in between words
         */
        String s1 = "                    hello                ";
        s1.trim();
        System.out.println(s1);
        s1 = s1.trim();
        System.out.println(s1);

        String s2 = "           Cybertek              School       ";
        s2 = s2.trim();
        System.out.println(s2);

        String s3 = "   ";
        s3 = s3.trim();
        System.out.println(s3);

        /*
            String.substring(beginning index): creates a sub value of the String from the beginning index
                                               till the last index and returns it as a NEW String value
         */
        String Str = "Cybertek School";
        //index:      0123456789
        Str = Str.substring(9); //School
        System.out.println(Str);

        String Address = "McLean VA 22000";
        //                0123456789...
        String zipcode = Address.substring(10);
        System.out.println(zipcode);

        /*
            String.substring(beginning index, ending index): creates the sub value of the String from the
                                                             beginning index till the ending index
                                                             (ending index will be excluded) then returns
                                                             it as a new String
         */
        String name = "Hello Cybertek School";
        //             0123456789....
        name = name.substring(6,13 + 1); //Cybertek
        System.out.println(name);

        String fullName = "Cybertek School Batch12";
        String middleName = fullName.substring(9,16);
        System.out.println(middleName);

    }

}
