package Days21to30.Day22_NestedLoop;

public class warmUp {
    /*
        write a program which prints out the numbers from 1 to 30:
        1. for numbers which are divisible by 3, print "FIN" instead of the number
        2. for numbers which are divisible by 5, print "RA" instead of the number
        3. for numbers which are divisible by both 3 and 5, print "FINRA" instead of the number
        DO NOT USE FOR LOOP
     */
    public static void main(String[] args) {

        String str = "";
        int i = 1;
        while (i <= 30) {
            /*
            if (i % 3 == 0 && i % 5 == 0) {
                str += "FINRA ";
            } else if (i % 3 == 0) {
                str += "FIN ";
            } else if (i % 5 == 0) {
                str += "RA ";
            } else {
                str += i + " ";
            }
             */


            str += (i % 3 == 0 && i % 5 == 0)? "FINRA " :
                        (i % 3 == 0)? "FIN " :
                            (i % 5 == 0)? "RA " :
                                    i + " ";

            i++;
        }
        System.out.println(str);

    }
}
