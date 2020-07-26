package Days21to30.Day25_ArraysContinue;

public class warmUp2 {
    /*
        write a program that can print out unique values from String Array
     */
    public static void main(String[] args) {

        String[] arr = {"A", "A", "B", "C", "C"};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
            }
        }

    }
}
