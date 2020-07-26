package Days21to30.Day23_Arrays;

import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {

        String student1 = "Ibrahim";
        String student2 = "Zuleyha";
        String student3 = "Elina";

        String[] AllStudents = {"Ibrahim", "Zuleyha", "Elina"};
        AllStudents[0] = "Marufjon";
        System.out.println(AllStudents[0]); //Marufjon

        System.out.println(AllStudents.length);

        //initialize the size only without giving value:
        int[] array = new int[4];

        System.out.println(array.length);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //give values to array
        array[1] = 100;
        System.out.println(array[1]);
        array[0] = 200;
        System.out.println(array[0]);
        //array[5] = 500; Array size is fixed
        //System.out.println(array[5]);

        //int[] array2;
        //System.out.println(array2[0]); Array's size must be initialized

        Scanner scan = new Scanner(System.in);
        int[] inputs = new int[10];

        for (int i = 0; i < inputs.length; i++) {
            System.out.println("Enter a number");
            inputs[i] = scan.nextInt();
        }
        for (int i = 0; i < inputs.length; i++) {
            System.out.print(inputs[i] + " ");
        }

        String[] allStudentsNames = new String[358];
        allStudentsNames = new String[1000];

    }
}
