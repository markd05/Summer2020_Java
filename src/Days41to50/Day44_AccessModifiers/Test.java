package Days41to50.Day44_AccessModifiers;

//import  static Days41to50.Day44_AccessModifiers.TestData.Name;
import static Days41to50.Day44_AccessModifiers.TestData.*;

public class  Test {
    public static String Name = "Muhtar";

    public static void main(String[] args) {
        defaultAccessModifier obj = new defaultAccessModifier();
        System.out.println(obj.namePublic);
        //System.out.println(obj.namePrivate); //private access modifier is not visible outside the class
        System.out.println(obj.nameDefault); //default access modifier is visible in the same package

        System.out.println(Name);
        System.out.println(TestData.Name);
        System.out.println(ID);
        System.out.println(SchoolName);

        int[] numbers = {1, 2, 3};
        //Arrays.toString(numbers);

        printHello();

    }

}
