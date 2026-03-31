class Carrier 
{
    String companyName;
    int loadCapacity;
    boolean international;
    String transportType;

    Carrier() 
	{
        System.out.println("Carrier constructor called...");
    }

    void loadGoods() 
	{
        System.out.println("Loading goods...");
    }

    void move() 
	{
        System.out.println("Carrier moving...");
    }
}