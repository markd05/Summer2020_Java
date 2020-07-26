package Days1to10.Day05_Recap;

public class Concatenation {
    /*
     String: represents the sequence of characters, used for storing text
             String values are surrounded by a double quote

     Concatenation: combining, linking things together => creates a String value
                    achieved by using + operator
                    we can concat any value to String
     */
    public static void main(String[] args) {

        String str = "any text goes here";
        System.out.println(str);

        String str2 = "1";
        System.out.println(str2);

        System.out.println("Hello World");

        String Hello = "Hello World";
        System.out.println(Hello);

        String myName = "Cybertek" + " School";
        System.out.println(myName);

        String Year = "This is " + 2019;

        String name = "Mark";
        System.out.println("My name is " + name);

        /*
            cucumber is 3 $
            Tomato is 5 $
         */
        int cucumber = 3; int tomato = 5;
        System.out.println("cucumber is " + cucumber + "$");
        System.out.println("Tomato is " + tomato + "$");

        String newStr = "100" + 10;
        System.out.println(newStr); //10010

        System.out.println(1 + 2 + 3); //6
        System.out.println("1" + 2 + 3); //123
        //System.out.println("1" + 1 - 3); "11" -3 not possible

        System.out.println("Batch 12" + 1 + 2); // "Batch 121" + 2 => "Batch 1212"

        System.out.println(2 - 1 + 1 + "4"); //24

        System.out.println("Batch 12" + (1+2)); //"Batch 12" + 3 => "Batch 123"

        System.out.println(1 + "123" + 4 + 5); // "1123" + 4 + 5 => 112345

        System.out.println('3' + 3); // 51 + 3 => 54

        System.out.println("3" + 3); // 33

        System.out.println("3" + '3'); // if we concat char to string, char is concated as the character
                            // "3" + 3

        System.out.println(12 + '3'); // 12 + 51 => 63

    }

}
