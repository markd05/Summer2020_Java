package Days21to30.Day29_ReturnMethods;

public class returnMethods {
    /*
        access-modifier     specifier   returnType    name(parameter){
            statements;
        }
     */

    //if return type is void
    public static void main(String[] args) {
        name(); //this is a String value
            //"z"
        System.out.println(name()); //return methods are either printed or assigned to a variable

        String str = name();
        System.out.println(str);
    }

    public static boolean result() {
        return 8 > 9;
    }

    public static void method1(){
        System.out.println("Hello");
        return;
    }

    //if the return type of the method is not void
    public static String name() {
        return "Batch12";
        //System.out.println();
            // once the return statement is executed, it exits the method immediately
    }

}
