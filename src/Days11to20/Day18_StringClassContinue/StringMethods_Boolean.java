package Days11to20.Day18_StringClassContinue;

public class StringMethods_Boolean {

    public static void main(String[] args) {

        /*
            isEmpty(): checks if the String is empty, returns a boolean expression
         */
        String str = "cybertek";
        boolean R1 = str.isEmpty();
        System.out.println(R1);

        String str2 = "";
        if (str2.isEmpty()) {
            System.out.println("It's an empty String");
        } else {
            System.out.println("It's not empty");
        }

        /*
            equals(str): checks if the two Strings' face values are equal or not
            equal ==> true
            !equal ==> false
         */
        String A1 = "Cybertek";
        String A2 = new String("Cybertek");
        System.out.println(A1 == A2); //false
        System.out.println(A1.equals(A2)); //true

        System.out.println("Java".equals("java")); //false, because case sensitivity

        /*
            equalsIgnoreCase(str): checks if the two Strings' visible text are equal or not, then returns
                                   boolean expression
                                   Case sensitivity does not matter
         */
        String s1 = "Java";
        String s2 = new String("java");
        System.out.println(s1 == s2); //false, different location
        System.out.println(s1.equals(s2)); //false, case sensitivity
        System.out.println(s1.equalsIgnoreCase(s2)); //true

        /*
            contains(str): checks if the str is contained in the String or not,
                           then returns a boolean expression
            contained ==> true
            !contained ==> false
         */
        String name = "Muhtar";
        boolean Result = name.contains("ABC"); //false
        System.out.println(Result);

        String name2 = "Mark";
        System.out.println(name2.contains("m")); //false, case sensitivity
        System.out.println(name2.contains("M")); //true

        /*
            startsWith(str): checks if the String starts with the str or not, then returns boolean expression

            start with ==> true
            !start with ==> false
         */
        String Today = "Java";
        boolean Result2 = Today.startsWith("J"); //true
        System.out.println(Result2);

        String names = "Cybertek School is a great place to learn java";
        System.out.println(names.startsWith("Cybertek School")); //true

        /*
            endsWith(str): checks if the String ends with the given str or not,
            then returns boolean expression

            endsWith ==> true
            !endsWith ==> false
         */
        String B1 = "Muhtar";
        System.out.println(B1.endsWith("R")); //false, case sensitivity
        System.out.println(B1.endsWith("r")); //true
    }
}
