package Days1to10.Day08_ShortHandOperators;

public class RelationalOperators {
    /*
    Relational Operators: returns boolean expression
        >  : greater than
        >= : greater than or equal
        <  : less than
        <= : less than or equal
        == : equal
        != : not equal

        = : assign
        ! : the logical opposite
     */
    public static void main(String[] args) {

        System.out.println(10 > 9); //greater than
        boolean resultA = 10 > 9;
        System.out.println(resultA); //true

        System.out.println(10 >= 9); //greater than or equal
        boolean resultB = 9 >= 10;
        System.out.println(resultB); //true

        boolean resultC = 10 <= 9; //less than or equal
        System.out.println(resultC); //true

        boolean resultD = 1100 < 1200; //less than or equal
        System.out.println(resultD); //false

        boolean resultE = 1000 < 1000;
        System.out.println(resultE); //false

        boolean resultF = 1000 <= 1000;
        System.out.println(resultF); //true

        boolean resultG = 19 == 19; //equal
        System.out.println(resultG); //true

        boolean resultH = 20 != 20; //not equal
        System.out.println(resultH); //false

        boolean A = true == !false;
        System.out.println(A);

        boolean B = !true;
        System.out.println(B);

        /*
            in java:
                true == true , false == false
                !false == true , !true == false
                so therefore:
                    !false does not equal !true
                    and
                    true equal !false
         */

        boolean C = !false != !true;
        System.out.println(C);

        boolean D = true == !false;
        System.out.println(D);

        boolean E = !(!true); //not(not false)
        System.out.println(E);

        boolean F = 10 > 9 == 9 < 10;
        System.out.println(F);

        boolean G = false;
        System.out.println(!G); //true

        System.out.println(!true == false); //true

        boolean h = "Batch12" == "Batch13";
        System.out.println(h);

        System.out.println("batch12" == "Batch12"); //false, java is case sensitive
        System.out.println("cybertek" != "club"); //true
        System.out.println("Kuzzat" == "bad guy"); //false
        System.out.println("Assistant teacher in class" == "Awesome"); //false


    }

}
