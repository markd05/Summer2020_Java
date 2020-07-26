package Days1to10.Day03_Variables;

public class EscapeSequences {
    /*
        \n: starts from a new line
        \t: horizontal tab
        \\: prints a backslash
        \': prints out a single quote
        \": prints ot a double quote
     */
    public static void main(String[] args) {
        System.out.println("Hello Cybertek\n Batch 12 students");

        System.out.print("Tomorrow is off \n");
        System.out.print("True\r");
        System.out.print("False\n");

        System.out.println("\tClass starts tomorrow");

        System.out.println("\\Mark");
        System.out.println("\'Java ");
        System.out.println("Book is called \"Game of Throne\"");
    }

}
