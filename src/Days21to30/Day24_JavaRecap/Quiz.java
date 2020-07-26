package Days21to30.Day24_JavaRecap;

public class Quiz {
    public static void main(String[] args) {

        int i = 5;
        do {
            i--;
            System.out.println(i + " ");
        } while (i > 0);
        System.out.println();

        int x;
        int y = 5;
        for (x = 0; x < y; x++) {
            System.out.print((x += 2) + " ");
        }
        System.out.println();

        int X = 10;
        for (int j = 0; j <= 5; j++) {
            X += j;
        }

        for (int a = 0; a < 5; a++) {
            System.out.println(a + " ");
            break;
            //System.out.println("Hello"); break statement is the closing statement
        }

        String str = "Java";
        String str2 = new String("Java");
        System.out.println(str == str2); //false, different memory
        System.out.println(str.equals(str2)); //true

        int count = 100;
        do {
            count += 2;
        } while(str == str2);
        System.out.println();

    }
}
