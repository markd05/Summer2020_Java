package Days11to20.Day13_Review;

public class Quiz_Review {

    public static void main(String[] args) {

        //Q1:
        int num = 9;

        if (num++ == 10) {
            System.out.println("Hello World " + num);
        }
        else {
            System.out.println("Hello Universe " + num);
        }

        //Q2:
        int score = 0;

        if (score == 0) {
            score += 50;
        }
        else if (score != 0) {
            score += 50;
        }
        System.out.println(score);

        //Q3:
        char grade = 'A';
        boolean Passed = grade == 'A' || grade == 'B';
        boolean Passed2 = grade == 'C' || grade == 'D';

        if (Passed || Passed2) {
            System.out.println("You passed the exam");
        }
        else {
            System.out.println("You Failed");
        }

        //Q4:
        boolean A = true, B = !false;

        if (B) {
            System.out.println("B");
        } else if (A) {
            System.out.println("A");
        }
        else {
            System.out.println("C");
        }

        //Q5:
        boolean result = true;

        if (result) {
            System.out.println("it's true");
        }
        else {
            System.out.println("it's false");
        }
        /*else if (result) { // else if has to be in between an in anf else statement
            System.out.println("None of the above");
        }
         */

        //Q8:
        boolean A1 = true, B1 = !A;

        if (A1) {
            if (B1) {
                System.out.println("Monday");
            }
            else {
                System.out.println("Tuesday");
            }
        }
        else {
            if (A1) {
                System.out.println("Thursday");
            }
            else {
                System.out.println("Friday");
            }
        }

        //Q9:
        int number = 10;

        if (--number > 10) {
            System.out.println("Hello Cybertek " + number);
        } else if (number == 9) {
            System.out.println("Hello World " + number);
        }

        //Q10:
        boolean X = true;
        boolean Y = !X == false;
        boolean Z = Y;

        if (X) {
            System.out.println("Hello Everyone");
        }
        if (Y) {
            System.out.println("Today is a great day");
        }
        if (Z) {
            System.out.println("We have a picnic on Saturday");
        }

        /*
            vote age:
                age >= 18 ==> eligible to vote

                age >= 70 ==> can vote three times
                70 > age >= 50 ==> can vote twice
                50 > age >= 18 ==> can vote one time
         */
        int age = 45;
        if (age >= 0){
            if (age > 18) {
                if (age >= 70) {
                    System.out.println("can vote 3 times");
                } else if (age >= 50 && age < 70) {
                    System.out.println("can vote 2 times");
                } else {
                    System.out.println("can vote 1 time");
                }
            } else {
                System.out.println("not Eligible to vote");
            }
        } else {
            System.out.println("Invalid Entry");
        }




    }
}
