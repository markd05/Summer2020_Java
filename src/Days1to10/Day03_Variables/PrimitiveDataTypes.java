package Days1to10.Day03_Variables;

public class PrimitiveDataTypes {
    /*
     byte: Assign whole numbers, must be within -128 <= byte <= 127
     short: we can only assign whole numbers, must be within -32768 <= short 32767
     int: we can only assign whole numbers, must be within -2,147,483,648 <= int <= 2,147,483,647
     long: we can oly assign whole numbers, must be within -9,223,372,036,854,775,808 <= long <= -9,223,372,036,854,775,807
           (at the end of the value we can enter l or L)
           byte < short < int < long
        the variable dataType must be larger in order to contain another dataType

     float: we can assign decimals (decimal must end with f or F)
     double (used more often): we can assign decimals
        float < double
     */
    public static void main(String[] args) {
        byte length = 3;
        System.out.println(length);

        byte width = 4;
        System.out.println(width);
        // byte length = 6; variable name is not unique
        // byte public = 10; variable names cannot be java reserved words
        //byte myNum1 = -129; out of 'byte' range
        byte variableName = 127;

        short num2 = 100;
        // short num2 = &; we can only assign whole numbers
        //short num3 = 100000; out of range

        int num4 = -100000;
        // int num5 = 100,000,000; Contains special characters that is not _
        int num5 = 1_000_000_000; // easier to read ("_" acts like ",")
        System.out.println(num5);

        long longNumber = 10l;
        int intNumber = 10;

        byte byteNumber = 10;
        short shortNumber = byteNumber;

        short shortNumber2 = 18;
        // byte byteNumber2 = shortNumber2; short is greater than byte

        int intNumber2 = -19876;
        long logNumber2 = intNumber2; // long is greater than int
        //left side has to be equal or greater than the right side of =

        short shortNumber3 = -30000;
        short shortNumber4 = shortNumber3;
        System.out.println(shortNumber4);

        //float exampleNum1 = 10.5;
        float exampleNum2 = 10.5F;
        float exampleNum3 = 20.5f;

        double doubleNumber = 10.5;

        double doubleNumber2 = 30.5;
        //float floatNumber = doubleNumber; double is larger than float
        System.out.println("==============================");
        byte bNum = 10;
        short sNum = 20;
        int iNum = 30;
        long lNum = 40;

        System.out.println(bNum);
        System.out.println(sNum);
        System.out.println(iNum);
        System.out.println(lNum);

        System.out.println("==============================");

        float fNum = bNum;
        float fNum2 = sNum;
        float fNum3 = iNum;
        float fNum4 = lNum;

        System.out.println(fNum);
        System.out.println(fNum2);
        System.out.println(fNum3);
        System.out.println(fNum4);

        System.out.println("==============================");

        double dNum = bNum;
        double dNum2 = sNum;
        double dNum3 = iNum;
        double dNum4 = lNum;

        System.out.println(dNum);
        System.out.println(dNum2);
        System.out.println(dNum3);
        System.out.println(dNum4);
    }

}
