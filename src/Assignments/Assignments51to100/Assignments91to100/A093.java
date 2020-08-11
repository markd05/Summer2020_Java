package Assignments.Assignments51to100.Assignments91to100;

public class A093 {
    /*
    Write a program that will print out even numbers from 2 to 100 through the comma.

public class Main {
  public static void main(String[] args) {
	//WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE

        String even = "";
        for (int i = 2; i <= 100; i+=2) {

                even += i + ", ";

        }
        System.out.println(even.substring(0,even.length()-2));
    }
}
