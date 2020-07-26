package Days1to10.Day05_Recap;

public class Quizzes {

    public static void main(String[] args) {
        //main method is the entry point of java application
        /*
        multiple ways to declare main method
            1.public static void main(String[] args){}
            2.static public void main(String[] args){}
                //public and static can be switched and nothing will happen
            3.public static void main(String... args){}
         */
        //int 7num = 10; cannot start with digits

        //Range: double > float > long > int > short > byte
        double num = 10L;
        //long value can be assigned to double and float

        double b = 5.5F; //double > float

        float num2 = 10; //if float value is a whole number, no f needed at the end
        float num3 = 5.5f; //if float value is a decimal, f is needed at the end of the value

        double num5 = 10L;
        System.out.println(num5); // float and double were designed fro decimals

        int _variableName = 10;
        int $variableName2 = 20;
        //int %variableName3 = 40; % not accepted in a variable name

        int accountNum = 1_000_000_000; //prints out 1000000000
        // "_" makes numbers easier to read while not being printed out
        System.out.println(accountNum);

        int iNum =10;
        long LNum =iNum;
        System.out.println(LNum);

        int myNum = '9';
        System.out.println(myNum); //will print out a number that corresponds to the ASCII Table

        //int myNum2 = 'AWS'; char values can only be a single character

        //boolean result = 'C'; boolean can only take True or False boolean expression

        int i = 100;
        double d = 300L;
        float f = 200f;

        //i = f; does not compile because int is smaller than float in terms of memory
        f = i;
        d = f;
        //f = d; does not compile because float is smaller than double
        d = i;
        //i = d; does not compile because int is smaller than int

        double nums1 = 10F;

        //int int = 100; doesn't work because variable name "int" is reserved by Java

        int a = 10;
        //double a = 20; compile error because variable a is used twice

        /*
            \n: new line
            \t: horizontal tab
            \\: prints a single slash
            \': prints a single quote
            \": prints a double quote
         */

        System.out.println("Today is a great Day\nFriday");
        System.out.println("\tTomorrow is Saturday, it's a day off");
        System.out.println("\\");
        System.out.println("\'Game of Thrones\'");
        System.out.println("I like to read \"Books\"");

    }

}
