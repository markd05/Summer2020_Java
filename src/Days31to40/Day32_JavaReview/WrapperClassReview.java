package Days31to40.Day32_JavaReview;

public class WrapperClassReview {
    /*
         primitives                      Wrapper Class: java.lang
            byte       Auto-Boxing           Byte
            short     =============>         Short
            int                              Integer
            long                             Long
            float        un-boxing           Float
            double    <=============         Double
            boolean                          Boolean
            char                             Character

            Wrapper class va primitives:
                1. default values:
                    primitives: byte, short, int, long ==> 0
                                float, double ==> 0.0
                                boolean ==> false
                                char ==> space

                    ALL wrapper class: null

                2. wrapper class only accepts it's own primitive values

                3. wrapper classes have method, primitives don't

                4. wrapper class takes object, primitives take values

            methods: Max_values, Min_values, parse methods, valueOf methods

                    max_value: returns the maximum value of the data-type
                    min_value: returns the minimum value of the data-type
                    parse methods: converts String to primitives
                    valueOf methods: converts String to wrapper class

            Auto-boxing: converts primitive values to wrapper class
            unboxing: converts wrapper class value to primitive values
     */
    public static void main(String[] args) {
        int a = 10;
        Integer b = 10; //Integer only accepts int primitive values
        byte c = 20;
        //Integer b2 = c; //Integer only accepts int primitive values

        long L = b; //Integer is withing the range of long

        boolean result = 9 > 0+1;
        Boolean result2 = result; //auto-boxing

        boolean result3 = result2; //unboxing

        Boolean result4 = result2; //none

        boolean result5 = result3; //none

        /*
            methods:
                    max_value
                    min_value
                    parse methods
                    valueOf methods
         */

        int max = Integer.MAX_VALUE;
        //int max2 = Double.MAX_VALUE; //int != double
        System.out.println(max);
        System.out.println(max + 1);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE); //127

        int min = Byte.MIN_VALUE; //-128
        int min2 = Short.MIN_VALUE; //-32768
        System.out.println(min);
        System.out.println(min2);

        //parse methods:
        short s1 = Short.parseShort("1234");
        System.out.println(s1 + 1);

        double d1 = Double.parseDouble("78.5"); //none
        Double d2 = Double.parseDouble("78.5"); //auto-boxing

        boolean r1 = Boolean.parseBoolean("true"); //none
        System.out.println(r1 != false);

        //valueOf methods: returns wrapper class
        Integer num = Integer.valueOf("123"); //none
        System.out.println(num);

        int num2 = Integer.valueOf("123"); //un-boxing


    }

}
