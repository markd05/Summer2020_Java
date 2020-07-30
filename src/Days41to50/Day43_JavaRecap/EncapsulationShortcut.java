package Days41to50.Day43_JavaRecap;

public class EncapsulationShortcut {

    private int a = 10;
    private int b = 20;
    private  int c = 30;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    /*
    shortcut for getter and setter:
        1. declare private datas
        2. right click anywhere -> Generate -> Getter and Setter
        3. select the instance variables tou want to generate getter and setter for
        4. click ok
     */

}
