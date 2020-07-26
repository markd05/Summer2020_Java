package Days31to40.Day39_JavaReview;

public class CellPhone {
    /*
    create a custom class from CellPhones
        instance variables: brand, screenSize, color, price
        instance methods: call, message, takePhoto
     */

    String brand;
    double price;
    String color;
    double screenSize;
    String model;

    public CellPhone() { //set up default values for attributes of the class
        brand = "iPhone";
        model = "10";
        screenSize = 5.8;
        color = "White";
        price = 700;
    }

    public CellPhone(String brand, double price, String color, double screenSize, String model) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.screenSize = screenSize;
        this.model = model;
    }

    public void call(long phoneNumber) {
        System.out.println(brand + " " + model + " is calling " + phoneNumber);
    }

    public void sendMessage(long phoneNumber) {
        System.out.println("Sending messages to " + phoneNumber);
    }

    public void getInfo() {
        System.out.println(brand+" "+model+" "+color+" "+screenSize+" $"+price);
    }

}
