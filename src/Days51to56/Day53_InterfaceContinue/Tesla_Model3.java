package Days51to56.Day53_InterfaceContinue;

public class Tesla_Model3 implements Cars, ElectricVehicles{

    @Override
    public void Start() {
        System.out.println("Tesla Voice Control \"Tesla Start\"");
    }

    @Override
    public void Charge() {
        System.out.println("Charging");
    }

    @Override
    public void SelfDrive() {
        System.out.println("Self Driving Mode");
    }

    @Override
    public void fly() {
        System.out.println("Tesla is flying");
    }
}
