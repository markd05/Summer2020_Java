package Assignments.Assignments51to100.Assignments51to60;
import java.util.Scanner;
public class A051 {
    /*
    n this assignment you will write a program to create a shopping list, count and prices.
Please read carefully! If you do not fully understand the requirement ask your classmates in Slack or ask your instructor!
You will use Scanner object and ask user to enter 3 items followed by its count, price and you will calculate total price and show as a report.
-Declare 4 String variables item1, item2, item3, report.
-Declare double variables price1, price2, price3, totalPrice
-Declare int variables count1, count2, count3
-Create a Scanner object named scan.
Execution flow using with example:
Use scanner to read all 3 values.
-Display prompt "Enter Item1, count and its price:"
Tomatoes
2
5.4
Explanation: (Item1 is "Tomatoes", count is 2, price is 5.4)
-Display prompt "Enter Item2, count and its price:"
Cheese
0
3.5
Explanation: (Item2 is "Cheese", count is 0, price is 3.5)
-Display prompt "Enter Item3, count and its price:"
Apples
5
6.3
Explanation: (Item3 is "Apples", count is 5, price is 6.3)
-calculate totalPrice for all items only if the item's count is more than 0!
-build the report variable by concatenating Strings and double price values:
-do not include items that have count 0, use if statement !
-Calculate total price for the item and concatenate like below
"Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
Explanation: (Item2 "Cheese" is not included since its count is 0)
- Print the value of report variable
- Print total Price:
"Total price: 42.3"

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	//WRITE YOUR CODE HERE:

  }
}
     */
    public static void main(String[] args) {
        String item1, item2, item3, report;
        int count1, count2, count3;
        double price1, price2, price3, totalPrice;
        double total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1, how many and individual price");
        item1 = scan.next();
        count1 = scan.nextInt();
        price1 = scan.nextByte();
        System.out.println("Enter Item2, how many and individual price");
        item2 = scan.next();
        count2 = scan.nextInt();
        price2 = scan.nextByte();
        System.out.println("Enter Item2, how many and individual price");
        item3 = scan.next();
        count3 = scan.nextInt();
        price3 = scan.nextByte();
        if (count1 != 0) {
            System.out.print("Item 1: " + item1 + " Price: " + price1*count1 + " ");
            total += price1*count1;
        }
        if (count2 != 0) {
            System.out.print("Item 2: " + item2 + " Price: " + price2*count2 + " ");
            total += price2*count2;
        }
        if (count3 != 0) {
            System.out.println("Item 3: " + item3 + " Price: " + price3*count3);
            total += price3*count3;
        }
        System.out.println("Total is: " + total);

    }
}
