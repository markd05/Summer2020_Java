package Days41to50.Day49_Recap;

public class Circle extends Shape{

    double radius;
    double diameter;
    final double Pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius*2;
    }

    @Override
    protected void Area() {
        double Area = radius * radius * Pi;
        System.out.println("Area of the circle is " + Area);
    }

    @Override
    protected void perimeter() {
        double perimeter = Pi*diameter;
        System.out.println("perimeter of the circle is " + perimeter);
    }

}
