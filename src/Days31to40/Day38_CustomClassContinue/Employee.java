package Days31to40.Day38_CustomClassContinue;

public class Employee {

    String Name;
    String ID;
    int age;
    int SSN;
    String jobTitle;
    double salary;

    public Employee(String Name, String ID, int age, int SSN, String jobTitle, double salary) {
        this.Name = Name;
        this.ID = ID;
        this.age = age;
        this.SSN = SSN;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void getInfo() {
        System.out.println("Employee's name is: " + Name);
        System.out.println("Social Security Number is: " + SSN);
        System.out.println("Employee's age is: " + age);
        System.out.println("Job title is: " + jobTitle);
        System.out.println("Employee ID is: " + ID);
        System.out.println("Salary: " + salary);

        System.out.println("------------------------------------------");
    }

}
