package Days21to30.Day29_ReturnMethods;

public class warmUp {
    /*
        write a method that can find the frequency of characters in String
     */
    public static void main(String[] args) {
        String str = "aabbaaabbbcccccDDaa";
            //expected result: a5b5c5D2

        String removeDupe = "";
        for (int i = 0; i < str.length(); i++) {
            if (!removeDupe.contains(str.substring(i, i + 1))) {
                removeDupe += str.substring(i,i+1);
            }
        }
        System.out.println(removeDupe);

        String result = "";

        for (int j = 0; j < removeDupe.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).equals(str.substring(j,j+1))) {
                    count++;
                }
            }
            result += removeDupe.substring(j,j+1) + count;
        }

        System.out.println(result);


        String input = "XXXYYYZZZ";
            //expected result: X3Y3Z3

        String nonDupe = "";

        for (int i = 0; i < input.length(); i++) {
            if (!nonDupe.contains(""+input.charAt(i))) {
                nonDupe += ""+input.charAt(i);
            }
        }
        System.out.println(nonDupe);
    }
}
