package Days11to20.Day12_SwitchStatement;

public class warmUp {
    /*
        declare 3 numbers
        if n1 and n2 are equal => n1$n2 are equal
        if n2 and n3 are equal => n2&n3 are equal
        if n3 and n1 are equal => n3&n1 are equal
        if all equal => all equal
        if none are equal => none of them are equal
        Do NOT use single if statement
     */
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        if (n1 == n2 && n1 != n3) {
            System.out.println("n1 and n2 equal");
        } else if (n2 == n3 && n2 != n1) {
            System.out.println("n2 and n3 equal");
        } else if (n3 == n1 && n1 != n2) {
            System.out.println("n3 and n1 equal");
        } else if (n1 == n2 && n1 == n3) {
            System.out.println("all equal");
        }
        else {
            System.out.println("none equal");
        }
    }

}
