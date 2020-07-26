package Days1to10.Day08_ShortHandOperators;

public class warmup {
    /*
        write a java program that converts gallons to liters
        1 gallon = 3.785 liters

        write a java program that converts liters to gallons
     */

    public static void main(String[] args) {
        int gallon = 100;
        double liters = gallon * 3.785;
        System.out.println(gallon + " gallons is equal to " + liters + " liters");

        int liter = 1;
        double gallons = liter/3.785;
        System.out.println(liter + " liters is equal to " + gallons + " gallons");

        int x = 2;
        int y = x++; //post, y = 2, x = 3
        System.out.println(y + "" + x);

        int x2 = 2;
        System.out.println(x2++); //2
        System.out.println(x2); //3

        int x3 = 2;
        System.out.println(--x3); //2-1=1

        int x4 = 8;
        int y4 = x4--; //post, 8
        System.out.println(y4); //8
        System.out.println(x4); //7
        System.out.println(y4); //8

    }
}
