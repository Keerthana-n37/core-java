class CarrierRunner 
{
    public static void main(String[] args) 
	{

        System.out.println("Subclass Object Same Type");

        AirCarrier carrier = new AirCarrier();
        carrier.companyName = "GlobalCargo";
        carrier.loadCapacity = 5000;
        carrier.international = true;
        carrier.transportType = "Air";
        carrier.flightCount = 40;
        carrier.aircraftModel = "Boeing 747";
        carrier.cargoTracking = true;
        carrier.crewMembers = 8;
        carrier.destination = "Dubai";

        System.out.println(carrier.companyName);
        System.out.println(carrier.loadCapacity);
        System.out.println(carrier.international);
        System.out.println(carrier.transportType);
        System.out.println(carrier.flightCount);
        System.out.println(carrier.aircraftModel);
        System.out.println(carrier.cargoTracking);
        System.out.println(carrier.crewMembers);
        System.out.println(carrier.destination);

        carrier.loadGoods();
        carrier.move();
        carrier.takeOff();
        carrier.land();


        System.out.println("Parent Reference Subclass Object");

        Carrier carrier1 = new AirCarrier();
        carrier1.companyName = "SkyTransport";
        carrier1.loadCapacity = 3000;
        carrier1.international = true;
        carrier1.transportType = "Cargo";

        System.out.println(carrier1.companyName);
        System.out.println(carrier1.loadCapacity);
        System.out.println(carrier1.international);
        System.out.println(carrier1.transportType);

        carrier1.loadGoods();
        carrier1.move();


        System.out.println("Parent Class Object");

        Carrier carrier2 = new Carrier();
        carrier2.companyName = "LocalCarrier";
        carrier2.loadCapacity = 1000;
        carrier2.international = false;
        carrier2.transportType = "Road";

        System.out.println(carrier2.companyName);
        System.out.println(carrier2.loadCapacity);
        System.out.println(carrier2.international);
        System.out.println(carrier2.transportType);

        carrier2.loadGoods();
        carrier2.move();
    }
}