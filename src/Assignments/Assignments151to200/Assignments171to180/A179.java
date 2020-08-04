package Assignments.Assignments151to200.Assignments171to180;

public class A179 {
    /*
    this is a sorted collection (in this case array):
7,8,9,10

this is an unsorted collection:
5,4,9,8,7,3

sorted in this case means smallest number to biggest.
isSort gets an array and returns true if its sorted.

for example:
isSort([2,3,5,4,9]);
returns: false
isSort([1,2,3]);
returns: true
isSort([7,8,9]);
returns: true.

import java.util.*;

class Main {
  public static boolean isSort(int[] nums)
  {
	//Write code here, remember to test
  }
}
     */
    public static boolean isSort(int[] nums) {
        //Write code here, remember to test
        boolean a = true;
        for (int i = 0; i < nums.length-1; i++) {
            if (!(nums[i + 1] > nums[i])) {
                a = false;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(isSort(arr));
    }
}
