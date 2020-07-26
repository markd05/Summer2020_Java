package Days11to20.Day15_Scanner_StringClass;

public class WarmUp {
    /*
        write a java program that can convert numbers between 0 ~ 9 to words,
        if the number is greater or 9 or less than 0, output should be invalid
     */
    public static void main(String[] args) {

        int num=8;
        String result = "";

        if (num > 0 && num <= 9) {
            if (num == 9)
                result = "nine";
            else if (num == 8)
                result = "eight";
            else if (num == 7)
                result = "seven";
            else if (num == 6)
                result = "six";
            else if (num == 5)
                result = "five";
            else if (num == 4)
                result = "four";
            else if (num == 3)
                result = "three";
            else if (num == 2)
                result = "two";
            else if (num == 1)
                result = "one";
            else
                result = "zero";
            System.out.println(result);
        } else {
            System.out.println("Invalid");
        }

        int n = 7;
        String result2 = (n == 9)? "nine" : (n == 8)? "eight" : (n == 7)? "seven" : (n == 6)? "six"
                : (n == 5)? "five" : (n == 4)? "four" : (n == 3)? "three" : (n == 2)? "two"
                : (n == 1)? "one" : "zero";
        System.out.println(result2);

    }

}
