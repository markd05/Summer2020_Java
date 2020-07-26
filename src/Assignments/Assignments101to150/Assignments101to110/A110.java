package Assignments.Assignments101to150.Assignments101to110;

import java.util.ArrayList;
import java.util.Scanner;

public class A110 {
    /*
    In this assignment, you will write a program that will generate a shopping list.
    It's more advanced version of assignment #22 (Shopping list I).
Your program should ask use to enter items followed by its price.
After adding item,  ask user if he wants to add one more item.
If so, repeat previous steps again. If no, print shopping list report and total price as show in examples.
Your program should accept up to 10 items.
Hint: use do while loop.

Example:

output: Enter Item1 and its price:
input: Tomatoes
input: 5.5
output: Add one more item?
input: yes
output: Enter Item2 and its price:
input: Cheese
input: 3.5
output: Add one more item?
input: yes
output: Enter Item3 and its price:
input: Apples
input: 6.3
output: Add one more item?
input: no
output: Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
output: Total price: 15.3

Example:

output: Enter Item1 and its price:
input: Lemons
input: 2.3
output: Add one more item?
input: yes
output: Enter Item2 and its price:
input: Oranges
input: 6
output: Add one more item?
input: no
output: Item1: Lemons Price: 2.3, Item2: Oranges Price: 6.0
output: Total price: 8.3

public class Main {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String out = "";
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Double> price = new ArrayList<>();
        double total = 0;
        int i = 1;
        do {
            System.out.println("Enter Item" + i + " and its price:");
            list.add(scan.nextLine());
            price.add(scan.nextDouble());
            total += price.get(i-1);
            System.out.println("Add one more item?");
            scan.nextLine();
            String answer = scan.nextLine();
            out += "Item" + i + ": " + list.get(i-1) + " Price: " + price.get(i-1) + ", ";
            i++;
            if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid!");
                System.out.println("Add one more item?");
                answer = scan.nextLine();
            }
            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        } while (true);
        System.out.println(out.substring(0,out.length()-2));
        System.out.println("Total price: " + total);
    }
}