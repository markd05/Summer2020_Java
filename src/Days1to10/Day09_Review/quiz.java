package Days1to10.Day09_Review;

public class quiz {

    public static void main(String[] args) {

        //question 01
        boolean a = !!!!!false; //true
        System.out.println(a);

        //question 02
        boolean result = !false  != ("Batch12" != "Best Batch Ever"); //true != false = true
        System.out.println(result);

        //question 03
        int x = 100;
        double y = x += 100/20; //105
        System.out.println(y); //105.0

        //question 05
        boolean A = 128 > '9' || 128 == 127; //true || false = true
        System.out.println(A);

        //question 06
        boolean StupidOperators;
        StupidOperators =  10 >= 20 && 'a' > 'b'; // false && false = false
        System.out.println(StupidOperators);

        //question 07
        int X = 9999999;
        int Y = 10;
        System.out.println(x * y / 10 % x); //0

        //question 08
        int C = 100;
        int D = (byte) 100;
        System.out.println(C >= D && (C + 1 == C * 2 / 2 + 1)); //true

        //question 09
        int z = 100;
        //System.out.println("z > 100 is :" + H); H has not been defined yet
        boolean H = z > 100;

        //question 10
        System.out.println(5 + 7 + "8"); //128

        //question 11
        boolean results = 1 + 11 + "3" == "123"; //true
        System.out.println(results);

        //question 12
        int num = 100;
        num += 300;
        System.out.println(num++ + "" + num);

        //question 13
        int B = 100;
        //int C = B++ + ++B + C + B-- - --B - B; C has not been initialized yet

        //question 14
        System.out.println((10 * 2) / (5 * 4) * 1000 / 10 % 100); //0

    }

}
