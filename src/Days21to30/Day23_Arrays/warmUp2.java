package Days21to30.Day23_Arrays;

public class warmUp2 {
    /*
    write a program that can find unique characters from a String
    Ex:
        input:
            AAABCDEEFF
        output:
            BCD
     */
    public static void main(String[] args) {
        String str = "AAABCDEEFF";
        String unique = "";

        for (int j = 0; j < str.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).equals(""+str.charAt(j))) {
                    count++;
                }
            }
            if (count == 1) {
                unique += "" + str.charAt(j);
            }
        }
        System.out.println(unique);
    }
}
