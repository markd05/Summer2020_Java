package Days11to20.Day14_Scanner;

public class Ternary {
    /*
            if-else                    Ternary
        if (condition)       ==>     (condition)?
        else                 ==>       :
        else if (condition)  ==>     :(condition)?
     */
    public static void main(String[] args) {
        int num = 0;

        //if else statement
        if (true) {
            num = 100;
        } else {
            num = 50;
        }
        System.out.println(num);

        //Ternary
        num = (false)? 100 : 50; //Ternary returns a value
        int n = false ? 100 : 50; //no need for parentheses

        System.out.println(num);

        String schoolName = "";
        boolean Batch12 = true;

        if (Batch12) {
            schoolName = "Cybertek";
        } else {
            schoolName = "Invalid";
        }

        schoolName = Batch12 ? "Cybertek" : "Invalid";
        System.out.println(schoolName);

        String BestSchool = Batch12 ? "Cybertek" : "Invalid";
        System.out.println(BestSchool);

        double d = 10;
        if (true) {
            d = 10.5;
        }

        double z = true ? 10.5 : 0;
        //in ternary, total number of ? and : have to be equal

        double interestRate = 0;
        boolean GoodCredit = true;
        interestRate = true ? 0.5 : 0.9;
        System.out.println(interestRate);

        byte grade = 60;
        boolean Passed = grade >= 60 ? true : false;
        System.out.println(Passed);

        char FinalGrade = 'A';
        String Group = "";

        if (FinalGrade == 'A') {
            Group = "Early Bird";
        } else if (FinalGrade == 'B') {
            Group = "Group 1";
        } else if (FinalGrade == 'C') {
            Group = "Group 2";
        } else {
            Group = "After Group 1";
        }
        System.out.println(Group);

        Group = (FinalGrade == 'A') ? "Early Bird" : (FinalGrade == 'B') ? "Group 1" : "After Group 1";
        System.out.println(Group);

        int score = 80;
        char Finals = ' ';

        if (score >= 90 && score <= 100) {
            Finals = 'A';
        } else if (score >= 80 && score <= 89) {
            Finals = 'B';
        } else if (score >= 70 && score <= 79) {
            Finals = 'C';
        } else if (score >= 60 && score <= 69) {
            Finals = 'D';
        } else if (score >= 0 && score <= 59) {
            Finals = 'F';
        } else {
            Finals = ' ';
        }

        Finals = (score >= 90 && score <= 100) ? 'A' :
                (score >= 80 && score <= 89) ? 'B' :
                        (score >= 70 && score <= 79) ? 'C' :
                                (score >= 60 && score <= 69) ? 'D' :
                                        (score >= 0 && score <= 59) ? 'F' :
                                                ' ';
        System.out.println(Finals);

        int n1 = 100, n2 = 300, n3 = 400;
        int max = (n1 > n2 && n2 > n3) ? n1
                : (n2 > n2 && n2 > n3) ? n2
                : n3;
        System.out.println(max);
    }

}
