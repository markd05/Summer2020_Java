package Days21to30.Day26_ForEach;

public class ContinueStatement {
    /*
        break statement: used to exit loop in switch statement

        continue statement: used for skipping th current iteration of the loop and jumps to the next iteration
     */
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.print(i + " ");

            int[] numbers = {1,2,3,4,5};
            for (int j = 0; j < numbers.length; j++) {
                if (i == 3) {
                    continue;
                }
                System.out.println(numbers[j] + " ");
            }
        }

    }

}
