package Days41to50.Day48_MethodOverRiding;

class Credentials {

    private final String UserName = "cybertek";
    private final String PassWord = "Batch12";

    public String getUserName() {
        return UserName;
    }

    /*
    public void setUserName(String UserName) {
        this.UserName = UserName;
        //final variables cannot be reassigned
    }
     */

}

class Holly {

    final public void printName() {
        System.out.println("Erhan");
    }

}

public class finalKeyword extends Holly {

    /*
    @Override
    public void printName() {
        System.out.println("Madina");
    }
        final methods cannot be overridden
     */

    final int AGE = 100;

    public static void main(String[] args) {

        final String SSN = "123456";
        //SSN = "654321";
            //final variables are constance and cannot be changed

        System.out.println(SSN);

        final String DateOfBirth;

        //System.out.println(DateOfBirth);

        finalKeyword obj = new finalKeyword();

        System.out.println(obj.AGE);
    }

    public final static void add(int a, int b) {
        System.out.println(a+b);
    }

    public static double add(double x, double y) {
        return x+y;
    }

}
