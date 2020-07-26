package Days21to30.Day28_JavaRecap;
import java.util.Arrays;
public class warmUp {
    /*
        1. Write a method that can convert km to miles
            1 km = 0.612 miles

        2. write a method that can convert gallons to liters
            1 G = 3.75 L

        3. write a method that can print out the array in Descending order
     */
    public static void main(String[] args) {
        KmToMiles(1000);

        GallonToLiter(85.5);

        int[] arr = {0, -1, 1000, 2000, 5000};
        SortDes(arr);
    }

    public static void KmToMiles(double KM) {
        double Miles = KM * 0.612;
        System.out.println(KM + " km equals to " + Miles + " miles");
    }

    public static void GallonToLiter(double gallons) {
        double Liters = gallons * 3.75;
        System.out.println(gallons + " gallons equal to " + Liters + " liters");
    }

    public static void SortDes(int[] array) {
        //array = {10,8,99,0,-1};
        Arrays.sort(array); //array = {-1,0,8,10,99}
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
