class VehicleRunner 
{
    public static void main(String[] args) 
	{

        System.out.println("Hierarchical Inheritance Example");

        Car car = new Car();
        car.brand = "BMW";
        car.maxSpeed = 240;
        car.price = 50000;
        car.seats = 4;
        car.isConvertible = true;

        System.out.println("Car Details");
        car.displayVehicleDetails();
        car.displayCarDetails();
        car.start();
        car.drive();
        car.stop();

        System.out.println("Bike Details");
        Bike bike = new Bike();
        bike.brand = "Yamaha";
        bike.maxSpeed = 120;
        bike.price = 15000;
        bike.hasCarrier = true;
        bike.engineCC = 150;

        bike.displayVehicleDetails();
        bike.displayBikeDetails();
        bike.start();
        bike.ride();
        bike.stop();

        System.out.println("Truck Details");
        Truck truck = new Truck();
        truck.brand = "Tata";
        truck.maxSpeed = 90;
        truck.price = 80000;
        truck.loadCapacity = 15;
        truck.wheels = 8;

        truck.displayVehicleDetails();
        truck.displayTruckDetails();
        truck.start();
        truck.transportGoods();
        truck.stop();
    }
}