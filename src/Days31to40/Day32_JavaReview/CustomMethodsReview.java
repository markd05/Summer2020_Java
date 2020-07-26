package Days31to40.Day32_JavaReview;

public class CustomMethodsReview {
    /*
        declaration of methods:
            access-modifiers    specifier   return-type     methodName(parameter){
                method body;
            }

        Access modifier: public
        specifier: static
        return-type: void, all primitives and non primitives
        methodName: anyName
        parameter: any data type

        if the return type of the method is void: method does not return any value

        if the return type of the method is NOT void: method MUST return a value,
            and the returning value mst match with the return type

method that passes parameter (with argument):
     */

    public static void main(String[] args) {
        method1();
        method1();

        evenNum();

        reverseString("void");

        byte num = (byte) largestNumber(12,13);

        System.out.println(largestNumber(10,20));

        String Hazim = rev("Hazim");
        System.out.println(Hazim);
    }

    public static void method1() {
        System.out.println("Hello World");
        System.out.println("Hello Cybertek");
        System.out.println("Hello Batch12");
    }

    public static void evenNum() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + ", ");
        }
    }

    public static void reverseString(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
    }

    public static void print(String str) {
        System.out.println(str);

        return;
    }

    public static int largestNumber(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
        //System.out.println(max);
    }

    public static String rev(String str) {
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += i;
        }
        return result;
    }
}
