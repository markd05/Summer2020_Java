package Days1to10.Day10_ifStatement;

public class Nested_if {
    /*
        Nested if:
            if (condition1){
                //A
                if (condition2){
                    //B
                }
            }
            A: as long as condition 1 is true
            B: as long as condition 2 is true
     */
    public static void main(String[] args) {

        if (true){
            System.out.println("Hello Cybertek");

            if (false) {
                System.out.println("Hello World");
            }
        }

        if (true) {
            System.out.println("Hello batch 12"); //printed

            if (false) {
                System.out.println("Hello programmers");
            }
            else {
                System.out.println("Hello Team SDET"); //printed
            }
        }

        int grade = 70;

        if (grade >= 60) {
            System.out.println("you passed");

            if (grade >= 90 && grade <= 100) {
                System.out.println("with an A");
            }
            else if (grade >= 80 && grade < 90) {
                System.out.println("with a B");
            }
            else if (grade >= 70 && grade < 80) {
                System.out.println("with a C");
            } else if (grade >= 60 && grade < 70) {
                System.out.println("with a D");
            }
        }
        else {
            if (grade < 60){
                System.out.println("You failed with a grade of F");
            }
            else { //grade is greater than 100
                System.out.println("Invalid score, error 401");
            }
        }

    }
}
