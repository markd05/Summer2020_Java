package Assignments.Assignments151to200.Assignments161to170;

import java.util.Arrays;

public class A168 {
    /*
    mergR merges two arrays into one.
it gets two int arrays and returns an int array

for example:
mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]
mergR([1,2],[6,8])
returns [1,2,6,8]

hint:
create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).

loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).

Do the same for the second array.

import java.util.Arrays;
class Main {
  public static int[] mergR(int[] a,int[] b) {
	//Write code here
  }//end mergR
  public static void main(String[] args) {
  	//Test code
  }
}
     */
    public static int[] mergR(int[] a,int[] b) {
        //Write code here
        int length = a.length + b.length;
        int[] ret = new int[length];
        for (int i = 0; i < a.length; i++) {
            ret[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            ret[i+a.length] = b[i];
        }
        return ret;
    }//end mergR
    public static void main(String[] args) {
        //Test code
        int[] a = {1,2,3};
        int[] b = {4,5,6};
        int[] ret = mergR(a, b);
        System.out.println(Arrays.toString(ret));
    }
}
