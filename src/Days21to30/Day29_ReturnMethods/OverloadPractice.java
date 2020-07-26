package Days21to30.Day29_ReturnMethods;

public class OverloadPractice {

    public static void main(String[] args) {
        System.out.println("String Array");

        boolean[] array1 = {true, false};
        main(array1);

        double[] array2 = {1,2,3};
        main(array2);
    }

    public static void main(int[] a) {
        System.out.println("Int Array");
    }

    public static void main(double[] b) {
        System.out.println("Double Array");
    }

    public static void main(boolean[] c) { //return type does not matter
        System.out.println("Boolean Array");
    }

}
