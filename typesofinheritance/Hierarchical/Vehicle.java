class Vehicle 
{
    String brand;
    int maxSpeed;
    double price;

    Vehicle()
	{
        System.out.println("Vehicle constructor called");
    }

    void start() 
	{
        System.out.println("Vehicle is starting");
    }

    void stop()
	{
        System.out.println("Vehicle is stopping");
    }

    void displayVehicleDetails() 
	{
        System.out.println("Brand: " + brand);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Price: " + price);
    }
}
