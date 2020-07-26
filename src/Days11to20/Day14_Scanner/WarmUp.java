package Days11to20.Day14_Scanner;

public class WarmUp {
    /*
    write a program that can display the days
        if the day is Monday or Tuesday:
                Java class days
        if the day is Thursday or Friday:
                Selenium class days
        if the day is Wednesday or Saturday:
                SQL class days
       otherwise: day off
       Do NOT use if statement
     */
    public static void main(String[] args) {

        String day = "Tuesday";

        switch (day) {
            case "Monday":
            case "Tuesday":
                System.out.println("Java class days");
                break;

            case "Thursday":
            case "Friday":
                System.out.println("Selenium class days");
                break;

            case "Wednesday":
            case "Saturday":
                System.out.println("SQL class days");
                break;

            default:
                System.out.println("Day off");
        }

    }

}
