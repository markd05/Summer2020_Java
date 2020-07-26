package Days11to20.Day16_Recap;

public class Kahoot {

    public static void main(String[] args) {

        //Q4:
        /*
        int Batch = 12;
        switch (Batch) {
            case 014: //don't start numbers with 0
                System.out.println("Cybertek");
                break;
            case 12:
                System.out.println("Best");
            default:
                System.out.println(" Batch");
        }
         */

        //Q8:
        int x = 5, y = 19;

        int num = y-x > x-y ? y-x : x-y;
        //        14  > -14 ? 14  : -14
        System.out.println(num);

        //Q9:
        int sum = 2, price = 100;

        sum *= price >= 100 ? price *= 2 : price;
        //     100   >= 100 ? 200 : 100
        // sum *= 200; ==> 400
        System.out.println(sum + " " + price);

        //Q10:

        //boolean OPT = true; boolean doesn't work in switch statements
        String OPT = "true";
        switch (OPT) {
            case "true":
                System.out.println("True ");
                break;
            default:
                System.out.println("False ");
        }
        System.out.println("Done");

        //Q6:
        float f1 = (12_345.1 > 12_345.0)? 12456 : 12456.02f;
        //          21345.1 > 12345.0 ? 12456   : 12456
        float f2 = f1 + 1024;
        // 12456 + 1024 = 13480.0 > 13480
        System.out.println(f2);

        //Q8:
        int i = 10;
        int j = 20;
        int k = j += i/5;
        //  k = j += 2;
        //      j += 2 ==> j = j + 2 = 22
        //k = 22
        System.out.println(i + " " + j + " " + k);

    }

}
