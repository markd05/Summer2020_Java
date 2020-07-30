package Days41to50.Day43_JavaRecap;

public class Credentials {

    /*
    username
    password
     */

    private String username = "Ibrohim";
    private String password = "Prichoska";

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

    /*
    create custom class for bank account:
        1. private data: accountHolder, accountNumber, Balance
        2. generate getters and setters
        3. action: depositing, withdrawing, available balance
            try to use getter and setter in those actions
     */

}
