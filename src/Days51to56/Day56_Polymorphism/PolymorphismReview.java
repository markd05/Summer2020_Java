package Days51to56.Day56_Polymorphism;

class A {
    protected void methodA() {
        System.out.println("method A");
    }

    public static void methodC() {
        System.out.println("methods C from A class");
    }
}

class B extends A{
    public void methodB() {
        System.out.println("method B");
    }

    @Override
    public void methodA() {
        System.out.println("method A from B class");
    }

    public static void methodC() {
        System.out.println("method C from B class");
    }
}

public class PolymorphismReview {
    public static void main(String[] args) {
        A obj = new A();

        A obj2 = new B();
        obj2.methodA();
        //obj2.methodB();

        //B obj3 = new A(); //child class cannot be the parent class' object

        //C obj4 = new C(); //abstract class is not concrete

        C obj5 = new D();

        E obj6 = new D();

        //D obj7 = new E(); //we cannot create object from interface

        //C obj8 = new E(); //we cannot create object from interface

        //E obj9 = new C();

        //E obj10 = new F();

        A obj11 = new B();
        obj11.methodA(); //from B class
        //if a method exists in both reference type and object, the overridden one gets executed

        obj11.methodC(); //from A class
        //if the method is not being overridden, then the reference type's method gets executed



    }
}

abstract class C {

}

class D extends C implements E {

}

interface E {

}

abstract class F implements E {

}
