package Days1to10.Day08_ShortHandOperators;

public class ShortHand {
    /*
        += : addition assignment: x += y ==> x = x + y
        -= : subtraction assignment: x -= y ==> x = x - y
        *= : multiplication assignment: x *= y ==> x = x * y
        /- : division assignment: x /= y ==> x = x / y
        %= : remainder assignment: x %= y ==> x = x % y
     */

    public static void main(String[] args) {
        //+=
        int a = 9;
        //a = a + 3; //12
        a += 3; // a = a + 3
        System.out.println(a);

        int b = a += 5; // 12 += 5 => 12 + 5 = 17
        System.out.println(b);
        // a = 17 , b = 17

        int c = a += b; // a = 34 , b = 17 , c = 34
                    // 17 += 17 = 34
        System.out.println(c);

        int d = a += c; // a = 68 , b = 17 , c = 34 , d = 68
                    // 34 += 34
        System.out.println(d);

        int e = (d += b) * 2; // a = 68 , b = 17 , c = 34 , d = 85 , e = 170
        System.out.println(e); //170
        System.out.println(d); //85
        System.out.println(c); //34
        System.out.println(b); //17

        int f = b += d * 2;
        System.out.println(f); //187

        // -=:
        int g = 101;
        int h = g -= 1; //101 -= 1 = 100
        System.out.println(h);

        int i = g += h + 5; //g = 205 , h = 100 , i = 205
        System.out.println(i); // 205

        int j = h += g % i;
                    // 100 += 205 % 205
                    // 100 += 0
        System.out.println(j); //100

        int k = j -= h * 2 % 5;
                    // j -= 200 % 5
                    // 100 - 0
        System.out.println(k); //100

        // *=:
        int A = 100;
        A *= 200;
        System.out.println(A); // 20,000

        int B = 100;
            B *= 100/10; // 1,000
        System.out.println(B);

        B *= B -= 1000; // B *= (1000 - 1000) = 0
        System.out.println(B); //0

        // /=:
        int C = 1000;
        C /= 5;
        System.out.println(C); //200

        int D = 10;
        //C /= D - 10; denominator cannot be zero
        System.out.println(C);

        C /= D + 10;
        System.out.println(C);

        // %=:
        int z = 10 % 3; // 10/3 =3 remainder: 10 - 3*3 = 1

        int E = 10;
        E %= 2;
        System.out.println(E); //0

        int F = 100;
        F %= 2; // F = F % 2 ==> 0
        System.out.println(F); //if it's 0 it means it is an even number

        System.out.println(-100%3);
        System.out.println(10.5 % 3);

        int J = 300;
        int K = 10;
        J += J %= K;
        System.out.println(J);

    }
}
