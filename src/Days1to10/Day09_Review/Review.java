package Days1to10.Day09_Review;

public class Review {
    /*
        relational operators:
            >  : greater: x=10, Y=9: only returns true when x > y
            >= : greater or equal: true: either greater or equal
            <  : less than: x=10, y=9: ony return when y < x
            <= : less than or equal: true: either less or equal
            == : equal: x=10, y=10: true: x==y
            != : not equal: x=9, Y=10: true: x!=y

        logical operators:
            && : and: true: both conditions are true
            || : or: true: as long as one condition is true
     */
    public static void main(String[] args) {

        System.out.println('Z' > 'A'); //true
        System.out.println('Z' >= 'A'); //true
        System.out.println('a' >= 'A'); //true
        System.out.println('a' < 'A'); //false

        char ch1 = 123;
        System.out.println(ch1);

        System.out.println('A' <= 'A'); //true
        System.out.println('A' <= 'a'); //true

        System.out.println(false == false); //true
        System.out.println(false != true); //true

        byte X = 10; int Y = 10;
        System.out.println(X == Y); //true

        System.out.println(true == true && false != true); //true && true = true
        System.out.println("Monday" == "Funday" || true == !false); //false || true = true
    }

}
