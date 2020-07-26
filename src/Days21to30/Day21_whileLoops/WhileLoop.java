package Days21to30.Day21_whileLoops;

import java.util.Scanner;

public class WhileLoop {
    /*
        while (condition) {
            statements;
        }
     */
    public static void main(String[] args) {

        int a = 9;
        while (a > 8) {
            System.out.println("Hello");
            a--;
        }

        //write a java program that can count how many times the word "book" appears
        String sentence = "I like book, I read book, book book book";
        int count = 0;
        while (sentence.contains("book")) {
            count++;
            sentence = sentence.replaceFirst("book", "");
        }
        System.out.println(count);
        System.out.println(sentence);

        while (true) {
            System.out.println("hello");
            break; //forcefully exits the loop
        }

        int i = 0;
        while (true) {
            i ++;
            System.out.println("Hello" + i);
            if (i == 5) {
                break;
            }
        }

        for (int z = 1; z <= 100; z++) {
            if (z % 2 == 0) {
                System.out.print(z + " ");
            }
        }
        System.out.println("");
        /*
        convert to while loop:
            Initialization
            while (condition) {
                statements;
                iterator;
            }
         */
        int x = 1;
        while (x <= 100) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
            x++;
        }

        System.out.println("");

        Scanner scan = new Scanner(System.in);
        System.out.println("Starting number");
        int start = scan.nextInt();

        System.out.println("ending number");
        int end = scan.nextInt();

        /*
        for (int j = start; j <= end; j++) {
            if (j % 2 == 0) {
                System.out.println(j + " ");
            }
        }
         */
        int j = start;
        while (j <= end) {
            if (j % 2 == 0) {
                System.out.println(j + " ");
                j++;
            }
        }

    }
}
