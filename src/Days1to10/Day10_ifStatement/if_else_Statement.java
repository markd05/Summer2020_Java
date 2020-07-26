package Days1to10.Day10_ifStatement;

public class if_else_Statement {
    /*
        if & else statement:
            if (condition){
                //A
            }
            else {
                //B
            }
            if condition is true -> A
            if condition is false -> B
     */
    public static void main(String[] args) {

        if (9 >= 8) {
            System.out.println("9 is greater or equal to 8");
        }
        else {
            System.out.println("9 is less than 8");
        }

        if (false == !false){
            System.out.println("if block");
        }
        else {
            System.out.println("else block");
        }

        /*
            Task 01:
            if score < 60 => failed
            if score >= 60 and score <= 90 => pass
            if score > 90 => pass with distinction
         */
        int score = 99;
        if (score >= 60){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }

        if (score >= 90){
            System.out.println("You have made A+, good job");
        }
        else {
            System.out.println("You couldn't make A+");
        }
        /*
            1. Triangle has 3 angles and sum of angles MUST equal 180
                1. declare 3 variables angle1, angle2, angle3
                2. write a program to check if triangle is valid or not
         */
        int angle1 = 20, angle2 = 50, angle3 = 75;
        if (angle1 + angle2 + angle3 == 180){
            System.out.println("This is a triangle");
        }
        else{
            System.out.println("This is not a triangle, do some math");
        }
    }
}
