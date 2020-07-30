package Days41to50.Day45_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

class credentials {

    private String username;
    private String password;

    public credentials() {
        setUsername("admin");
        setPassword("123");
    }

    //getter:
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    //setter:
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCredentials(String username, String password) {
        //this.username = username;
        //this.password = password;
        setUsername(username);
        setPassword(password);
    }

    public void getInfo() {
        System.out.println("username: " + getUsername());
        System.out.println("password: " + getPassword());
    }
}

public class EncapsulationReview {

    public static void main(String[] args) {

        credentials Zlfy = new credentials();
        //obj.username = "Zlfy"; //private is only visible within its class
        //obj.password = "123456"; //private is only visible within its class

        //read:
        System.out.println(Zlfy.getUsername());
        System.out.println(Zlfy.getPassword());

        credentials Nurzat = new credentials();
        Nurzat.setUsername("9876");
        Nurzat.setPassword("nuri345");

        System.out.println("user name: " + Nurzat.getUsername());
        System.out.println("password: " + Nurzat.getPassword());

        credentials Seyfo = new credentials();
        Seyfo.setCredentials("Seyfo", "456");
        Seyfo.setPassword("789");

        Seyfo.getInfo();

        System.out.println("============================================");

        credentials[] users = {Zlfy, Nurzat, Seyfo};
        users[0].getInfo();
        users[1].getInfo();
        users[2].getInfo();

        ArrayList<credentials> CredentialsList = new ArrayList<>();
        CredentialsList.addAll(Arrays.asList(Zlfy, Nurzat, Seyfo));

        for (credentials each : CredentialsList) {
            each.getInfo();
        }

    }

}
