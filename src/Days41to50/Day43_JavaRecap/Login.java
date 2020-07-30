package Days41to50.Day43_JavaRecap;

public class Login {

    public static void main(String[] args) {

        Credentials Faith = new Credentials();
        //obj.username = "Faith"; //instance variable username is private
        //obj.password = "RussianStuff"; //instance variable password is private

        //System.out.println(obj.username);
        //System.out.println(obj.password);

        //read:
        System.out.println(Faith.getUsername());
        System.out.println(Faith.getPassword());

        //modify:
        Faith.setUsername("Faith");
        Faith.setPassword("RussianCharacters");

    }

}
