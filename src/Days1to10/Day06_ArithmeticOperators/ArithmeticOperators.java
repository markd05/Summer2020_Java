package Days1to10.Day06_ArithmeticOperators;

public class ArithmeticOperators {
    /*
        +, addition: adds two numbers together
        -, subtraction: subtracts a number from another number
        *, multiplication: multiplies two numbers
        /, division: divides two numbers
        %, remainder: returns the remainder from the division
     */
    public static void main(String[] args) {

        int a = 100;
        int b = a - 400; // -300
        System.out.println(b);

        int c = a + b; // 100 + -300 = -200
        System.out.println(c);

        int x = 3, y = 5, z = x * y;
        System.out.println(z);

        int length = 100, width = 10, Area = length*width;
        System.out.println(Area);

        System.out.println(3 + 5 + 4 - 2);

        //double resultNum = 9/0; cannot divide by zero
        //System.out.println(resultNum);

        short Number1 = 10/3;
        System.out.println(Number1); //cuts off all decimals

        double Number2 = 10.0/3;
        System.out.println(Number2);

        double Number3 = 10/3;

        int output = 12 + 6 / 3;
        System.out.println(output); // 12 + 2 = 14

        System.out.println(5 + 2 * 4); // 13
        System.out.println(5 + 4 * 2); // 13

        //%:
        /*
            10/3 => 3 with a remainder of 1
            12/5 => 2 with a remainder of 2
            20/3 => 6 with a remainder of 2
         */

        int result1 = 10%3; //1
        System.out.println(result1);
        System.out.println(12%5); //2

        /*
            even: can be divided by 2 without  a remainder
            odd: when divided by 2, will have a remainder
         */

        int Number20 = 20 % 2; //even
        int Number45 = 45 % 2; //odd
        System.out.println(Number20);
        System.out.println(Number45);

        System.out.println(4 + 17 % 2 - 1); // 4 + 1 - 1
    }

}
