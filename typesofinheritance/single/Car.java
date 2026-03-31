class Car extends Vehicle 
{
    String model;
    int seats;

    void drive()
	{
        System.out.println("Car is driving");
    }
	
	 void displayDetails() 
	{
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Speed:"+speed);
        System.out.println("Price:"+price);
        System.out.println("Vechicle is electric:"+isElectric);
        System.out.println("Seats in vehicle:"+seats);
    }
}