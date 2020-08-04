package Days51to56.Day51_Abstraction;

abstract class Test {
    abstract void m();

    protected abstract void m(int a);

}

public class practice extends Test {

    //abstract void m();

    @Override
    void m() {
        practice obj = new practice();
    }

    @Override
    public void m(int a) {

    }

    final int num2  = 30;
    final static int num3 = 40;

    public static void main(String[] args) {
        final int num;
        num = 10;
        System.out.println(num);

    }
}

final class A {

}

//class B extends A {}  final class cannot be super class

abstract class C {

    int num;
    static int num2;

    public static void main(String[] args) {

    }

    public static String main(String[] arr, String str) {
        return "A"; //return type doesn't matter in method overloading
    }

    static {

    }

    {

    }

    abstract void absmethod();

}

abstract class D extends C {

    /*
    @Override
    void absmethod() {

    }
     */

    //final abstract void methodA();

    public abstract void methodB();
    protected abstract void methodC();
    abstract int methodD();

    //private abstract double methodE();
        //private is not visible outside the class

}

class credentials {

    private String username = "123";

    //getter: return method
    public String getUsername() {
        return username;
    }

    //setter (modify): return type is void
    public void setUsername(String username) {
        this.username = username;
    }
}
