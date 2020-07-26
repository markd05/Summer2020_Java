package Days11to20.Day14_Scanner;

import java.util.Scanner;
//everything in scanner class is imported

//import java.util.*;
//imports all classes inside the java.util package

public class ScannerClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a byte value");
        byte byteNum = input.nextByte();
        System.out.println("You have entered: " + byteNum);

        System.out.println("Enter another Byte value");
        byte byteNum2 = input.nextByte();
        System.out.println("You have entered: " + byteNum2);
        System.out.println("Addition is: " + (byteNum + byteNum2));

    }

}
