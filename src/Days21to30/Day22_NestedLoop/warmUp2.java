package Days21to30.Day22_NestedLoop;
import java.util.Scanner;
public class warmUp2 {
    /*
        2. write a program that can check if the String i s a palindrome
        if it is print "true, otherwise, print "false"
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hey, enter something");
        String original = scan.nextLine();
        String reverse = "";

        /*
        for (int i = original.length()-1; i >= 0; i--) {
            reverse += original.substring(i, i+1);
        }
         */

        int i = original.length()-1;
        while (i >= 0) {
            reverse += original.substring(i, i+1);
            i--;
        }

        boolean result = original.equals(reverse);
        System.out.println(result);

    }
}
