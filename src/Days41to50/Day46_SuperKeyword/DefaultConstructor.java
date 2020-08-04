package Days41to50.Day46_SuperKeyword;

class B {

    public B(int a) {
        System.out.println("super");
    }

}

public class DefaultConstructor extends B {
    //              sub               super

    public DefaultConstructor() {
        super(10); //super
        System.out.println("Sub"); //Sub

    }

    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
    }

}
