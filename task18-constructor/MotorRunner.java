class MotorRunner{
	
	public static void main(String[] args){
	
    Manufacturer manufacturer = new Manufacturer("Bosch", "Germany");
    MotorBattery motorbattery = new MotorBattery(5000, "Lithium-Ion");
    Controller controller = new Controller("CTRL-X", 2);
    CoolingSystem cooling = new CoolingSystem("Air Cooling", "High");
    Warranty warranty = new Warranty(3, "Bosch Service");

    Motor motor = new Motor("XMotor", 1500, 220.5, "Electric", true,
                                manufacturer, motorbattery, controller, cooling, warranty);
    motor.display();
	
	}
}