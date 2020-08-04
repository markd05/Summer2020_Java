package Days41to50.Day49_Recap;

public class Square extends Shape{

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    protected void Area() {
        double Area = side*side;
        System.out.println("Area of the square is " + Area);
    }

    @Override
    protected void perimeter() {
        double perimeter = side*4;
        System.out.println("perimeter of the square is " + perimeter);
    }

}
