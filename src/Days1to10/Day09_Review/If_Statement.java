package Days1to10.Day09_Review;

public class If_Statement {
    /*
        if statements:

            single if statement:
                if(boolean expression){
                    //code
                }
                if block only gets executed if the condition is true
     */
    public static void main(String[] args) {

        if (9 < 10){
            System.out.println("Hello");
            System.out.println("Happy Friday");
            System.out.println("Tomorrow is day off");
            System.out.println("class starts on Monday");
        }

        int a = 1000;

        if (a++ == 1001){
            a = 2000;
            System.out.println("a is increased");
        }

        System.out.println(a);

        int X = 987654320;

        if (X % 2 == 0){
            System.out.println(X);
            System.out.println("it's an even number");
        }

        if (X % 2 != 0){
            System.out.println(X);
            System.out.println("It's an odd number");
        }

        int Y = 2345678;

        if (Y % 5 == 0){
            System.out.println(Y + " can be divided by 5");
        }

        if (Y % 5 != 0){
            System.out.println(Y + " can't be divided by 5");
        }

        String CEO = "Main Boss";
        String Kuzzat = "Main Boss";

        System.out.println(CEO == Kuzzat); //true

        if (Kuzzat == CEO){
            System.out.println("Great person in the world");
            System.out.println("First if block");
        }

        if (Kuzzat != CEO){
            System.out.println("Great person in the world");
            System.out.println("Second if block");
        }

        double TotalNumber = 100;
        boolean Cybertek = true;
        boolean BestSchool = true;

        if (Cybertek == BestSchool){
            TotalNumber += 500;
        }
        if (Cybertek != BestSchool){
            TotalNumber -= 50;
        }
        System.out.println(TotalNumber);

        byte PersonAge = 78;
        byte voteAge = 18;

        if (PersonAge >= voteAge) {
            System.out.println("Yes you are eligible to vote");
            System.out.println("have fun building the wall");
            System.out.println("MAGA");
        }
        if (PersonAge < voteAge) {
            System.out.println("You are not eligible to vote yet, please grow up");
        }

    }

}
