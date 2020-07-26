package Days1to10.Day07_Uneray_ShortHand;

public class UnaryOperators {

    public static void main(String[] args) {

        /*
            + : positive
            - : negative
            ++ : Increment
            -- : Decrement
         */

        int a = 10;
        int b = -10;
        System.out.println(b);

        int c = +b; //-10
        System.out.println(c);

        int d = -c; //10
        System.out.println(d);

        int f = - (10); //-10
        System.out.println(f);

        // increments
        //pre increment: operator is placed before the variable, increases the value by 1 immediately
        int num1 = 100;
        System.out.println(++num1); //101

        int num2 = ++num1; // ++(101) => 102
        System.out.println(num2);

        //post increment: operator is placed after the variable
        int IntNum = 100;
        System.out.println(IntNum++); //100
        System.out.println(IntNum); //101

        int IntNum2 = IntNum++; // IntNum2 = 101
        System.out.println(IntNum2); //101
        System.out.println(IntNum); //102

        int x = 100;
        int y = x++ -1; //y = 99
        System.out.println(y);

        //decrement: decreases he value by 1
        //pre-decrement: operator is placed before the variable, decreases the value by 1 immediately

        int Z = 100;
        --Z; //99
        System.out.println(--Z); //98

        //Post-decrement: operator is placed after the variable

        int Y = 95;
        System.out.println(Y--); //95
        System.out.println(Y); //94

        int T = 25;
        System.out.println(++T); //26
        System.out.println(--T); //25

        int P = 50;
        P = --P + P++ + P-- + P++; //P = 49 + 49 + 50 + 49
        System.out.println(P); //197

        short S = 4;
        int R = S * 4 - S --; //R = 16 - 4 = 12
        System.out.println(R); //12
        System.out.println(S); //3

        int W = 1;
        W = -W-- + W++ / -W-- * --W; //W = -1 + 0 / -1 * -1 => -1 + 0 * -1 => -1 + 0 => -1
        System.out.println(W); //-1


    }

}
