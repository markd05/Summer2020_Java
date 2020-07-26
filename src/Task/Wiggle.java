package Task;

public class Wiggle {

    public static void main(String[] args) {
        String w = "wiggle";
        String space = "     ";
        int a;
        int b;
        for (int i = 0; i<10; i++) {
            for (a = 0; a < 6; a++) {
                String s1 = space.substring(0, a);
                System.out.println(s1 + w);
            }
            for (b = 5; b > 0; --b) {
                String s2 = space.substring(0, b);
                System.out.println(s2 + w);
            }
            a = 0;
            b = 0;
        }
    }

}
