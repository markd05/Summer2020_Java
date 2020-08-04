package Days41to50.Day48_MethodOverRiding;

class Mahribana {

    void methodA() { //the method we are going to override MUST be inheritable to the sub class
        System.out.println("Method A");
    }

    public String methodB() {
        return "B";
    }

    /*
    public String methodB() {
        return "c";
    }
     */

    public double salary(double bonus) {
        return bonus+100000;
    }

}

public class AccessModifiers extends Mahribana{

    /*
    public double salary(double bonus) {
        return bonus+100000;
    }
     */

    protected double salary(int bonus) {
        return bonus+20000;
    }

    /*
    @Override
    void methodA() {
        System.out.println("Method A");
    }
        override method's access modifiers need to be the same or more visible
     */

    @Override
    void methodA() {
        System.out.println("Method A");
    }

    @Override
    public String methodB() {
        return "C";
    }

}
