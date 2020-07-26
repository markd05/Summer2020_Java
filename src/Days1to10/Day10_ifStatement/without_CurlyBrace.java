package Days1to10.Day10_ifStatement;

public class without_CurlyBrace {
    /*
        single if statement:
            if (condition)
                //single line of statement only
     */
    public static void main(String[] args) {

        if (false)
            System.out.println("this if if");
        else
            System.out.println("this is else");

        if (true)
            System.out.println("if block");
        else if (true)
            System.out.println("else-if block");
        else
            System.out.println("else block");
        //else block is not mandatory

    }
}
