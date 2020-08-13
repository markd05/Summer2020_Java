package Assignments.LongAssignments;
/*
Write a class definition of a class named 'Value' with the following:
a constructor accepting a single integer parameter
a constructor with no parameters
a method 'setVal' that accepts a single parameter,
a boolean method, 'wasModified' that returns true if setVal was ever called for the object.
a method 'getVal' that returns an integer value as follows:
if setVal has ever been called, it getVal returns the last value passed to setVal.
Otherwise if the "single int parameter" constructor was used to create the object,
getVal returns the value passed to that  constructor. Otherwise getVal returns 0.

NOTE: Must create 2 class files for this assignment
class Main {
  public static void main(String[] args) {
	// Test code here
  }
}
public class Value {
   private int val = 0;
   private boolean wasModified = false;
	//WRITE YOUR CODE HERE

}
 */
class Main231 {
    public static void main(String[] args) {
        // Test code here
    }
}
public class Value {
    private int val = 0;
    private boolean wasModified = false;
    //WRITE YOUR CODE HERE

    public Value(int a) {

    }

    public Value() {

    }

    public void setVal(int val) {
        this.val = val;
    }

    public boolean wasModified() {
        return (val != 0);
    }

    /*
    public int getVal() {
        if (val != 0) {
            return val;
        }
    }
     */

}
