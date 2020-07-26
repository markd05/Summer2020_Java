package Days1to10.Day05_Recap;

public class Primitives_Review {
    /*
        Primitives:
            byte: only takes whole numbers
            short: only takes whole numbers
            int: only takes whole numbers
            long: only takes whole numbers

            float: can take decimals (MUST have F or f at the end)
            double: can take decimals

            boolean: true or false boolean expressions
            char: character within single quote ' ' also takes numbers

            Range: double > float > long > int > short > byte
     */
    public static void main(String[] args) {
        //System.out.println(bNum); unable to print because variable bNum has not been defined yet
        //java applications are executed from top to bottom
        byte bNum = 127;
        //byte range: -128 to 127
        //byte bNum2 = 126.5; byte only takes whole numbers

        //short sNum = 126.5; short only takes whole numbers
        short sNum2 = 1000;

        //bNum = sNum2; short is greater than byte

        sNum2 = bNum; //sNum2 = 127
        System.out.println(sNum2);

        short sNum3 = 127;
        //byte bNum5 = sNum3; short > byte

        int intNum = 100;
        //int intNum2 = 100.5; int only take whole numbers
        System.out.println(intNum);

        //byte ByteNum = intNum; int > byte
        //short ShortNum = intNum; int > short
        short ShortNum2 = 105;
        intNum = ShortNum2;
        System.out.println(intNum); // 105

        long longNum = 100l;
        long longNum2 = 100L;

        //byte ByteNum3 = LongNum; long > byte
        short shortNum3 = 100;
        //int IntNum3 = 100L; long > int;

        byte a = 10;
        int b = 30;
        short c = 40;
        long LongNumber = a;
        long LongNumber2 = b;
        long LongNumber3 = c;

        float floatNumber =10.5f;
        float floatNumber2 = 20.3F;

        short a1 = 10;  byte b1 = 20;    long c1 = 30;  int d1 = 40;

        float Floats = a1;
        float Floats2 = b1;
        float Floats3 = c1;

        System.out.println(Floats); //10.0

        //double takes all the whole and decimal numbers

        double DoubleNum1 = 10L;
        double DoubleNum2 = 10.5F;

        boolean result = true;
        boolean result2 = false;

        boolean result3 = 9 > 10;

        //char: takes characters, char values must be declared within single quotes
        char character1 = 'A';
        System.out.println(character1);

        //char character2 = A; A needs to be in single quotes
        //char character3 = 'AA'; multiple characters

        //all characters have representative numbers

        char charValue = 98; //b
        System.out.println(charValue);

        int num3 = 'B';
        System.out.println(num3); //66

        float fnum = 'B';
        System.out.println(fnum); //66.0

        byte bValue = 'B';
        System.out.println(bValue); //66

        float fnum2 = 5.5F;
        float fnum3 = 5;

        char specialCharacter = 55000;
        System.out.println(specialCharacter);

    }

}
