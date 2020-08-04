package Days41to50.Day46_SuperKeyword;

class parent {
    public parent(int a) { // C A
        this("A"); //C
        System.out.println("A"); //A
    }

    public parent(String b) {
        System.out.println("C");
    }
}

public class Practice extends parent {
            //sub              super

    public Practice() { //C A
        super(10);
    }

    public Practice(int a) {
        super("A");
    }

    public static void main(String[] args) {
        Practice obj = new Practice();
    }

}
