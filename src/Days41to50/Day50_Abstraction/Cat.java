package Days41to50.Day50_Abstraction;

public class Cat extends Animal {

    public Cat(char Gender, byte Age, String color, String Nickname) {
        super(Gender, Age, color, Nickname);
    }

    @Override
    public void Speak(String language) {
        System.out.println(Nickname + " speak " + language + " language");
    }

    @Override
    public void Eat(String food) {
        System.out.println(Nickname + " eat " + food);
    }

    @Override
    public void Sleep(int hour) {
        System.out.println(Nickname + " sleep " + hour + " hours");
    }

    @Override
    public void Drink(String drink) {
        System.out.println(Nickname + " drink " + drink);
    }
}
