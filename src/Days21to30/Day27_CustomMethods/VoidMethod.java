package Days21to30.Day27_CustomMethods;

public class VoidMethod {
    /*
        declaration of method:
        access-modifier    specifier    return-type    methodName() {}
     */
    public static void main(String[] args) {
        myFirstMethod();
        even1T0100();

        for (int i = 0; i < 100; i++) {
            System.out.println(i + " ");
        }
    }
    /*
        method is grouping a series of statements to perform a specific task
        benefits: reusable, can avoid repeating the same set of statements
     */

    public static void even1T0100() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    public static void myFirstMethod() {

        //public static void main(String[] args) {}
            //methods can not be declared inside of other methods
        System.out.println("Hello World");
        System.out.println("Hello Cybertek");
        System.out.println("Hello Khurshed");
    }

}
