class Bike extends Vehicle 
{
    boolean hasCarrier;
    int engineCC;

    Bike()
	{
        super();
        System.out.println("Bike constructor called");
    }

    void ride() 
	{
        System.out.println("Bike is riding");
    }

    void displayBikeDetails()
	{
        System.out.println("Engine: " + engineCC + " CC");
        System.out.println("Has Carrier: " + hasCarrier);
    }
}