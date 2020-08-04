package Days51to56.Day53_InterfaceContinue;

public class Dealership {

    public static void main(String[] args) {

        Tesla_Model3 obj1 = new Tesla_Model3();

        obj1.Start();
        obj1.fly();

        Jeep_Wrangler obj2 = new Jeep_Wrangler();
        obj2.Start();
        obj2.PumpGas();

        ToyotaHybrid obj3 = new ToyotaHybrid();
        obj3.PumpGas();
        obj3.Charge();

    }

}
