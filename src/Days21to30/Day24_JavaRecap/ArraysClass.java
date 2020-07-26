package Days21to30.Day24_JavaRecap;

public class ArraysClass {
    public static void main(String[] args) {
        /*
            Array Declarations:
                DataType[] VariableName = {Value1,Value2,...}
                DataType VariableName[] = {Value1,Value2,...}
         */

        int a = 10;
        int[] arr = {10, 20, 30};

        int arr2[] = {10, 20, 30};

        char arr3[] = {'A', 'B', 'C'};

        String arr4[] = {"Ibrahim", "Feliz", "Aysel"};

        //String name = arr4[3]; index 3 does not exist
        String name = arr4[2];
        System.out.println(name);

        /*
            initialize the size of array:
                int[] arr = new int[size];
         */

        int[] myNumbers = new int[5];
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(myNumbers[i]);
        }
        /*
            default values:
                int, byte, short, long ==> 0
                double & float ==> 0.0
                boolean ==> false
                char ==> space
                String ==> null
         */

        int ch[] = new int[3];
        ch[0] = 10;
        ch[1] = 20;
        ch[2] = 30;
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]); //10 20 30
        }

        ch = new int[4];
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]); // 0 0 0 0
        }

        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6};

        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[i + array1.length] = array2[i];
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }

    }
}
