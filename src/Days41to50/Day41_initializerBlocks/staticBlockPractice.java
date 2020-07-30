package Days41to50.Day41_initializerBlocks;

import java.util.ArrayList;
import java.util.Arrays;

public class staticBlockPractice {

    public static String name; // "Suna", "Erhan", "Mehmet
    public static int[] arr1;
    public static ArrayList<String> list = new ArrayList<>();
    public static ArrayList<String> students = new ArrayList<>();
    public static String[] online = {"Arzigul", "Me", "Spike", "Savas", "Bahadir"};
    public static String[] inClass = {"Daryna", "Nadire", "olga", "Mizgin"};

    public static double a = 100;
    public int grade;

    static {
        name = "Erhan";
        arr1 = new int[3];
        arr1[1] = 2;

        list.add("Break");

        students.addAll(Arrays.asList(online));

        a = 300;
    }

    static {
        name = "Suna";
        arr1 = new int[5];
        arr1[0] = 1;
        arr1[2] = 3;

        list.add("Coffee");
        list.add("Tea");

        students.addAll(Arrays.asList(inClass));

        a = 400;
    }


    public static void main(String[] args) {
        staticBlockPractice obj1 = new staticBlockPractice();

        System.out.println(name);   //null

        System.out.println(Arrays.toString(arr1));

        System.out.println(list);

        System.out.println(students);

        a = 500;
        System.out.println(a);

        System.out.println(obj1.grade);

    }

    public staticBlockPractice() {
        name = "Mehmet";
        grade = 1000;
    }

}
