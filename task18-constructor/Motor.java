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
		System.out.println("Motor brand:"+this.brand);
		System.out.println("Power:"+this.power);
		System.out.println("Voltage:"+this.voltage);
		System.out.println("Type:"+this.type);
		System.out.println("Automatic:"+this.isAutomatic);
		
		if(this.manufacturer!=null)
		{
			this.manufacturer.getManufacturer();
		}
		else{
			System.out.println("Manufacturer is null");
		}
		if(this.motorBattery!=null)
		{
			this.motorBattery.getMotorBattery();
		}
		else{
			System.out.println("motorBattery is null");
		}
		
		if(this.controller!=null)
		{
			this.controller.getController();
		}
		else{
			System.out.println("controller is null");
		}
		
		if(this.coolingSystem!=null)
		{
			this.coolingSystem.getCoolingSystem();
		}
		else{
			System.out.println("coolingSystem is null");
		}
		
		if(this.warranty!=null)
		{
			this.warranty.getWarranty();
		}
		else{
			System.out.println("warranty is null");
		}
	}	
}