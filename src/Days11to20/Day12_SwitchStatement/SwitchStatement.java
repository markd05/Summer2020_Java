package Days11to20.Day12_SwitchStatement;

public class SwitchStatement {
    /*
        switch statements does a similar thing as multi-branch if statements

            switch(Expression){
                case CaseValue:
                        statement1
                        statement2
                        break
            }
     */
    public static void main(String[] args) {

        int score = 1;

        if (score == 1) { //must give boolean expression
            System.out.println("1");
        } else if (score == 2) {
            System.out.println("2");
        }
        else {
            System.out.println("Invalid");
        }

        switch (score) { //must give an Expression: data
            case 1: //acts like if statement
                System.out.println("1");
                break;
            case 2: //acts like else if statement
                System.out.println("2");
                break;
            default: //acts like else statement
                System.out.println("Invalid");
                break;
        }

        String str = "Java";

        switch (str) {
            case "C#":
                System.out.println("C# programming language");
                break;
                //System.out.println("C# programming language"); code is after break so it will not run

            case "Python":
                System.out.println("Python programming language");
                break;

            default: //else
                System.out.println("Invalid");
                // no need for break; because it is at the end, ONLY for default
        }

        char grade = 'A';
        switch (grade) {
            case 'B':
                System.out.println("Passed with B");

            case 'C':
                System.out.println("Passed with A");

            default:
                System.out.println("Failed");
        }

    }

}
