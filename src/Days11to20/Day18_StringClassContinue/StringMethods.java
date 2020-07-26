package Days11to20.Day18_StringClassContinue;

public class StringMethods {

    public static void main(String[] args) {

        /*
            indexOf(str): returns the index number of the first character in the given String as an int value
         */
        String a = "Batch 12 is a great batch";
        int num = a.indexOf("g"); //14
        System.out.println(num);

        int num2 = a.indexOf("eat" + 2); //eat2
        //negative number means that the str does not exist in the String
        System.out.println(num2);

        String b = "today is tuesday, today we have class in the afternoon";
        int num3 = b.indexOf("te"); //47
        System.out.println(num3);

        /*
            lastIndexOf(): returns the last occurred character's index number as an int value
         */
        String str = "ABCDABCD";
        int n2 = str.indexOf("B");
        System.out.println(n2);
        int n3 = str.lastIndexOf("B");
        System.out.println(n3);

    }
}
