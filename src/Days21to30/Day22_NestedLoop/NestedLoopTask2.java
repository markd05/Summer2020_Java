package Days21to30.Day22_NestedLoop;
import java.util.Scanner;
public class NestedLoopTask2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("What math do you want to do");
            String str = scan.next();

            if (str.toLowerCase().equals("multiplication")) {

                while (true) {

                    System.out.println("Enter two numbers");
                    int a = scan.nextInt();
                    int b = scan.nextInt();
                    System.out.println("Multiplication is " + (a * b));
                    System.out.println("Do you want to continue");
                    scan.nextLine();
                    String answer = scan.nextLine().toLowerCase();
                    while (!(answer.equals("yes") || answer.equals("no"))) {
                        System.out.println("Please make up your mind");
                        System.out.println("Do you want to continue");
                        answer = scan.nextLine().toLowerCase();
                    }

                    if (answer.equals("no")) {
                        break;
                    }

                }
            } else if (str.toLowerCase().equals("addition")) {

                while (true) {

                    System.out.println("Enter two numbers");
                    int a = scan.nextInt();
                    int b = scan.nextInt();
                    System.out.println("Addition is " + (a + b));
                    System.out.println("Do you want to continue");
                    scan.nextLine();
                    String answer = scan.nextLine().toLowerCase();
                    while (!(answer.equals("yes") || answer.equals("no"))) {
                        System.out.println("Please make up your mind");
                        System.out.println("Do you want to continue");
                        answer = scan.nextLine().toLowerCase();
                    }

                    if (answer.equals("no")) {
                        break;
                    }
                }
            } else if (str.toLowerCase().equals("subtraction")) {

                while (true) {

                    System.out.println("Enter two numbers");
                    int a = scan.nextInt();
                    int b = scan.nextInt();
                    System.out.println("Subtraction is " + (a - b));
                    System.out.println("Do you want to continue");
                    scan.nextLine();
                    String answer = scan.nextLine().toLowerCase();
                    while (!(answer.equals("yes") || answer.equals("no"))) {
                        System.out.println("Please make up your mind");
                        System.out.println("Do you want to continue");
                        answer = scan.nextLine().toLowerCase();
                    }

                    if (answer.equals("no")) {
                        break;
                    }
                }
            } else if (str.toLowerCase().equals("division")) {

                while (true) {

                    System.out.println("Enter two numbers");
                    double a = scan.nextDouble();
                    double b = scan.nextDouble();
                    System.out.println("Division is " + (a / b));
                    System.out.println("Do you want to continue");
                    scan.nextLine();
                    String answer = scan.nextLine().toLowerCase();
                    while (!(answer.equals("yes") || answer.equals("no"))) {
                        System.out.println("Please make up your mind");
                        System.out.println("Do you want to continue");
                        answer = scan.nextLine().toLowerCase();
                    }

                    if (answer.equals("no")) {
                        break;
                    }
                }
            } else if (str.equals("remainder")) {

                while (true) {

                    System.out.println("Enter two numbers");
                    int a = scan.nextInt();
                    int b = scan.nextInt();
                    System.out.println("Remainder is " + (a % b));
                    System.out.println("Do you want to continue");
                    scan.nextLine();
                    String answer = scan.nextLine().toLowerCase();
                    while (!(answer.equals("yes") || answer.equals("no"))) {
                        System.out.println("Please make up your mind");
                        System.out.println("Do you want to continue");
                        answer = scan.nextLine().toLowerCase();
                    }

                    if (answer.equals("no")) {
                        break;
                    }
                }
            }

    }
}
