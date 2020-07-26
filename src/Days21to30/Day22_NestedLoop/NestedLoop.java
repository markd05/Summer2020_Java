package Days21to30.Day22_NestedLoop;

public class NestedLoop {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int z = 1; z <=5; z++) {
                System.out.print(z);
            }
            System.out.println();
        }
        System.out.println();

        int a = 1;
        while (a <= 5) {
            int b = 1;
            while (b <= 5) {
                System.out.print("*");
                b++;
            }
            System.out.println();
            a++;
        }
        System.out.println();

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int I = 1;
        while (I <= 7) {
            int J = 1;
            while (J <= I) {
                System.out.print("*");
                J++;
            }
            System.out.println();
            I++;
        }
        System.out.println();

    }

}
