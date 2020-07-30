package Days41to50.Day45_Protected_Default;

import Days41to50.Day45_Inheritance.Protected_VS_Default;

public class Test extends Protected_VS_Default{
            //sub               super
    /*
    protected static String name;

    protected static void printHello() {
        System.out.println("Hello");
    }
     */

    public static void main(String[] args) {
        /*
        Protected_VS_Default obj = new Protected_VS_Default();
        obj.printHello(); //protected is not visible outside the package
        obj.printHola(); //default is not visible outside the package

        System.out.println(obj.name); //protected is not visible outside the package
        System.out.println(obj.id); //default is not visible outside the package
         */

        System.out.println(name);
        printHello();
        //System.out.println(id); //only public and protected can be inherited outside the package
    }

}
