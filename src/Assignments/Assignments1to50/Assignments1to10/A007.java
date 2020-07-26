package Assignments.Assignments1to50.Assignments1to10;

/*
Write Java statements to print the following square into console: 	=====>

public class Main {
  public static void main(String[] args) {
	//write Your code here

  }
}
********
*      *
*      *
*      *
*      *
*      *
*      *
********
 */
public class A007 {

    public static void main(String[] args) {

        int i = 1;
        for(i = 1; i < 9; i++){
            if (i > 1 && i < 8){
                System.out.println("*      *");
            }
            else {
                System.out.println("********");
            }
        }

    }
}
