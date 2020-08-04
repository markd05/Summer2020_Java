package Assignments.Assignments151to200.Assignments191to200;

import java.util.ArrayList;
import java.util.Arrays;

public class A195 {
    /*
    In this assignment you will swap a position in an array list with another.
swap gets 3 arguments, an arraylist, a position, and another position to swap with.

for example:
swap(["one","two","three"],0,2)
returns:["three","two","one"]
swap(["a","c","b","d","e"],0,3)
returns:["d","c","b","a","e"]

import java.util.*;
class Main {
  public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2)
  {
	//Write code here, remember to test
  }

  public static void main(String[] args)
  {

  }//end main
}
     */
    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2)
    {
        //Write code here, remember to test
        String n = list.get(pos1);
        list.set(pos1, list.get(pos2));
        list.set(pos2, n);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one","two","three"));
        System.out.println(swap(list, 0, 2));
    }
    {

    }//end main
}
