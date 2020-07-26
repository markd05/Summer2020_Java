package Days21to30.Day28_JavaRecap;

public class warmUp2 {
    /*
        3. write a method that accepts 3 parameters: 2 numbers and one operator, and prints out the calculation
            if operator is not in between [-, +, *, /, %] output shout be invalid operator
            Ex: calculate(10,20, "*") ==> 20;

        4. write a method that calculates grade
            100~90 ==> A
            89~80 ==> B
            79~70 ==> C
            69~60 ==> D
            0~59 ==> F
            otherwise ==> invalid score
     */
    public static void main(String[] args) {
        calculate(10,5,"/");

        CalculateGrades(75);
    }

    public static void calculate(int a, int b, String Ope) {
        //4:
        String result = "";
        if (Ope.equals("-")) {
            result += (a-b);
        } else if (Ope.equals("+")) {
            result += (a+b);
        } else if (Ope.equals("*")) {
            result += (a*b);
        } else if (Ope.equals("/")) {
            result += (a/b);
        } else if (Ope.equals("%")) {
            result += (a%b);
        } else {
            System.out.println("Invalid operator");
        }

        String result2 = "";
        result2 += (Ope.equals("-"))?(a-b):(Ope.equals("+"))?(a+b):(Ope.equals("*"))?(a*b):(Ope.equals("/"))?(a/b):(Ope.equals("%"))?(a%b):"InvalidOperator";

        System.out.println(result2);
    }

    public static void CalculateGrades(int score) {
        char Grade = (score >= 90 && score <= 100)? 'A' :(score >= 80 && score <= 89)? 'B'
                        :(score >= 70 && score <= 79)? 'C' :(score >= 60 && score <= 69)? 'D'
                        :(score >= 0 && score <= 59)? 'F' : 'I';

        if (Grade == 'I') {
            System.out.println("Invalid");
        } else {
            System.out.println(Grade);
        }
    }
}
