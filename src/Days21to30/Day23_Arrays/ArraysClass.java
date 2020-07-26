package Days21to30.Day23_Arrays;

public class ArraysClass {
    /*
        Arrays: a variable that we can store multiple values
            regular variable:
                int a = 10; can only have one value

            Arrays:
                int[] arr = {10, 20, 30, 40};
        Each value (element) in an Array have their own index
            int[] variableName = {10, 20, 30, 40, 50}
            index num:             0   1   2   3   4
     */
    public static void main(String[] args) {

        int[] arr = {1, 2};

        String[] names = {"Nigar", "Sumeyya", "Madina", "Juline"};
        //                   0         1          2         3
        System.out.println(names[0]); //Nigar
        System.out.println(names[1]); //Sumeyya

        String str = names[2];
        String str2 = names[3];
        System.out.println(str); //Madina
        System.out.println(str2); // Juline

        //System.out.println(names[4]); Out of bounds

        double[] myArray = {1, 2, 3, 4, 5, 8, 0, 2};
        //index:            0  1  2  3  4  5  6  7

        for (int i = 0; i <= 7; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();


        //Length of an Array:
        String str3 = "ABC";
        int A = str.length(); //String has parentheses
        System.out.println(A);

        int[] numbers = {12, 24, 38, 96, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int B = numbers.length; //Array has no parentheses
        System.out.println(B);

        int HighestIndexNum = numbers.length-1;
        System.out.println(HighestIndexNum);

        for (int i = 0; i <= numbers.length-1; i++) {
            int s1 = numbers[i];
            System.out.print(s1 + " ");
        }
        System.out.println();

        char[] myChars = {'A', 'B', 'C', 'D'};
        int Highest = myChars.length-1;
        System.out.println(Highest);

    }
}
