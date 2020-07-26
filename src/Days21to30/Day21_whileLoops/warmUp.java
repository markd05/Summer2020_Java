package Days21to30.Day21_whileLoops;

public class warmUp {
    /*
    write a java program that can count how many times the word "book" is appeared in a String
     */
    public static void main(String[] args) {

        String sentence = "I like book, I have book, I need book, I buy book";
        int count = 0;

        for (int i = 0; i < sentence.length()-3; i++) {
            if (sentence.substring(i, i + 4).equals("book")) {
                count++;
            }
        }
        System.out.println(count);

        String words = "Cybertek is school, Cybertek is great, I love Cybertek";

        int nTimes = 0;
        for (int i = 0; i < words.length()-7; i++) {
            if (words.substring(i, i + 8).equals("Cybertek")) {
                nTimes++;
            }
        }
        System.out.println(nTimes);

        /*
        write a program that can remove duplicated values from String
         */
        String s1 = "aabbcc";
        String result = "";

        for (int i = 0; i < s1.length(); i++) {
            if (!result.contains(s1.substring(i, i + 1))) {
                result += s1.substring(i, i + 1);
            }
        }
        System.out.println(result);
    }
}
