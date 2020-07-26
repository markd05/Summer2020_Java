package Days11to20.Day17_StringClass;

public class StringMethods2 {

    public static void main(String[] args) {

        /*
            String.replace(old char, new char): replaces all the old char values with the given new char value
                                                in the String and returns it as a NEW String value
         */
        String str1 = "Java is Fun Programming Language";
        System.out.println(str1);
        str1 = str1.replace('a','e');
        System.out.println(str1);

        /*
            replace(old str, new str): replaces all the old str values with the given new str values in
                                       the String and returns it as a NEW String value
         */
        String str2 = "Today is gonna be a great day to learn java";
        System.out.println(str2);
        str2 = str2.replace("Today","Tomorrow");
        System.out.println(str2);
        str2 = str2.replace("java","");
        System.out.println(str2);

        /*
            String.replaceFirst(old str, new str): replaces the first occurred old str with the new str
                                                   and returns it as a NEW String value
         */
        String s1 = "Java is fun, Java is good";
        s1 = s1.replaceFirst("Java", "Python");
        System.out.println(s1);

        s1 = s1.replace('s','S');
        s1 = s1.replace('g','G');
        System.out.println(s1);

    }

}
