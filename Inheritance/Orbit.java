class Orbit 
{
    String planetName;
    double radius;
    double speed;

    Orbit() 
	{
	     System.out.println("Executing no argument constructor");
    }

    void startOrbit() 
	{
        System.out.println("Orbit started around " + planetName);
    }

    void stopOrbit()
	{
        System.out.println("Orbit stopped around " + planetName);
    }
}