package Days31to40.Day36_JavaReview;

public class ConstructorCalls {

    public ConstructorCalls() {
        System.out.println("A");
    }

    public ConstructorCalls(int a) {
        //ConstructorCalls();
        this();
        System.out.println("B");
    }

    public static void main(String[] args) {
        method1();
        //ConstructorCalls();

        ConstructorCalls obj = new ConstructorCalls(10.0);
    }

    public ConstructorCalls(double a) {
        this(10);
        System.out.println("C");
    }

    public static void method1() {

    }

    public static void method2() {
        method1();
    }

}
