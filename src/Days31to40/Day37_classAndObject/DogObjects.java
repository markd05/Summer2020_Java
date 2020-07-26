package Days31to40.Day37_classAndObject;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        System.out.println(dog1.name); //null

        dog1.breed = "Husky";
        dog1.size = "small";
        dog1.color = "gray and white";
        dog1.name = "Holly";
        dog1.gender = 'F';
        dog1.age = 25;
        dog1.food = "Chicken";

        System.out.println(dog1.breed); //Husky

        dog1.getInfo();

        Dog dog2 = new Dog();
        dog2.breed = "Husky";
        dog2.name = "Lyka";
        dog2.color = "gray";
        dog2.age = 3;
        dog2.size = "large";
        dog2.gender = 'M';
        dog2.food = "Sushi";

        dog2.getInfo();

        dog2.eat();

        dog1.eat();

        dog1.play();
        dog2.play();

        //String str = new String("Hello");
        //str.toLowerCase();

    }

}
