package Days21to30.Day22_NestedLoop;

public class practice {
    /*
        *
        **
        ***
        ****
        *****
     */
    public static void main(String[] args) {

        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
