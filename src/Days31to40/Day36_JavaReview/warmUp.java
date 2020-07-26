package Days31to40.Day36_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;

public class warmUp {
    /*
        1. write a return method that can remove the duplicated objects from an Integer arrayList

        2. write a return method that can remove the duplicated objects from a String arrayList

        3. write a return method that can remove the duplicated objects from a Character arrayList

        4. write a return method that can remove the duplicated objects from a Double arrayList
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3));
        list = removeDup(list);
        System.out.println(list);

        String[] names = {"Sherinay", "Denis", "Nurzat", "Seyfo", "Seyfo", "Seyfo", "Mehmet"};
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(names));
        list2 = removeDup2(list2);
        System.out.println(list2);
    }

    //task01:
    public static ArrayList<Integer> removeDup(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer each : list) {
            if (!result.contains(each)) {
                result.add(each);
            }
        }
        return result;
    }

    //Task02:
    public static ArrayList<String> removeDup2(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for (String each : list) {
            if (!result.contains(each)) {
                result.add(each);
            }
        }
        return result;
    }

}
