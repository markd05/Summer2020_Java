package Days21to30.Day30_WrapperClass_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<>();

        //add method:
        nameList.add("Hoymayra");
        nameList.add("Apple");
        System.out.println(nameList);

        /*
            create an ArrayList called studentNames
            create scanner object called scan
         */
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a name");
            String name = scan.nextLine();
            studentNames.add(name);

            System.out.println("Do you want to add another name");
            String answer = scan.nextLine();
            if (answer.equalsIgnoreCase("no")) {
                break;
            } else if (!answer.equalsIgnoreCase("yes")) {
                System.out.println("invalid");
                break;
            }
        }
        System.out.println(studentNames);
    }

}
