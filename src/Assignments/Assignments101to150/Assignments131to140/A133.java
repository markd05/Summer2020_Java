package Assignments.Assignments101to150.Assignments131to140;

import java.util.Scanner;

public class A133 {
    /*
    Clunker Motors Inc. is recalling all vehicles in its Extravagant line from model years 2010-2012
    as well all vehicles in its Guzzler line from model years 2015-2018.
    A boolean variable named recalled has been declared.
Given a variable year and a String model write a statement that prints true to recalled
if the values of year and model match the recall details and prints false otherwise.


public class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String model = scan.next();
	int year = scan.nextInt();
	//TODO: Write your code below

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.next();
        int year = scan.nextInt();
        //TODO: Write your code below
        if (model.equals("Extravagant")) {
            System.out.println(year >= 2010 && year <= 2012);
        } else if (model.equals("Guzzler")) {
            System.out.println(year >= 2015 && year <= 2018);
        } else {
            System.out.println(false);
        }

    }
}
