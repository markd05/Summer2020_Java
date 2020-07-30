package Days41to50.Day44_AccessModifiers;

public class TestData {

    public static String Name = "Juline";
    public static String ID = "007";
    public static String SchoolName = "Cybertek";
    static  int age = 20; //access-modifier is default

    private static String Password = "cybertek";

    static double salary = 100000;

    protected double number = 123;

    public static void printHello() {
        System.out.println("Hello");
    }

}
