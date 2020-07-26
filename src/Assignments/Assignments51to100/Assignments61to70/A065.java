package Assignments.Assignments51to100.Assignments61to70;
import java.util.Scanner;
public class A065 {
    /*
    Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:

Example:
Input:
Split:Yes
Number of people:4
Check amount:476.0
Service Quality:Excellent

Output:

Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75

======================================================
import java.util.*;

public class Main {
  public static void main(String[] args) {
   //WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Split or no split");
        String split = scan.nextLine();

        System.out.println("Number of people");
        double people = scan.nextInt();

        System.out.println("Check amount");
        double check = scan.nextDouble();

        System.out.println("Service Quality");
        System.out.println("Poor\nFair\nGood\nGreat\nExcellent");
        scan.nextLine();
        String service = scan.nextLine();

        String People = "";
        double tip = 0;

        for (int i = 1; i <= people; i++) {
            People += "&";
        }

        if (service.equalsIgnoreCase("poor")) {
            tip = check*.05;
        } else if (service.equalsIgnoreCase("fair")) {
            tip = check*.1;
        } else if (service.equalsIgnoreCase("good")) {
            tip = check*.15;
        } else if (service.equalsIgnoreCase("great")) {
            tip = check*.2;
        } else if (service.equalsIgnoreCase("excellent")) {
            tip = check+.25;
        }

        double total = check + tip, perPerson = total/people, tipPerPerson = tip/people;

        if (split.equalsIgnoreCase("Split")) {
            System.out.println("Number of people entered: " + People);
            System.out.println("Total is: " + total);
            System.out.println("Total tip: " + tip);
            System.out.println("Total per person: " + perPerson);
            System.out.println("Tip per person: " + tipPerPerson);
        } else if (split.substring(0, 2).equalsIgnoreCase("no")) {
            System.out.println("Number of people entered: " + People);
            System.out.println("Total is: " + total);
            System.out.println("Total tip: " + tip);
        }
    }
}
