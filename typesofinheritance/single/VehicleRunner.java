class VehicleRunner 
{
    public static void main(String[] args)
	{

        System.out.println("Single Inheritance");

        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Camry";
        car.speed = 180;
        car.price = 35000.50;
        car.isElectric = false;
        car.seats = 5;

        car.displayDetails();
        car.start();
        car.drive();
        car.stop();
    }
}