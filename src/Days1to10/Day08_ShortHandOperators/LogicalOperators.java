package Days1to10.Day08_ShortHandOperators;

public class LogicalOperators {
        /*
            && : And logic     true && true   ==> true, if both conditions are true, it will return true
            || : Or logic      true  || true   ==> true
                               true  || false  ==> true
                               false || false ==> false
                if both conditions are false, it will return false, otherwise it will return true
         */

    public static void main(String[] args) {

        // && :
        boolean ResultA = 9 == 0 && "Muhtar" == "good"; // false && false = false
        System.out.println(ResultA);

        boolean ResultB = 8 > 5 && 7 == (8 - 2 + 1); // true && true = true
        System.out.println(ResultB);

        boolean ResultC = !false != true && !false == !(!true); // false && true = false
        System.out.println(ResultC);

        // || :
        boolean A = "Monday" == "Fun-day" || 6 == 6; // false || true = true
        System.out.println(A);

        boolean B = true || false; // true
        System.out.println(B);

        boolean C = !(8 > 5) || !("Today" != "Friday"); // false || false = false
        System.out.println(C);

        // && :
        boolean D = true && true || false; //true
        System.out.println(D);

        boolean E = (7 > 5 && 6 != 5) && (9 > 5 || 10 > 4); // true
        System.out.println(E);
    }

}
