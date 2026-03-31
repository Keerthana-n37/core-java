class Slide 
{
    String slideName;
    String material;
    int height;
    boolean safe;

    Slide()
	{
        System.out.println("Slide constructor called...");
    }

    void startSliding() 
	{
        System.out.println("Sliding started...");
    }

    void stopSliding() 
	{
        System.out.println("Sliding stopped...");
    }
}