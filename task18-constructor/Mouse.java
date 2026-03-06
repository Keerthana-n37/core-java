class Mouse{
	
	double price;
	boolean wireless;
	String color;
	String brand;
	float weight;
	
	Button button;
	ScrollWheel scrollWheel;
	Sensor sensor;
	Wire wire;
	Battery battery;
	
	
	Mouse(double price,boolean wireless,String color,String brand,float weight,
	      Button button,ScrollWheel scrollWheel,Sensor sensor,Wire wire,Battery battery)
		  {
			  this.price=price;
			  this.wireless=wireless;
			  this.color=color;
			  this.brand=brand;
			  this.weight=weight;
			  this.button=button;
			  this.scrollWheel=scrollWheel;
			  this.sensor=sensor;
			  this.wire=wire;
			  this.battery=battery;
			  
			  System.out.println("Mouse constructor is executing where it has primitive and non primitive as instance variables..");
		  }
		  
	void getMouseInfo()
	{
		System.out.println("Mouse price:"+this.price);
		System.out.println("Is mouse wireless:"+this.wireless);
		System.out.println("Mouse color:"+this.color);
		System.out.println("Mouse brand:"+this.brand);
		System.out.println("Mouse weight:"+this.weight);
		
		if(this.button!=null)
		{
			this.button.getButton();
		}
		else{
			System.out.println("Button value is null");
		}
		
		if(this.scrollWheel!=null)
		{
			this.scrollWheel.getScrollWheel();
		}
		else{
			System.out.println("Scroll wheel is null");
		}
		
		if(this.sensor!=null)
		{
			this.sensor.getSensor();
		}
		else{
			System.out.println("Sensor value is null");
		}
		
		if(this.wire!=null)
		{
			this.wire.getWire();
		}
		else{
			System.out.println("Wire value is null");
		}
		
		if(this.battery!=null)
		{
			this.battery.getBattery();
		}
		else{
			System.out.println("Battery value is null");
		}
	}	
}