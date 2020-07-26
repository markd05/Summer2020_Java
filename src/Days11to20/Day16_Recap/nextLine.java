package Days11to20.Day16_Recap;
import java.util.Scanner;
public class nextLine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your phone number");
        int phoneNum = scan.nextInt();
        //12345 Enter

            scan.nextLine(); //this scan line takes in the Enter, allowing the next scan line be be used
        String name = scan.nextLine();
        //nextLine will take everything in scanner's memory up to the newline

        //nextLine method accepts the "Enter" from the keyboard
        System.out.println("Enter your phone number");
        //911 Enter
        int pn = scan.nextInt();
        System.out.println(pn);

        scan.nextLine(); //this will take out the Enter
        System.out.println("Enter your name");
        String name2 = scan.nextLine();
        //nextLine() method will take everything in scanner's memory up to the new line


    }

}
