package Days41to50.Day48_MethodOverRiding;

class student{

    public void printName() {
        System.out.println("Hakan");
    }

}

public class MethodOverriding extends student {

    public void print(String str) {

    }

    public void print(double a) {

    }

    //public void print(String str) {   }   overriding cannot happen in the same class

    public void printName() {
        System.out.println("Shukran");
    }

    public static void main(String[] args) {

        student obj2 = new student();
        obj2.printName(); //Hakan

        MethodOverriding obj = new MethodOverriding();
        obj.printName(); //Hakan

    }

}