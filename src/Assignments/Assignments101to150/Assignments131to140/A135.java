package Assignments.Assignments101to150.Assignments131to140;

import java.util.Scanner;

public class A135 {
    /*
    Binary number is a number expressed in the base-2 numeral system or binary numeral system,
    which uses only two symbols: typically 0 (zero) and 1 (one). Each digit is referred to as a bit.



Given an array binary with 8 integers (0s or 1s),
write java program to calculate decimal value and print out to console.
Feel free to use additional arrays or formulas.

Example:
binary -> [0, 0, 0, 0, 0, 0, 1, 1]
print 3

binary -> [0, 0, 1, 0, 0, 0, 1, 1]
print 35

binary -> [1, 1, 1, 1, 1, 1, 1, 1]
print 255

class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int[] binary = new int[8];
	for(int i =0; i < binary.length; i++) {
  	binary[i] = input.nextInt();
	}
	//TODO: Write your code below.

  }
}
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        for(int i =0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }
        //TODO: Write your code below.
        int count = 0;

        if (binary[0] == 1) {
            count += 128;
        }
        if (binary[1] == 1) {
            count += 64;
        }
        if (binary[2] == 1) {
            count += 32;
        }
        if (binary[3] == 1) {
            count += 16;
        }
        if (binary[4] == 1) {
            count += 8;
        }
        if (binary[5] == 1) {
            count += 4;
        }
        if (binary[6] == 1) {
            count += 2;
        }
        if (binary[7] == 1) {
            count += 1;
        }
        System.out.println(count);

    }
}
