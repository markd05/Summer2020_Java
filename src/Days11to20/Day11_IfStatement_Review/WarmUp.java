package Days11to20.Day11_IfStatement_Review;

public class WarmUp {
    /*
        1. declare an int variable "Year"
        2. write a java program that can check if the year is a leap year

        if a year can be divided by 4 ==> leap year
         do not use a single if statement
     */
    public static void main(String[] args) {

        int Year = 2000; // leap
        boolean LeapYear = Year % 4 == 0;

        if (LeapYear){
            System.out.println("Year " + Year + " is a leap year");
        }
        else {
            System.out.println("Year " + Year + " is NOT a leap year");
        }

    }
}
