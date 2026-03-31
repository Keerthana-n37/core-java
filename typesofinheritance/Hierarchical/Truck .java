class Truck extends Vehicle 
{
    int loadCapacity;
    int wheels;

    Truck() 
	{
        super();
        System.out.println("Truck constructor called");
    }

    void transportGoods() 
	{
        System.out.println("Truck is transporting goods");
    }

    void displayTruckDetails() 
	{
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println("Wheels: " + wheels);
    }
}