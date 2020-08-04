package Days51to56.Day53_InterfaceContinue;

public interface Interface_VS_AbstractClass {

    //access-modifier   className() {   }

    //public Interface_VS_AbstractClass() { }
    //public void mm() {}

    static int num = 300;

    //static { }
        //variables in interface are static and final by default, final variables cannot be reassigned

    public abstract void method1();
    public abstract int method2();

    public void method3(); //abstract by default
    void method4(); //public and abstract by default

    public default void mm() {

    }

    //protected abstract void method5();
    //public protected abstract void method5();

    int a = 10; //public
    //public final static int a;

    public static void main(String[] args) {
        System.out.println(a); //static only accepts static

        System.out.println(Interface_VS_AbstractClass.a);

        //Interface_VS_AbstractClass obj = new Interface_VS_AbstractClass();
            //interface is not class
            //abstraction is not concrete, but object HAS to be concrete
    }

}

class Test implements Interface_VS_AbstractClass {

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }
}
