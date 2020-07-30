package Days41to50.Day45_Inheritance;

class TestBase {

    static String chromeDriver = "Fire fox"; //default

    public static void TakeScreenShot() {
        System.out.println("Took screenshot");
    }

    private static void closeBrowser() {
        System.out.println("Browser closed");
    }

}

class D extends TestBase{
    //sub        super
}

public class Inheritance extends TestBase {
                //sub             //super
    //sub class is going to inherit all the visible or protected features from the super class
    /*
        static String chromeDriver;

        public static void TakeScreenShot() {
            System.out.println("Took screenshot");
        }

        the variable and method are not visible, but they are somewhere in this class
     */

    public static void main(String[] args) {

        System.out.println(chromeDriver);

        TakeScreenShot();

    }

}
