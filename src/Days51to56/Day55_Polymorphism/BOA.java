package Days51to56.Day55_Polymorphism;

import org.w3c.dom.NameList;

import java.util.ArrayList;
import java.util.Arrays;

abstract class ScrumTeam {
    public String Name, JobTitle;
    public double salary;

    public abstract void DailyStandUp();
    public abstract void Demo();

    public void getEmployeeInfo() {
        System.out.println("=====================================");
        System.out.println("Employee Name: " + Name);
        System.out.println("Job Title: " + JobTitle);
        System.out.println("Salary: $" + salary);
        System.out.println("=====================================");
    }

}

class Testers extends ScrumTeam {

    public Testers (String Name, String JobTitle, double salary) {
        this.Name = Name;
        this.JobTitle = JobTitle;
        this.salary = salary;
    }

    @Override
    public void DailyStandUp() {
        System.out.println("Tester " + Name + " is talking");
    }

    @Override
    public void Demo() {
        System.out.println("Tester " + Name + " is doing demo");
    }
}

public class BOA {
    public static void main(String[] args) {
        ScrumTeam Madina = new Testers("Madina", "SDET", 130000);
        ScrumTeam Akerke = new Testers("Akerke", "Automation Tester", 100000);
        ScrumTeam Erhan = new Testers("Erhan Holly", "Manual Tester", 40000);

        ScrumTeam[] testers = {Madina, Akerke, Erhan};
        for (ScrumTeam each : testers) {
            each.getEmployeeInfo();
        }

        Developers Nadire = new Developers("Nadire", "Senior Developer", 150000);
        Developers Mahir = new Developers("Mahir", "Junior Developer", 130000);
        Developers Parsa = new Developers("Parsa", "Medium Developer", 220000);
        Developers Dilara = new Developers("Dilara", "Deceloper", 200000);

        ScrumTeam[] dev = {Nadire, Mahir, Parsa, Dilara};
        for (ScrumTeam each : dev) {
            each.getEmployeeInfo();
        }

        ArrayList<ScrumTeam> scrum = new ArrayList<>();
        scrum.addAll(Arrays.asList(testers));
        scrum.addAll(Arrays.asList(dev));

        for (ScrumTeam each : scrum) {
            each.getEmployeeInfo();
        }
    }
}

class Developers extends ScrumTeam {

    public Developers(String Name, String JobTitle, double salary) {
        this.JobTitle = JobTitle;
        this.Name = Name;
        this.salary = salary;
    }

    @Override
    public void DailyStandUp() {
        System.out.println("Developer " + Name + " is talking");
    }

    @Override
    public void Demo() {
        System.out.println("Developer " + Name + " is doing demo");
    }

}
