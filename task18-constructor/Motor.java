class Motor{
	String brand;
	int power;
	double voltage;
	String type;
	boolean isAutomatic;
	
	Manufacturer manufacturer;
	MotorBattery motorBattery;
	Controller controller;
	CoolingSystem coolingSystem;
	Warranty warranty;
	
	Motor(String brand, int power, double voltage, String type, boolean isAutomatic,
          Manufacturer manufacturer, MotorBattery motorBattery, Controller controller,
          CoolingSystem coolingSystem, Warranty warranty)
		  {
			  this.brand=brand;
			  this.power=power;
			  this.voltage=voltage;
			  this.type=type;
			  this.isAutomatic=isAutomatic;
			  this.manufacturer=manufacturer;
			  this.motorBattery=motorBattery;
			  this.controller=controller;
			  this.coolingSystem=coolingSystem;
			  this.warranty=warranty;
		  }
		  
	void display()
	{
		System.out.println("Motor brand:"+brand);
		System.out.println("Power:"+power);
		System.out.println("Voltage:"+voltage);
		System.out.println("Type:"+type);
		System.out.println("Automatic:"+isAutomatic);
		System.out.println("Manufacturer Name:"+manufacturer.name);
		System.out.println("Manufacturer country:"+manufacturer.country);
		System.out.println("Battery Capacity:"+motorBattery.capacity);
		System.out.println("Battery type:"+motorBattery.type);
		System.out.println("Controller model:"+controller.model);
		System.out.println("Controller Version:"+controller.version);
		System.out.println("Cooling method:"+coolingSystem.method);
		System.out.println("Cooling efficiency:"+coolingSystem.efficiency);
		
	}	
}