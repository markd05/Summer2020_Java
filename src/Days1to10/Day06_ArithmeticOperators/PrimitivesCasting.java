package Days1to10.Day06_ArithmeticOperators;

public class PrimitivesCasting {
    /*
        casting: converting larger primitive to smaller size
                datatype variablename = (datatype) value

                castings: explicit or Implicit

        primitives: byte, short, int, long, float, double
     */
    public static void main(String[] args) {
        //Explicit casting
        int a = 128;
        byte b = (byte) a; //Explicit casting
        System.out.println(b);

        double DecimalNumber = 10.5;
        float FloatNumber = (int) DecimalNumber; // double > float
            //FloatNumber = 10;
        System.out.println(FloatNumber);

        long LongNum = 300L;
        int IntNum = (int) LongNum;
        System.out.println(IntNum);

        //Implicit Casting
        byte ByteNum = 100;
        int IntNum2 = ByteNum;
            //same as
        int IntNum3 = (int) ByteNum;

        short ShortNum = 100;
        long LongNum2 = ShortNum;
            //same as
        long LongNum3 = (long) ShortNum;

        //explicit casting practice
        double LargestNumber = 100.8765;
        byte ByteValue = (byte) LargestNumber; //100 numbers do not round when going from decimal to whole, it cuts off all decimals
        float FloatValue = (float) LargestNumber; //100.8765F
        float FloatValue2 = (int) LargestNumber; //100.0
        float FloatValue3 = (byte) LargestNumber; //100.0
        float FloatValue4 = (short) LargestNumber;
        float FloatValue5 = (long) LargestNumber;
        System.out.println(FloatValue);

        float FloatNumber2 = 500.67F;
        int myNumber = (short) FloatNumber2; //500
        System.out.println(myNumber);

        /*
        int Num1 = 100;
        int Num2 = 200;
        int Num3 = 300;
        */

        int Num1 = 100 , Num2 = 200 , Num3 = 300;
        System.out.println(Num1 + "\t" + Num2 + "\t" + Num3);

        char Character1 = 'A';
        System.out.println(Character1);

        boolean result1, result2, result3;

    }

}
