package Days31to40.Day39_JavaReview;

public class Constructors {

    public Constructors() { //Erhan
        //this("Hello"); constructor cannot contain itself
        System.out.println("Erhan");
    }

    public Constructors(int a) { //Erhan Ali
        this(); //Erhan
        System.out.println("Ali"); //Ali
    }

    public Constructors(double a) { //Erhan Ali Shawkrat
        this(10); //Erhan Ali
        System.out.println("Shawkrat");
        //this(10); //constructor call must be the first step
    }

    public Constructors(boolean a) { //Erhan Ali Shawkrat Dinara
        this(2.5); //Erhan Ali Shawkrat
        System.out.println("Dinara");
    }

    public Constructors(String a) {
        this(100);
        //this(true); //we can only call one constructor inside of a constructor
        System.out.println("Seyfo");
    }

    public Constructors(byte a) {
        this("Hello"); //Erhan Ali Seyfo
        System.out.println("Sabir");
    }

    public static void main(String[] args) {
        byte a = 100;
        Constructors obj = new Constructors(a);

    }

}
