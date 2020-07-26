package Days31to40.Day34_Constructors;

public class ConstructorsPractice {

    //public sort() { }     in constructor, the method name MUST be the dame with the class

    //default constructor
    public ConstructorsPractice(int a) {
        System.out.println("Hi I am constructor with parameter of int: " + a);
    }

    public static void main(String[] args) {
        ConstructorsPractice obj =  new ConstructorsPractice(10);
        //default (no-arg) constructor is given by default, when there is no other constructors

        //ConstructorMethods obj2 = new ConstructorMethods("Hello");
        //we do not have a constructor that passes String parameter

        method1();
        method2();
    }

    public static void method1() {
        System.out.println("Regular Method");
    }

    public static void method2() {
        ConstructorsPractice obj4 = new ConstructorsPractice(10);
        method1();
    }

}
