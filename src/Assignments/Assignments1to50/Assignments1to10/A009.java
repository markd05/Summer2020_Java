package Assignments.Assignments1to50.Assignments1to10;
/*
Write Java statements to print the following Empire State building shape into console: 	=====>
Notes:
You need to put "\\" to be able to print "\"
There are 2 spaces between pipes
Last line is dashes (-)

class Main {
  public static void main(String[] args) {
	//Type your code here

  }
}
   ^
  /|\
 / | \
/  |  \
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
-------
 */
public class A009 {
    public static void main(String[] args) {

        System.out.println("   ^   ");
        System.out.println("  /|\\  ");
        System.out.println(" / | \\ ");
        System.out.println("/  |  \\");
        for (int i = 1; i < 13; i++){
            System.out.println("|  |  |");
        }
        System.out.println("-------");
    }
}
