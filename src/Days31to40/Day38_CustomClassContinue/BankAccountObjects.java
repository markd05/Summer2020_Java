package Days31to40.Day38_CustomClassContinue;

public class BankAccountObjects {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.accountHolder = "Erhan Dolapci";
        account1.accountNumber = 1234567891234567L;

        account1.showBalance();

        account1.deposit(2000);
        account1.deposit(4000);

        account1.withdraw(3000);
        account1.withdraw(3001);
        account1.withdraw(2000);
        account1.deposit(2000000);

        BankAccount account2 = new BankAccount();
        account2.accountSetup("Muaz Gulen", 2223333444555666L);
        account2.showBalance();

        account2.deposit(1000000);
        account2.withdraw(500000);

        BankAccount account3 = new BankAccount("Nadire Pilottt", 4004606050503030L);
        account3.showBalance();

        account3.deposit(10);
        account3.withdraw(20); //-45

        account3.withdraw(200);
        account3.deposit(3000);

    }

}
