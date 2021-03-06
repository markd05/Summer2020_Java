package Days41to50.Day42_OOP_Encalsulation;

public class AmericanAirline {

    public static void main(String[] args) {

        EmployeeInfo emrah = new EmployeeInfo();
        //emrah.Name = "Emrah";     //private data is not visible outside the class
        emrah.setName("Emrah");

        //System.out.println(emrah.Name);   //private data is not visible outside the class
        System.out.println(emrah.getName()); //Emrah

        emrah.setSSN(123456);
        System.out.println(emrah.getSSN());

        emrah.setAge((byte)20);
        System.out.println(emrah.getAge());

        emrah.setSalary(120000);
        System.out.println(emrah.getSalary());

        System.out.println("========================================");

        EmployeeInfo Shirin = new EmployeeInfo();
        Shirin.setAge((byte)20);
        Shirin.setSSN(777777);
        Shirin.setSalary(2);
        Shirin.setName("Shirin");
        System.out.println(Shirin.getName());
        System.out.println(Shirin.getSSN());
        System.out.println(Shirin.getAge());
        System.out.println(Shirin.getSalary());

        EmployeeInfo Rohan = new EmployeeInfo();
        Rohan.setInfo("Rohan", 3215672, (byte)20, 150);

        System.out.println(Rohan.getName());
        System.out.println(Rohan.getSSN());
        System.out.println(Rohan.getSalary());
        System.out.println(Rohan.getAge());

    }

}
