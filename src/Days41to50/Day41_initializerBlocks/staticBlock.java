package Days41to50.Day41_initializerBlocks;

public class staticBlock {

    public staticBlock() {
        System.out.println("This is constructor");
    }

    public static void main(String[] args) {
        staticBlock obj1 = new staticBlock();
        staticBlock obj2 = new staticBlock();

        System.out.println("Main method");
    }

    static { //always runs first
        System.out.println("static block1");
        //System.out.println("static block B");
    }

    static {
        System.out.println("static block2");
    }

}
