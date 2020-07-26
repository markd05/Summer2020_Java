package Assignments.Assignments101to150.Assignments141to150;

public class A146 {
    /*
    c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
it returns a string value that can be "profit","loss","no loss"

for example:
c_profits(100,1500)
returns : "profit"
c_profits(20,5)
returns : "loss"
c_profits(100,100)
returns : "no loss"

class Main {
  public static String c_profits (int buyPrice,int sellPrice){
	//your code here

  } //end your code here
  public static void main(String[] args) {
    System.out.println(c_profits(100,1500));
  }
}
     */
    public static String c_profits (int buyPrice,int sellPrice){
        //your code here
        if (buyPrice == sellPrice) {
            return "no loss";
        } else if (buyPrice > sellPrice) {
            return "loss";
        } else {
            return "profit";
        }

    } //end your code here
    public static void main(String[] args) {
        System.out.println(c_profits(100,1500));
    }
}
