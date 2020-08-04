package Days51to56.Day54_Polymorphism;

abstract class AbstractClass {

    public static void ByLinkText() {
        System.out.println("Link Text super");
    }

    public void get() {
        System.out.println("Chrome");
    }

}

public class Test extends AbstractClass {

    public void get() {
        System.out.println("Firefox");
    }

    public static void ByLinkText(int a) {
        System.out.println("Link Text sub");
    }

    public static void Test() {

    }

    public static void main(String[] args) {

        Test.ByLinkText(10);

        //AbstractClass obj = new AbstractClass();
            //we cannot create object from abstract class

        AbstractClass obj2 = new Test();
        obj2.ByLinkText();
        obj2.get();

        Test obj3 = new Test();
        obj3.ByLinkText(10);

    }

}
