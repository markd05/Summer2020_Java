package Assignments.Assignments151to200.Assignments151to160;

public class A152 {
    /*
    To book  a room first it needs to be available for rent and
    make sure its available at the date selected:
the room is already booked between 7/1/2018 - 7/8/2018 and not available
accepting bookings only for year of 2018

example:
simpleRoomBook(false,2,1,2018)
return false
simpleRoomBook(true,2,1,2018)
return true
simpleRoomBook(true,7,2,2018)
return false

class Main { // remember to test your code
  public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
   	// Write your code here


  }
}
     */
    public static void main(String[] args) {
        boolean a = simpleRoomBook(true, 3, 6, 2018);
        System.out.println(a);
    }

    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
        // Write your code here
        boolean a = true;
        if (isAvailable) {
            if (year == 2018) {
                if (month == 7) {
                    if (day >= 1 && day <= 8) {
                        a = false;
                    }
                }
            } else {
                a = false;
            }
        } else {
            a = false;
        }
        return a;
    }
}
