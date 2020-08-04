package Assignments.Assignments201to246;

public class A202 {
    /*
    The class Atts holds a few attributes and has a method called asString.
the attributes are name and color -both are strings and amount which is an int.
their visibility is public.
asString returns a string showing all the Atts in a format.
for example:
Atts a = new Atts();
a.name = "table";
a.color = "brown";
a.amount = 1;

System.out.println(a.asString());
prints:
name: table color: brown amount: 1
create the required attributes and method inside the atts class

NOTE: Must create 2 class files for this assignment
class Main {
  public static void main(String[] args) {
   Atts a = new Atts();
   a.name = "ball";
   a.color = "red";
   a.amount = 1;
	System.out.println(a.asString());
  }
}
class Atts {
  //Write code here, remember to test
}
     */
    public static void main(String[] args) {
        Atts a = new Atts();
        a.name = "ball";
        a.color = "red";
        a.amount = 1;
        System.out.println(a.asString(a.name, a.color, a.amount));
    }
}
class Atts {
    //Write code here, remember to test
    public String name;
    public String color;
    public int amount;
    public String asString(String name, String color, int amount) {
        return ("name: " + name + " color: " + color + " amount: " + amount);
    }
}
