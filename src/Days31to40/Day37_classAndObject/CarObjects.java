package Days31to40.Day37_classAndObject;

public class CarObjects {

    public static void main(String[] args) {

        Car      car1   =    new     Car();
    //className objName   keyword  constructor

        car1.brand = "BMW";
        car1.color = "white";
        car1.mileage = 100000;
        car1.model = "X6";
        car1.price = 15000.5;
        car1.year = 2000;

        System.out.println(car1.brand); //BMW
        System.out.println(car1.color); //white
        System.out.println(car1.mileage); //100000
        System.out.println(car1.model);
        System.out.println(car1.price);
        System.out.println(car1.year);

        System.out.println("==============================");
        Car car2 = new Car();

        System.out.println(car2.brand); //null

        car2.brand = "Toyota";
        car2.model = "Corolla";
        car2.color = "Black";
        car2.mileage = 150000;
        car2.year = 2002;
        car2.price = 2000;

        System.out.println(car2.brand); //Toyota
        System.out.println(car2.model); //Corolla
        System.out.println(car2.year); //2002
        System.out.println(car2.mileage); //150000
        System.out.println(car2.color); //Black
        System.out.println(car2.price); //2000

        car1.drive(); //Driving BMW
        car2.drive(); //Driving Toyota

        car1.start();

        car2.getInfo();

        Car car3 = new Car();
        car3.getInfo(); //default values
        car3.brand = "Lexus";
        car3.model = "RX350";
        car3.year = 2020;
        car3.mileage = 25000;
        car3.color = "Purple";
        car3.price = 40000;

        car3.getInfo();
    }

}
