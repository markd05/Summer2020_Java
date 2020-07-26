package Days31to40.Day34_Constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
    /*
        remaining methods:
            indexOf(), lastIndexOf()

            converting array to arrayList

            removeAll(), addAll();
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //autoboxing
        list.add(Integer.valueOf("33")); //none
        list.add(Integer.parseInt("100")); //autoboxing
        list.add(200);
        list.add(20);
        list.add(1);

        //indexOf(object): returns the index number of the given object from the arrayList
            //if it returns a negative number, it means that the given object does not exist
        int a = list.indexOf(11); //autoboxing
        System.out.println(a);

        int a2 = list.indexOf(200); //3
        System.out.println(a2);

        //lastIndexOf(object): returns the last occurred object's index number (last index number) as an int
        int a3 = list.indexOf(1);
        int a4 = list.lastIndexOf(1);
        System.out.println(a3);
        System.out.println(a4);

        //converting array to arrayList
        Integer[] arr = {1, 2, 3, 4, 5};

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));
        list2.add(100);

        System.out.println(list2);

        String[] arr2 = {"Java", "Python", "C#", "C++"};

        ArrayList<String> list3 = new ArrayList<>(Arrays.asList(arr2));

        //isEmpty: checks if the arrayList is empty and returns boolean expression
        System.out.println(list3.isEmpty());
        list3.add("F");

        System.out.println(list3);

        int[] arr3 = {1,2,3,4,5};
        //ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(arr3));
            //only object arrays can be converted

        //addAll(Interface):
        String[] allNames = {"Hakan", "Alexis", "Rawha", "Erhan", "Holy"};

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Almaz", "Ibrohim", "Tabi"));

        names.addAll(Arrays.asList(allNames));
        System.out.println(names);

        //removeAll(Interface):
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(1,1,1,1,2,2,2,2,3,3,3,4,4));

        numbers.removeAll(Arrays.asList(1,2));
        System.out.println(numbers);

        //removed() method not designed to be used with loop
        /*
        ArrayList<Integer> lis = new ArrayList<>();
        lis.addAll(Arrays.asList(1,1,1,2,2,3,3,4,2,1));

        for (int i = 0; i < lis.size(); i++) {
            if (lis.get(i) == 1) {
                lis.remove(i);
            }
        }
        System.out.println(lis);
        */

        //arrayList sorting:
        Integer[] array = {1000, 900, 80, 765, 123, 542};

        ArrayList<Integer> price = new ArrayList<>();
        price.addAll(Arrays.asList(array));

        System.out.println(price);

        Collections.sort(price); //sort the arrayList in ascending order
        System.out.println(price);

     }
}
