class SatelliteOrbit extends Orbit
{
    String satelliteName;
    boolean gpsEnabled;
    double altitude;
    int missionDuration;
    boolean communicationActive;

    SatelliteOrbit() 
	{
		super();
	    System.out.println("Executing no argument constructor");
    }

    void activateSatellite()
	{
        System.out.println(satelliteName + " activated successfully.");
    }

    void transmitData() 
	{
        System.out.println(satelliteName + " is transmitting data to Earth...");
    }
}
