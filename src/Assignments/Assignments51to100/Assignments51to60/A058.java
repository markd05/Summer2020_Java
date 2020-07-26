package Assignments.Assignments51to100.Assignments51to60;
import java.util.Scanner;
public class A058 {
    /*
    Automated tests are the future.

in the given program you have a quiz question and a scanner to catch user input which will be stored on string a.

after the user inputs an answer (a, b or c) we need to check if its the correct, wrong, valid answer.

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
a
a is wrong

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
b
b is correct

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
c
c is wrong

what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune
z
z is not a valid answer
===================================================
import java.util.*;
public class Main {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

	System.out.println("what is the farthest planet in the solar system:" );
	System.out.println("a)venus" );
	System.out.println("b)pluto" );
	System.out.println("c)neptune" );

	String answer = s.nextLine();

	//WRITE YOUR CODE HERE:

  }
}
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");

        String answer = s.nextLine();

        //WRITE YOUR CODE HERE:

        while (true) {
            if (!(answer.equals("a") || answer.equals("b") || answer.equals("c"))) {
                System.out.println(answer + " is not a valid answer");
                System.out.println("what is the farthest planet in the solar system:");
                System.out.println("a)venus");
                System.out.println("b)pluto");
                System.out.println("c)neptune");
                answer = s.nextLine();
            } else if (answer.equals("a") || answer.equals("c")) {
                System.out.println(answer + " is wrong");
                break;
            } else {
                System.out.println(answer + " is correct");
                break;
            }
        }
    }
}
