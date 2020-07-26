package Days31to40.Day36_JavaReview;

public class ConstructorsReview {

    public ConstructorsReview() {
        System.out.println("default constructor");
    }

    public ConstructorsReview(int a) {
        System.out.println("Constructor with argument of: " + a);
    }

    public static void main(String[] args) {

        ConstructorsReview obj = new ConstructorsReview();

        //ConstructorsReview obj2 = new ConstructorsReview("Batch 12");
                //the constructor with arg of String does not exist

        ConstructorsReview obj2 = new ConstructorsReview(10);

    }
}
