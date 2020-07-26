package Days1to10.Day07_Uneray_ShortHand;

public class quiz {

    public static void main(String[] args) {
        //question 02
        //System.out.println(a); a has not been defined yet

        //question 01:
        int a = 30;
        //int b = (long) a; long > int
        int b = (byte) a;
        System.out.println(b); //30

        //question 03:
        System.out.print("Result A" + 0 + 1); //"Result A01"
        System.out.print("; Result B" + (1) + (2)); //"; Result B12"
        System.out.println("Result B" + (1 + 2)); //"Result B3"

        //question 04:
        System.out.println("5 + 2 = " + 3 + 4); //"5 + 2 = 34"
        System.out.println("5 + 2 = " + (3+4)); //"5 + 2 = 7"

        //question 05:
        float FloatNum = 100.9876543F;
        //short ShortNum = (int) FloatNum // int > short
        short ShortNum = (byte) FloatNum; //100
        System.out.println(ShortNum);

        //question 06:
        //byte BNum = 200; byte cannot exceed 127
        int Numa = 200;
        int Numb = 2;
        System.out.println(Numa + Numb - Numb * Numa + Numa / Numb);
                        // 200  + 2    - 400 + 100 = -98

        //question 07:
        System.out.println((3 + 2) * 2 / 3 % 2); //5 * 2 / 3 % 2 => 10/3%2 => 3%2 => 1

        //question 08:
        int num1 = 9, num2 = 0; //num3 = num1/num2; cannot divide by 0
        //System.out.println(num3);

        //question 09:
        long Lnum = 3_000L;
        double Dnum = (float) Lnum;
        int Inum = (short) Dnum;
        System.out.println(Inum % 1000); //0

        //question 10:
        double result1 = 10/3; //3.0
        System.out.println(result1);
        System.out.println(10/3.0);

        //question 12:
        String str = "10.5"; //string of text
        //int num = (int) str; str is not a primitive

        //question 13:
        int I1 = 10, I2 = 20, I3 = 30;
        I1 = I1 % 5; //0
        I2 = I2 % 5; //0
        I3 = I1 * I2; //0
        System.out.println(I1 + "\t" + I2 + "\t" + I3);

        System.out.println(10 / 3L);
        System.out.println(10 / 3F);
        System.out.println(10 / 3D);

        float yy = 10.7f;
        double uu = 10.9;
    }

}
