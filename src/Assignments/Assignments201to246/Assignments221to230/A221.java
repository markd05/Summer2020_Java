package Assignments.Assignments201to246.Assignments221to230;
import java.util.*;
/*
You are creating a Stock class.
1. InstanceVariables
tickerSymbol (String)
companyName (String)
price (int)
percentChange (double)
totalShares(int)
marketCap(long)

2. Constructor
Constructor must initialize:
tickerSymbol (and convert the string to uppercase)
companyName
price
totalShares

Methods:
marketCap is calculated by multiplying totalShares by price

public void adjustPrice(int value)
This method will change the price by value (value can be positive or negative).
It should also recalculate percentChange and marketCap.  percentChange represents the percentage changed

public String toString()
This method should return a SINGLE String (using \n) that represents something like the following:
Ticker Symbol: GOOG
Company: Google, Inc.
Current Price: $802 (+7.2%)
Market Cap: $538000000000

NOTE: Must create 2 class files for this assignment
class Main {
public static void main(String[] args) {
//Test code here
}
}
import java.util.*;
public class Stock{
 // DO NOT CHANGE THE METHOD BELOW
  public void adjustPrice(int value){
	int temp=price;
	price=price+(value);
	percentChange=((double)(price-temp))/temp;
	marketCap=totalShares*price;
  }
  //Write your code below

}
 */
class Main {
    public static void main(String[] args) {
        //Test code here
        A221 obj = new A221("Goog", "Google, Inc.", 802, 10);
        obj.marketCap();
        System.out.println(obj.toString());
    }
}
public class A221 {
    // DO NOT CHANGE THE METHOD BELOW
    public void adjustPrice(int value){
        int temp=price;
        price=price+(value);
        percentChange=((double)(price-temp))/temp;
        marketCap=totalShares*price;
    }
    //Write your code below
    String tickerSymbol;
    String companyName;
    int price;
    double percentChange;
    int totalShares;
    long marketCap;

    public A221(String tickerSymbol, String companyName, int price, int totalShares) {
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
    }

    public void marketCap() {
        marketCap = totalShares*price;
    }

    public String toString() {
        return "Ticker Symbol: "+tickerSymbol+"\nCompany: "+
                companyName+"\nCurrent Price: $"+price+"\nMarket Cap: $"+marketCap;
    }

}
