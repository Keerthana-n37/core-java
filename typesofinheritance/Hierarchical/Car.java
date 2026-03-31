class Car extends Vehicle 
{
    int seats;
    boolean isConvertible;

    Car() 
	{
        super();
        System.out.println("Car constructor called");
    }

    void drive()
	{
        System.out.println("Car is driving");
    }

    void displayCarDetails() 
	{
        System.out.println("Seats: " + seats);
        System.out.println("Convertible: " + isConvertible);
    }
}