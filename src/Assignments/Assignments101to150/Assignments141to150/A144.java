package Assignments.Assignments101to150.Assignments141to150;

public class A144 {
    /*
    max function gets two ints, x and y.
x is the test case, y is what we test against.

if  x is bigger then y return y
in any other case return x.

for example:
max(1,10)
returns 1
max(11,5)
returns 5

class Main {
  public static int max(int x,int  y){
         //write your code here

  }//end your code here
  public static void main(String[] args) {
	int result = max(1,10);
	System.out.println(result);
  }
}
     */
    public static int max(int x,int  y){
        //write your code here
        if (x > y) {
            return y;
        } else {
            return x;
        }

    }//end your code here
    public static void main(String[] args) {
        int result = max(1,10);
        System.out.println(result);
    }
}
