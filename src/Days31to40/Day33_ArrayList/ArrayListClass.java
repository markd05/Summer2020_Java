package Days31to40.Day33_ArrayList;

import java.util.ArrayList;

public class ArrayListClass {
    /*
        ArrayList:  presented in java.util package
                    does not support primitives, we can only store objects
                    ArrayList's size is dynamic
                    ArrayList is an ordered collection of values(index number)
                    we can add or remove objects from arrayList

        declaration of ArrayList:
            ArrayList<NonPrimitive> variableName = new ArrayList<NonPrimitive>();
            ArrayList<NonPrimitive> variableName = new ArrayList<>();   (preferred)

        declaration of array:
            int[] arr = new int[5];

        ArrayList vs. Array;
            ArrayList's size is dynamic, Array's size is fixed
            ArrayList only supports non-primitives, Array supports all
            Array can be multi-dimensional but ArrayList can't be multi-dimensional

        methods of ArrayList:
            add(object): adds objects to arrayList
            get(index): gets the data from the arrayList
            size(): returns the length of the arrayList as an int
            clear(): removes everything from the arrayList
            set(index number, object): the given object will replace the object at the given index number
            contains(Object): checks if the given object is contained in the ArrayList or not, returns boolean value
            equals(ArrayList): checks if the two arrays contain the same objects or not, returns boolean value
            remove(int): removes the given index
     */

    public static void main(String[] args) {
        //declaration of ArrayList:
        ArrayList<String>  list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>();

        //add():
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("apple"); //index: 0, size: 1
        shoppingList.add("orange"); //index: 1, size: 2
        shoppingList.add("grape"); //index: 2, size: 3
        System.out.println(shoppingList);


        //add(index, object):
        //shoppingList.add("Strawberry")
        shoppingList.add(1, "Strawberry");
        System.out.println(shoppingList);

        //shoppingList.add(5, "Toyota Corolla"); //ArrayList does not skip indexes
        System.out.println(shoppingList);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0, 5); //[5]
        numbers.add(1, 10); //[5, 10]
        numbers.add(2, 15); //[5, 10, 15]
        numbers.add(1, 1); //5, 1, 10, 15]

        System.out.println(numbers);

        //get()
        ArrayList<String> names = new ArrayList<>();
        names.add("Hoymayra");
        names.add("Meri");
        names.add(1, "Mikrigul");
        names.add(1, "Tabriz");
        names.add(0, "Asiya");

        String str = names.get(1);
        System.out.println(str);

        //size(): returns the length of the arrayList as an Int value
        int length = names.size();
        System.out.println(length);

        for (int i = 0; i < names.size(); i++) {
            String each = names.get(i);
            System.out.println(each);
        }

        for (String each : names) {
            System.out.print(each + " ");
        }
        System.out.println();

        //clear():
        ArrayList<String> students = new ArrayList<>();
        students.add("Holly");
        students.add("Erhan");
        students.add("Nadira");
        students.add("Seyfo");
        students.add("Cihan");
        System.out.println(students);
        System.out.println(students.size()); //5
        students.clear();
        System.out.println(students);
        System.out.println(students.size()); //0

        //set(indexNumber, object): the given object will replace the object at the given index
        ArrayList<String> Javengers = new ArrayList<>();
        Javengers.add("Ferhat");
        Javengers.add("Lexi"); //"Shawkrat
        Javengers.add("Asiya");
        Javengers.add("Ozgen");
        Javengers.add("Alex");
        Javengers.add("Safwan"); //[Ferhat, Lexi, Asiya, Ozgen, Alex, Safwan]
        System.out.println(Javengers);

        Javengers.set(1, "Shawkrat"); //[Ferhat, Lexi, Shawkrat, Ozgen, Alex, Safwan]

        System.out.println(Javengers);

        //contains(): checks if the given object is contained in the ArrayList or not, and return boolean value
        ArrayList<String> goodGuys = new ArrayList<>();
        goodGuys.add("Hakan");
        goodGuys.add("Ihsan");
        goodGuys.add("Tim");
        goodGuys.add("Ibrohim");
        goodGuys.add("Dilyar");

        boolean result = goodGuys.contains("Tim");
        System.out.println(result);

        //equals(ArrayList): checks if the two arrayList are equal or not, returns a boolean value
        ArrayList<String> badGuys = new ArrayList<>();
        badGuys.add("Hakan");
        badGuys.add("Ihsan");
        badGuys.add("Tim");
        badGuys.add("Ibrohim");
        badGuys.add("Dilyar");

        boolean result2 = badGuys.equals(goodGuys); //false

        if (goodGuys.contains("Ibrohim")) {
            System.out.println("Ibrohim is good guy");
        }

        //remove(int): removes the index number
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(1); //autoboxing  index: 0
        lists.add(2); //autoboxing  index: 1
        lists.add(3); //autoboxing  index: 2
        lists.add(4); //autoboxing  index: 3
        lists.add(5); //autoboxing  index: 4

        lists.remove(1); //[1, 3, 4, 5]
        lists.remove(2); //[1, 3, 5]
        System.out.println(lists);
        System.out.println(lists.size());

        //remove(Integer): removes the first matching object, at the same time, returns boolean value
        ArrayList<Integer> lists2 = new ArrayList<>();
        lists2.add(1); //autoboxing  index: 0
        lists2.add(2); //autoboxing  index: 1
        lists2.add(3); //autoboxing  index: 2
        lists2.add(4); //autoboxing  index: 3
        lists2.add(5); //autoboxing  index: 4

        //[1, 2, 3, 4, 5]
        Integer a = 1;
        boolean r1 = lists2.remove(a); //[2, 3, 4, 5]
        System.out.println(lists2);
        System.out.println(r1);

        ArrayList<String> city = new ArrayList<>();
        city.add("Miami");
        city.add("Miami");
        city.add("Gotham");
        city.add("Azarbaijan");
        city.add("Istanbul");
        city.add("Urumqi");

        city.remove("Miami"); //[Miami, Gotham, Azarbaijan, Istanbul, Urumqi]

        if (city.remove("Miami")) { //["Miami", "Gotham", "Azarbaijan", "Istanbul", "Urumqi"]
            city.remove(2); //[Miami, Gotham, Istanbul, Urumqi]
        }

        city.add(3, "Azarbaijan"); //[Miami, Gotham, Azarbaijan, Istanbul, Urumqi]
        System.out.println(city);

        ArrayList<Integer> price = new ArrayList<>();
        price.add(1);
        price.add(2);
        price.add(3);
        price.add(4);
        price.add(5);

        price.remove(Integer.parseInt("2")); //parse method returns primitive
        System.out.println(price);

        boolean r3 = price.remove(Integer.valueOf("3")); //valueOf method returns wrapper class
        System.out.println(price);
        System.out.println(r3);

    }
}
