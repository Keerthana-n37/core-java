class AirCarrier extends Carrier 
{
    int flightCount;
    String aircraftModel;
    boolean cargoTracking;
    int crewMembers;
    String destination;

    AirCarrier() 
	{
        super();
        System.out.println("AirCarrier constructor called...");
    }

    void takeOff() 
	{
        System.out.println("Aircraft taking off...");
    }

    void land() 
	{
        System.out.println("Aircraft landing...");
    }
}