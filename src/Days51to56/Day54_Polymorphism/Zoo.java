package Days51to56.Day54_Polymorphism;

class Animal {
    public void talk() {
        System.out.println("Animal is talking");
    }
}

class Tiger extends Animal {
    public void Hunt() {
        System.out.println("Tiger is hunting");
    }

    public void talk() {
        System.out.println("Tiger is talking ==> Roar");
    }
}

class Octopus extends Animal {
    public void swim() {
        System.out.println("Octopus is swimming");
    }

    public void talk() {
        System.out.println("Octopus is talking ==> gologolo");
    }
}

public class Zoo {

    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();
        Tiger[] Tigers = {tiger1, new Tiger()};

        Octopus octopus1 = new Octopus();
        Octopus[] octopus = {octopus1, new Octopus()};

        Animal              animal1     =       new Tiger();
        //reference type    reference name      object
        animal1.talk();
        //animal1.Hunt();
            //reference type decides what can be called
        //Hunt method does not exist in the reference type

        Animal animal2 = new Octopus();
        //animal2.swim();
            //animal class (referenceType) does not have swim()
        animal2.talk(); //Octopus is talking

    }

}
