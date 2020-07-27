package Assignments.Assignments151to200.Assignments151to160;

import java.util.ArrayList;
import java.util.Scanner;

public class A159 {
    /*
    Write a void method printUniqueNumbers that will print unique numbers from an array of ints.
Example:
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output:
2
9
34

import java.util.*;

public class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int size = scan.nextInt();
	int[] nums = new int[size];
	for(int i=0; i < size; i++){
  	nums[i] = scan.nextInt();
	}
	printUniqueNumbers(nums);
  }

  public static void printUniqueNumbers(int[] nums){
	//WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE
        for (int i = 0; i < nums.length; i++) {
            int dupe = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] == nums[j]) {
                        dupe = 1;
                    }
                }
            }
            if (dupe == 0) {
                System.out.println(nums[i]);
            }
        }
    }
}
