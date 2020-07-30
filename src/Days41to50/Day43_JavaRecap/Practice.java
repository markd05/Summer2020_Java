package Days41to50.Day43_JavaRecap;

public class Practice {

    public static void main(String[] args) {

        staticKeyword.printName(); //Nurzat
        //static methods can be called through the class name

        //staticKeyword.printName2();
            //instance methods cannot be called through the class name

        Practice.printName(); //Semra

        printName(); //Semra

        System.out.println(staticKeyword.StaName);
        //static features can be called through the className

        staticKeyword obj = new staticKeyword();
        obj.printName2();
        //in order to call a non static, we must create an object
    }

    public static void printName() {
        System.out.println("Semra");
    }

}
