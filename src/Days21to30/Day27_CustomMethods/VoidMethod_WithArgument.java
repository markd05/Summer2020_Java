package Days21to30.Day27_CustomMethods;

public class VoidMethod_WithArgument {
    /*
        method with argument
            access-modifier     specifier   return-type     name(parameter) {

            }
            parameters: any data-type
     */
    public static void main(String[] args) {
        //oddOrEven();
            //methods was designed to take an argument
            // needs the argument in order to perform the its task
        oddOrEven(50);

        int z = 100; //local variables MUST be initialized before we use it

        oddOrEven(z); //variable z's value will be assigned to parameter variable a

        //SumOfTwoNums(); // not enough information for the method to perform its task
        //SumOfTwoNums(10); //still not enough information
        SumOfTwoNums(10,20);
    }

    public static void SumOfTwoNums(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
    }

    public static void oddOrEven(int a) {
        if (a % 2 == 0) {
            System.out.println(a + " is Even number");
        } else {
            System.out.println(a + " is Odd number");
        }
    }
}
