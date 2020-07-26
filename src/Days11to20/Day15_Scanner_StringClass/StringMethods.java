package Days11to20.Day15_Scanner_StringClass;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cybertek";
        //index num:  01234567

        //charAt(index):
        System.out.println(str.charAt(7));
        char ch = str.charAt(4);
        System.out.println(ch);

        //length():
        String name = "Donald J Trump";
        int n = (name.length());

        //concat():
        String s1 = "Cybertek";
        s1.concat(" School"); //attempting to modify string s1
        System.out.println(s1); //String is immutable

        s1 = s1.concat(" School");
        System.out.println(s1);

        //toUpperCase():
        String N = "cybertek";
        N.toUpperCase();
        System.out.println(N); //cybertek, string is immutable

        N = N.toUpperCase();
        System.out.println(N); //CYBERTEK

        //toLowerCase:
        String name1 = "ABRAHAM";
        name1.toLowerCase();
        System.out.println(name1); //ABRAHAM, string is immutable

        name1 = name1.toLowerCase();
        System.out.println(name1);

    }

}
