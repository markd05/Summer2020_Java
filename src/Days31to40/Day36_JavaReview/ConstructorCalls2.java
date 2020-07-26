package Days31to40.Day36_JavaReview;

public class ConstructorCalls2 {

    public ConstructorCalls2() {
        //this();   //constructor cannot call itself

        this(true);
    }

    public ConstructorCalls2(boolean a) {
        //this(true)

        //this();
    }

    public ConstructorCalls2(String name) {
        //this("hello");

        this('A');

        //ConstructorCalls2();  //constructor cannot be called by constructorName
    }

    public ConstructorCalls2(char ch) {
        //this("Hello");    //constructor cannot contain itself
    }

}
