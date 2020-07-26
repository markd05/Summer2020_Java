package Days1to10.Day10_ifStatement;

public class single_ifStatement {
    /*
        single if:
            if (boolean expression) {
                //A
            }
     */
    public static void main(String[] args) {

        if (9 > 8){
            System.out.println("9 is greater than 8");
        }

        System.out.println("Test Completed");

        //Task 01
        int num1 = 100;
        int num2 = 100;
        int max = 0;

        if (num1 > num2) { //means that num1 is greater than num2
            max += num1;
        }
        if (num2 > num1) {
            max += num2;
        }
        if (num1 == num2) {
            max = num1;
        }
        System.out.println("Maximum number between " + num1 + " and " + num2 + " is: " + max);

        //task 02
        int hours = 64;
        int minutes = 45;
        int seconds = 30;
        String amOrPm = "pm";
        int amPm = hours/12;
        int pmAm = amPm%2;

        if (hours > 12){
            hours = hours % 12;
            if (hours == 0){
                hours = 12;
            }
        }
        if (pmAm == 0){
            if (amOrPm == "am"){
                amOrPm = "pm";
            }
            if (amOrPm == "am"){
                amOrPm = "am";
            }
        }

        System.out.println(hours + ":" + minutes + ":" + seconds + " " + amOrPm);

        //task 03
        int n1 = 100, n2 = 500, n3 = 700;
        int maximum = 0;

        /*
        in order for n1 to be the maximum: n1>n2 && n1>n3
        in order for n1 to be the maximum: n2>n1 && n2>n3
        in order for n1 to be the maximum: n3>n1 && n3>n2
         */

        if (n1 > n2 && n1 > n3){
            maximum = n1;
        }
        if (n2 > n1 && n2 > n3){
            maximum = n2;
        }
        if (n3 > n1 && n3 > n2){
            maximum = n3;
        }
        System.out.println("Maximum numbers between " + n1 + ", " + n2 + " and " + n3 + " is " + maximum);

        int A;
        if (true){
            A = 12;
        }
        System.out.println(A);

        double B;
        if (false){
            B = 100;
        }
        //System.out.println(B); B has not been initialized
    }
}
