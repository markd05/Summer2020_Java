package Days41to50.Day49_Recap;

public abstract class Abstraction {

    public abstract void startTheCar();

}

class A extends Abstraction{

    //public abstract void startTheCar

    @Override
    public void startTheCar() {
        System.out.println("Break");
        System.out.println("Push the start button");
        System.out.println("Release the break");
    }

    public static void main(String[] args) {
        //Abstraction obj = new Abstraction();
    }
}

class Tesla extends Abstraction {
    //regular class MUST implement the abstract methods from the abstract class

    public void startTheCar() {
        System.out.println("voice control");
        System.out.println("driver");
    }

}
