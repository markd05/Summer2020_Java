package Days41to50.Day49_Recap;

abstract class shape {

    public abstract void Area();

}

abstract class T extends shape {
    //public abstract void Area() //inherited
}

//concrete
class triangle extends shape {
    @Override
    public void Area() {
        System.out.println("Area of the triangle is ...");
    }
}

public class Practice {

}
