package Assignments.Assignments151to200.Assignments181to190;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class A186 {
    /*
    combine two String arrays into one arraylist and return it as a string.
for example:
combineRs(["f","o","o"],[" b","a","r"])
returns "foo bar"
combineRs(["1","2","3"],[" 4"])
returns "1234"

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Main {
  public static String combineRs(String[] r1,String[] r2) {
	//Write code here, remember to test
  }
}
     */
    public static void main(String[] args) {
        String[] r1 = {"f", "o", "o"};
        String[] r2 = {" b", "a", "r"};
        System.out.println(combineRs(r1,r2));
    }

    public static String combineRs(String[] r1,String[] r2) {
        //Write code here, remember to test
        int length = r1.length + r2.length;
        String str = "";
        for (int i = 0; i < r1.length; i++) {
            str += r1[i];
        }
        for (int i = 0; i < r2.length; i++) {
            str += r2[i];
        }
        return str;
    }
}
