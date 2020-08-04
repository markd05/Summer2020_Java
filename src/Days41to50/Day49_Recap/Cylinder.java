package Days41to50.Day49_Recap;

public class Cylinder extends Shape{

    double radius;
    double height;
    final double Pi = 3.14;
    double diameter;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        diameter = radius*2;

    }

    @Override
    protected void Area() {
        double Area = (Pi*diameter*radius) + (height*Pi*diameter);
        System.out.println("Area of the cylinder is " + Area);
    }

    @Override
    protected void perimeter() {
        double perimeter = 2*(Pi*diameter+height);
        System.out.println("perimeter of the cylinder is " + perimeter);
    }

    @Override
    protected void capacity() {
        double capacity = (Pi*diameter*height);
        System.out.println("capacity of the cylinder is " + capacity);
    }

}
