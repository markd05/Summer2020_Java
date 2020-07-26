package Days31to40.Day40_staticKeyword;

public class staticPractice {

    static long num1;
    long num2;

    public static void main(String[] args) {
        System.out.println(num1);
        System.out.println(staticPractice.num1);

        //System.out.println(num2);
        //System.out.println(staticPractice.num2); //instance variable belongs to the object

        staticPractice.method1();

        //staticPractice.method2();

        staticPractice obj = new staticPractice();
        obj.method2();

        obj.method1();

        System.out.println(obj.num2);
    }

    public static void method1() {
        System.out.println("A");
    }

    public void method2() {
        System.out.println("B");
    }

}
