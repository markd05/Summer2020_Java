package Days31to40.Day33_ArrayList;

import java.util.ArrayList;

public class ArrayListMethodsPractice {
    public static void main(String[] args) {
        //set:
        ArrayList<String> Javengers = new ArrayList<>();
        Javengers.add("Jena"); //0
        Javengers.add("Mary"); //1
        Javengers.add("Tarah"); //2
        Javengers.add("Mahriban"); //3

        Javengers.set(1, "Seyfo"); //[Jena, Seyfo, Tarah, Mahriban]

        Javengers.remove(0);
        Javengers.add(0, "Pilot Nijat Borhan");
        System.out.println(Javengers);

        //remove(int): removes the index
        //remove(Object): removes the first matching object
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.remove(3); //removes index 3 ==> [1, 2, 3, 5]
        System.out.println(numbers);

        //numbers.remove(Integer.parseInt("3")); //parse method removes primitives
        boolean result = numbers.remove(Integer.valueOf(3)); //valueOf method returns wrapper class
        System.out.println(numbers);
        System.out.println(result);
    }
}
