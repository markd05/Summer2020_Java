package Days21to30.Day30_WrapperClass_ArrayList;

import java.util.ArrayList;

public class ArrayListClass {
    /*
        Declaration of ArrayList:
            ArrayList<ClassType> variableName = new ArrayList<>();
            ArrayList<ClassType> variableName = new ArrayList<ClassType>();
     */
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4};

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(10); //auto-boxing
        list2.add(20);
        list2.add(30);
            //[10, 20, 30]
        //index:0   1   2

        System.out.println(list2);

        System.out.println(list2.get(1));
        //System.out.println(list2.get(9)); //maximum index number is 2

        System.out.println(list2.size()); //3

        list2.clear();
        System.out.println(list2);
        System.out.println(list2.size()); //0
    }

}
