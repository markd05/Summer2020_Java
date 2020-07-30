package Days41to50.Day41_initializerBlocks;

public class instanceBlock {

    {
        System.out.println("instance block");
    }

    {
        System.out.println("instance block2");
    }

    {
        System.out.println("instance block3");
    }

    public instanceBlock() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        instanceBlock obj = new instanceBlock(); //ins Cons
        instanceBlock obj2 = new instanceBlock(); //ins Cons
        //instanceBlock obj3 = new instanceBlock(); //ins Cons
    }

}
