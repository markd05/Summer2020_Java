package Days41to50.Day50_Abstraction;

public class Zoo {

    public static void main(String[] args) {
        Cat Cleo = new Cat('F', (byte)5, "White & Black", "Cleo");
        System.out.println("Name is: " + Cleo.Nickname);
        System.out.println("Gender is: " + Cleo.Gender);
        System.out.println("Color is: " + Cleo.color);
        System.out.println("Age is: " + Cleo.Age);

        System.out.println("=====================================");
        Cleo.getInfo();

        Cat Misha = new Cat('F', (byte)6, "White & Gray", "Misha");
        Misha.getInfo();
        Misha.Sleep(15);
        Misha.Eat("chicken");
        Misha.Drink("milk");
        Misha.Speak("meow");
        System.out.println("=====================================");

        Dog pongo = new Dog('M', (byte)8, "golden", "pongo");
        pongo.getInfo();
        pongo.Speak("Ukrainian");
        pongo.Eat("Fish");
        pongo.Drink("Vodka");
        pongo.Sleep(7);
        System.out.println("======================================");

        Dog Tuzik = new Dog('M', (byte)12, "Black", "Tuzki");
        Tuzik.getInfo();
        Tuzik.Drink("redbull");
        Tuzik.Eat("Hot dog");
        Tuzik.Sleep(10);
        Tuzik.Speak("Kyrgyz woof");
        System.out.println("======================================");

        Dog[] dogs = {pongo, Tuzik};
        Cat[] cats = {Cleo, Misha};

        dogs[1].getInfo();

    }

}
