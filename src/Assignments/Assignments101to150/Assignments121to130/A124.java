package Assignments.Assignments101to150.Assignments121to130;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A124 {
    /*
    Given an array nums with 7 integers every element is repeated twice - except one.
    Find that element and print it to console.

Example:
nums -> [1, 1, 2, 3, 4, 3, 4]
     	2

class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	//TODO: write your code below

  }
}
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        //TODO: write your code below

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] == nums[j]) {
                        nums[i] = 0;
                        nums[j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
                result += nums[i];
        }
        System.out.println(result);

    }
}
