package Days31to40.Day37_classAndObject;

import java.time.Year;

public class Car {
    /*
    car
    data/attribute:
        model, year, brand, color, price, mileage, VIN...

    actions:
        start, drive, accelerate, stop, drift, brake, get ticket...
     */

    String model;
    int year;
    String color;
    double price;
    long mileage;
    String brand;

    public void drive() {
        System.out.println("Driving " + brand);
    }

    public void start() {
        System.out.println(brand + " is started");
    }

    //2020 Toyota Corolla, white, 1000$
    public void getInfo() {
        System.out.println(year + " " + brand + " " + model + ", " + color + ", " + mileage + " miles, $" + price);
    }

}
