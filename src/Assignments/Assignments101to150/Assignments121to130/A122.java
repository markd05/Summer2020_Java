package Assignments.Assignments101to150.Assignments121to130;

import java.util.Scanner;

public class A122 {
    /*
    Given an array nums, calculate count of even numbers in nums and print out to console.

nums → [2, 1, 2, 3, 4]) → 3
nums → [2, 2, 0, 3, 5]) → 3
nums → [1, 3, 5, 7, 9]) → 0

class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	//TODO: Write your code below

  }
}
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        //TODO: Write your code below
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
