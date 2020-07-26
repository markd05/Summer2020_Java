package Days1to10.Day10_ifStatement;

public class Multi_branch_ifStatement {
    /*
        if-else if-else:
            if (condition 1){
                //A ==> if condition 1 is true
            }
            else if (condition 2){
                //B ==> if condition 1 is false and condition 2 is true
            }
            else {
                //C ==> if both condition 1 and 2 are false
            }
     */
    public static void main(String[] args) {

        if (false){
            System.out.println("if block");
        }
        else if (false){
            System.out.println("else if block");
        }
        else {
            System.out.println("else block");
        }

        /*
            Task 01:
            90 <= grade ==> A
            80 <= grade < 90 ==> B
            70 <= grade < 80 ==> C
            60 <= grade < 70 ==> D
            else ==> F
         */
        int grade = 85;
        if (grade >= 90){
            System.out.println("You made an A");
        }
        else if (grade < 90 && grade >= 80){
            System.out.println("You made a B");
        }
        else if (grade < 80 && grade >= 70){
            System.out.println("You made a C");
        }
        else if (grade < 70 && grade >= 60){
            System.out.println("You made a D");
        }
        else {
            System.out.println("You made an F");
        }

    }

}
