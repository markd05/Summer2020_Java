package Days11to20.Day20_JavaReview;

public class quizReview {

    public static void main(String[] args) {

        //Q1:
        String str = "Hello World";

        System.out.println(str.substring(0,5));

        //Q4:
        String str2 = " ";

        System.out.println(str2.trim().isEmpty()); //true, trim gets rid of space

        //Q05:
        String a1 = "java"; //String pool
        String a2 = new String("java"); //heap

        System.out.println(a1 == a2); //false, different location

        //Q07:
        int z = 5;
        for (int i = 5; i > 0; i++) { // i: 5, 4, 3, 2, 1
            z += i;                   // z: 10,14,17,19,20
        }
        System.out.println(z);

        //Q11:
        int i = 0;
        for (i=5; i<10;) { // i: 5, 7, 9, 11
            i += 2;
        }
        System.out.println(i);

    }
}
