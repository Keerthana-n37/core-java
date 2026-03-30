class FactoryRunner 
{
    public static void main(String[] args) 
	{
        CarFactory carFactory = new CarFactory();
        carFactory.name = "SpeedMotors";
        carFactory.location = "Industrial Area";
        carFactory.totalEmployees = 500;
        carFactory.operational = true;
        carFactory.numberOfCarsProduced = 1000;
        carFactory.carBrand = "SpeedX";
        carFactory.automated = true;
        carFactory.numberOfShifts = 3;
        carFactory.safetyLevel = "High";

        System.out.println("Name: " + carFactory.name);
        System.out.println("Location: " + carFactory.location);
        System.out.println("Total Employees: " + carFactory.totalEmployees);
        System.out.println("Operational: " + carFactory.operational);
        System.out.println("Number of Cars Produced: " + carFactory.numberOfCarsProduced);
        System.out.println("Car Brand: " + carFactory.carBrand);
        System.out.println("Automated: " + carFactory.automated);
        System.out.println("Number of Shifts: " + carFactory.numberOfShifts);
        System.out.println("Safety Level: " + carFactory.safetyLevel);

        carFactory.startProduction();
        carFactory.stopProduction();
        carFactory.testCars();
        carFactory.maintainMachines();

        Factory basicFactory = new CarFactory();
        basicFactory.name = "AutoWorks";
        basicFactory.location = "Suburban Area";
        basicFactory.totalEmployees = 200;
        basicFactory.operational = true;

        System.out.println("Name: " + basicFactory.name);
        System.out.println("Location: " + basicFactory.location);
        System.out.println("Total Employees: " + basicFactory.totalEmployees);
        System.out.println("Operational: " + basicFactory.operational);

        basicFactory.startProduction();
        basicFactory.stopProduction();

        Factory normalFactory = new Factory();
        normalFactory.name = "LocalMakers";
        normalFactory.location = "City Center";
        normalFactory.totalEmployees = 50;
        normalFactory.operational = false;

        System.out.println("Name: " + normalFactory.name);
        System.out.println("Location: " + normalFactory.location);
        System.out.println("Total Employees: " + normalFactory.totalEmployees);
        System.out.println("Operational: " + normalFactory.operational);

        normalFactory.startProduction();
        normalFactory.stopProduction();
    }
}