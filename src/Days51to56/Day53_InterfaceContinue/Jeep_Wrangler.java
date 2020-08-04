package Days51to56.Day53_InterfaceContinue;

public class Jeep_Wrangler implements Cars, GasVehicle{
    @Override
    public void Start() {
        System.out.println("Call Mechanic");
        System.out.println("Oil Change");
        System.out.println("Jump Start");
    }

    @Override
    public void PumpGas() {
        System.out.println("Pumping Gas");
    }

    @Override
    public void SelfParking() {
        System.out.println("Self parking mode");
    }
}
