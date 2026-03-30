class CarFactory extends Factory 
{
    int numberOfCarsProduced;
    String carBrand;
    boolean automated;
    int numberOfShifts;
    String safetyLevel;

    CarFactory() 
	{
        super();
        System.out.println("CarFactory constructor called...");
    }

    void testCars() 
	{
        System.out.println("Testing cars in " + name);
    }

    void maintainMachines() 
	{
        System.out.println("Maintaining machines in " + name);
    }
}