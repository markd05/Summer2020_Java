package Assignments.Assignments101to150.Assignments141to150;

public class A145 {
    /*
    isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.
for example:
isEven(1) --> false
isEven(8) --> true

class Main {
  public static boolean isEven(int n){
          //write your code here

  } //end your code here
  public static void main(String[] args) {
	System.out.println(isEven(2));
  }
}
     */
    public static boolean isEven(int n){
        //write your code here
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }

    } //end your code here
    public static void main(String[] args) {
        System.out.println(isEven(2));
    }
}
