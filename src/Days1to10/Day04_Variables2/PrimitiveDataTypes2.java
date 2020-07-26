package Days1to10.Day04_Variables2;

public class PrimitiveDataTypes2 {
    /*
    Primitives: byte, short, int, long, float, double, boolean, char

        boolean: takes either True or False boolean expressions
        char: declared within the single quote ''; single characters only
                '' is a MUST when you give character as a value

     */
    public static void main(String[] args) {

        //boolean result = Earth is Flat;
        //boolean num1 = 100; boolean only takes true or false results

        boolean result = true; //true
        boolean result2 = false; //false
        boolean result3 = 9 > 3; //true


        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);


        //char:

        char char1 = 'a';
        System.out.println(char1);
        char char2 = '9';
        char char3 = '#';
        System.out.println("\n\n");

        //char with numbers
        char char4 = 67; //only time we use '' for char is when we are declaring a single character
            //prints the character that's corresponding to 67 from ASCII Table
        System.out.println(char4); //char4 is 67, 67 on ASCII Table is "C", so C is printed

        char char5 = 'C';
        System.out.println(char5);

        char char6 = '{';
        System.out.println(char6);
        char char7 = 123;
        System.out.println(char7); //prints the character that corresponds to 127 on ASCII Table

        //initializing char to other primitives: byte, short, int, long, float, double
        char MyChar1 = 'b';

        int MyInt = 'b'; //the number that represents b is initialized to the int, 98
        System.out.println(MyInt); //98

        //byte MyByte = MyChar1; char is greater than byte so it doesn't work, char = 2 bytes, byte = 1 byte
        byte MyByte2 = 'b';
        System.out.println(MyByte2);

        //short MyShort = MyChar1; although both short and char are 2 bytes, char is a litte bigger because it goes up to 65535 while short goes up to 32767
        short shortNum2 = 'b';
        System.out.println(shortNum2);

        long longNum = MyChar1; //long's memory is 8 bytes
        long longNum2 = 'b'; //98
        System.out.println(longNum);

        float floatNum = MyChar1;
        float floatNum2 = 'b';
        System.out.println(floatNum2); //98.0

        double doubleNum = MyChar1;
        double doubleNum2 = 'b';
        System.out.println(doubleNum2); //98.0

        //Java is case sensitive A is not equal to a

        char myCharValue = 2222;
        System.out.println(myCharValue);

    }

}
