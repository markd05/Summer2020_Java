package Days41to50.Day50_Abstraction;

public class Dog extends Animal {

    public Dog(char Gender, byte Age, String color, String Nickname) {
        super(Gender, Age, color, Nickname);
    }

    @Override
    public void Speak(String language) {
        System.out.println(Nickname + " is speaking " + language);
    }

    @Override
    public void Eat(String food) {
        System.out.println(Nickname + " is eating " + food);
    }

    @Override
    public void Sleep(int hour) {
        System.out.println(Nickname + " sleeps " + hour + " hours");
    }

    @Override
    public void Drink(String drink) {
        System.out.println(Nickname + " drinks " + drink);
    }
}
