package Days41to50.Day46_SuperKeyword;

class A {

    String name = "Madina";

    public void methodA() {

    }

    public A(int a) {

    }

}

public class SuperKeyWord extends A {
    //          sub             super

    public SuperKeyWord(int a) {
        super(10); //super class's constructor MUST be called in the sub class
    }

    /*
        String name = "Madina";
     */

    public void method() {
        super.name = "Mahir";
        this.name = "Ihsan";
        super.methodA();
        this.methodA();
    }
}
