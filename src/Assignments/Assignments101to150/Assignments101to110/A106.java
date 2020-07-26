package Assignments.Assignments101to150.Assignments101to110;

public class A106 {
    /*
    Write a  for loop that prints the odd integers 11 through 121 inclusive, separated by spaces.

class Main {
  public static void main(String[] args) {
	//WRITE YOUR CODE HERE

  }
}
     */
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        for (int i = 11; i <= 121; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
