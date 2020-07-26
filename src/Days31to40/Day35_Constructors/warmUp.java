package Days31to40.Day35_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class warmUp {
    /*
        1. write a return methods that accepts an int array and returns it as an ArrayList

        2. write a return method that accepts an Integer array and returns the maximum number
            Do not use sort method

        3. write a return methods that accepts an Integer arrayList and returns the second maximum number
            Do not use sort method

        4. write a return method that accepts an Integer array and returns the minimum number
            Do not use sort method

        5. write a return method that accepts an Integer arrayList and returns the second minimum number
     */
    public static void main(String[] args) {
        //Task01
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> list = arrayToArrayList(arr);
        System.out.println(list);

        //Task02
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        int max = maxNum(list2);
        System.out.println(max);

        //Task03
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(10,20,35,30));
        int secondMaximum = secondMax(list3);
        System.out.println(secondMaximum);

        //Task04
        int[] Numbers = {1,2,3,4,5,6,7,8};
        ArrayList<Integer> list5 = arrayToArrayList(Numbers);
        int minimum = minNum(list5);
        System.out.println(minimum);

        //Task05
        int[] numbers2 = {100, 9, 8, 700, 18, 9, 0};
        ArrayList<Integer> list6 = arrayToArrayList(numbers2);

        int secondMinimum = secondMin(list6);
        System.out.println(secondMinimum);
    }

    //Task01
    public static ArrayList<Integer> arrayToArrayList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : arr) {
            list.add(each);
        }

        return list;
    }

    //Task02
    public static int maxNum(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int each : list) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    //Task03
    public static int secondMax(ArrayList<Integer> list) {
        Integer max = maxNum(list);
        list.remove(max);

        int secondMax = maxNum(list);
        return secondMax;
    }

    //Task04
    public static int minNum(ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;

        for (int each : list) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    //Task05
    public static int secondMin(ArrayList<Integer> list) {
        Integer min = minNum(list);
        list.remove(min);

        int secondMin = minNum(list);
        return secondMin;
    }
}
