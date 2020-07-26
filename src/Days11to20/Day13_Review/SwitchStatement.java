package Days11to20.Day13_Review;

public class SwitchStatement {
    /*
        switch (Expression) {
            case caseValue:
                statements;
                break;
            default:
                statements;
                break;
     */
    public static void main(String[] args) {

        int num = 5;

        switch (num) {
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Entry");
                break;

            case 5:
                System.out.println("Friday");
                break;
        }

        String days = "Tuesday";

        switch (days) {
            case "Monday":
                System.out.println("Monday is fun day");
                break;

            case "Tuesday":
                System.out.println("Tuesday is great day");
                break;

            case "Wednesday":
                System.out.println("Wednesday is day off");
                break;

            default:
                System.out.println("Invalid");
                break;
        }

        long N1 = 10;
        //switch (N1){}

        float N2 = (int) 100; //100.0f
        //switch (N2){}

        double N3 = 10;
        switch ((int)N3){}

        boolean N4 = true; // 9 < 8
        //switch (N4) {}

        char ch = 'A';
        switch (ch) { }

        //or logic
        char grade = 'B';
        if (grade == 'A' || grade == 'B') {
            System.out.println("Passed the exam");
        } else {
            System.out.println("Failed");
        }

        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("Passed the exam");
                break;

            default:
                System.out.println("failed the exam");
        }

        String US = "USA";
        if (US == "USA" || US == "America" || US == "US") {
            System.out.println("American");
        } else {
            System.out.println("Not American");
        }

        switch (US) {
            case "US":
            case "America":
            case "USA":
                System.out.println("American");
                break;

            default:
                System.out.println("Not American");
        }
    }

}
