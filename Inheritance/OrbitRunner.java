class OrbitRunner
{
    public static void main(String[] args) 
	{

        SatelliteOrbit satOrbit = new SatelliteOrbit();
        satOrbit.planetName = "Earth";
        satOrbit.radius = 6371;
        satOrbit.speed = 7.8;
        satOrbit.satelliteName = "Hubble";
        satOrbit.gpsEnabled = true;
        satOrbit.altitude = 569;
        satOrbit.missionDuration = 3650;
        satOrbit.communicationActive = true;

        System.out.println("Planet Name: " + satOrbit.planetName);
        System.out.println("Orbit Radius: " + satOrbit.radius);
        System.out.println("Orbit Speed: " + satOrbit.speed);
        System.out.println("Satellite Name: " + satOrbit.satelliteName);
        System.out.println("GPS Enabled: " + satOrbit.gpsEnabled);
        System.out.println("Altitude: " + satOrbit.altitude);
        System.out.println("Mission Duration: " + satOrbit.missionDuration);
        System.out.println("Communication Active: " + satOrbit.communicationActive);

        satOrbit.startOrbit();
        satOrbit.stopOrbit();
        satOrbit.activateSatellite();
        satOrbit.transmitData();

        Orbit basicOrbit = new SatelliteOrbit();
        basicOrbit.planetName = "Mars";
        basicOrbit.radius = 3389;
        basicOrbit.speed = 5.0;

        System.out.println("Planet Name: " + basicOrbit.planetName);
        System.out.println("Orbit Radius: " + basicOrbit.radius);
        System.out.println("Orbit Speed: " + basicOrbit.speed);

        basicOrbit.startOrbit();
        basicOrbit.stopOrbit();

        Orbit normalOrbit = new Orbit();
        normalOrbit.planetName = "Venus";
        normalOrbit.radius = 6052;
        normalOrbit.speed = 3.5;

        System.out.println("Planet Name: " + normalOrbit.planetName);
        System.out.println("Orbit Radius: " + normalOrbit.radius);
        System.out.println("Orbit Speed: " + normalOrbit.speed);

        normalOrbit.startOrbit();
        normalOrbit.stopOrbit();
    }
}