package Days11to20.Day15_Scanner_StringClass;

import java.util.Scanner;

public class ScannerClass {
    /*
        package name: java.util
        class name: Scanner

     */

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        System.out.println("Enter byte value");
        byte num = input.nextByte(); //returns the user input as a byte

        System.out.println("Enter short value");
        short num2 = input.nextShort(); //returns the user input as a short

        System.out.println("Enter int value");
        int num3 = input.nextInt(); //returns the user input as an int

        System.out.println("Enter long value");
        long num4 = input.nextLong(); //returns user input as a long

        System.out.println("Enter boolean value");
        boolean result = input.nextBoolean(); //returns the user value as a boolean

        System.out.println("Enter float value");
        float num5 = input.nextFloat(); //returns the user input as a float

        System.out.println("Enter double value");
        double num6 = input.nextDouble(); //returns the user input as a double

        System.out.println("Enter your first name");
        String str = input.nextLine(); //returns the user input as a string

    }

}
