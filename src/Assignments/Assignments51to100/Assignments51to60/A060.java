package Assignments.Assignments51to100.Assignments51to60;
import java.util.Scanner;
public class A060 {
    /*
    Let's say I've got a 100$ gift card and you want to buy something in your online store .
    Write a program that will help me to buy something and display leftover balance after purchase.
    If item is not in the list, display message: "Invalid item!".
    If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
Hint
Use if/ else if / else

CODE EXAMPLE:

Example #1
input: Hat
output: Thank you for your purchase!
output: Your current balance is: 75$
Example #2
input: Pants
output: Thank you for your purchase!
output: Your current balance is: 50$
Example #3
input: Laptop
output: Sorry, not enough funds on your gift card!
Example #4
input: Cupcake
output: Invalid item!
List of items

import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String item = scan.nextLine();
	int balance = 100;

	//WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        System.out.println("Enter the item you want to purchase");

        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        int balance = 100;

        //WRITE YOUR CODE HERE

        if (item.equalsIgnoreCase("Laptop") || item.equalsIgnoreCase("Smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equalsIgnoreCase("Charger")) {
            balance -= 15;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equalsIgnoreCase("USB Cable")) {
            balance -= 10;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equalsIgnoreCase("Headphones")) {
            balance -= 30;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equalsIgnoreCase("Pants")) {
            balance -= 50;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equalsIgnoreCase("Hat")) {
            balance -= 25;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equalsIgnoreCase("Socks")) {
            balance -= 5;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equalsIgnoreCase("Blanket")) {
            balance -= 60;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equalsIgnoreCase("Pillow")) {
            balance -= 40;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else {
            System.out.println("Invalid item!");
        }
    }
}
