package Days31to40.Day38_CustomClassContinue;

public class BankAccount {
    /*
        create a custom class for BankAccount

        attributes/data that can have are:
            1. AccountHolder, 2. AccountNumber, 3. Balance

        actions:
            deposit, withdraw, showBalance

        requirements:
            1. the user should be able to deposit money into their account

            2. user should be able to withdraw money from their account
                2.1 if the withdrawing account is greater than available balance, $35 penalty charge will be added

                2.2 if the balance is less than or equal to 0, user should not be able to withdraw money

            3. user should be able to see their balance
     */

    String accountHolder;
    long accountNumber;
    double balance;


    public BankAccount() {

    }

    public BankAccount(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public void showBalance() {
        System.out.println("------------------------------------------");
        String acct = "" + accountNumber;
        String accountNumber = "************" + acct.substring(12);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Available Balance: $" + balance);
        System.out.println("------------------------------------------");
    }

    public void deposit(double amount) {
        System.out.println("------------------------------------------");
        String acct = ""+accountNumber;
        String accountNumber = "************" + acct.substring(12);
        System.out.println("Depositing $" + amount + " to the account " + accountNumber);
        balance += amount;
        System.out.println("New Balance: $" + balance);
        System.out.println("------------------------------------------");
    }

    public void withdraw(double amount) {
        System.out.println("------------------------------------------");

        if (balance <= 0) {
            System.out.println("No available balance");
            return;
        }

        String acct = ""+accountNumber;
        String accountNumber = "************" + acct.substring(12);
        System.out.println("Withdrawing $" + amount + " to the account " + accountNumber);
        balance -= amount;

        if (balance < 0) {
            balance -= 35;
        }
        System.out.println("New Balance: $" + balance);

        System.out.println("------------------------------------------");
    }

    public void accountSetup(String name, long acctNum) {
        accountHolder = name;
        accountNumber = acctNum;
    }

}
