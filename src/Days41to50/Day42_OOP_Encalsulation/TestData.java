package Days41to50.Day42_OOP_Encalsulation;

public class TestData {

    /*
    Name
    ID
     */

    private String Name = "Bekir"; //the data is not visible to any other classes
    private int ID = 897;

    //getter: ready the data
    public String getName() { //read the private data only
        return Name;
    }

    public int getID() {
        return ID;
    }

    //setter: to change the value
    public void setName(String str) {
        Name = str;
    }

    public void setID(int i) {
        ID = i;
    }

}
