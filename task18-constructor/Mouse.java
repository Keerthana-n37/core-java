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
			  System.out.println("Mouse price:"+price);
			  System.out.println("Is mouse wireless:"+wireless);
			  System.out.println("Mouse color:"+color);
			  System.out.println("Mouse brand:"+brand);
			  System.out.println("Mouse weight:"+weight);
			  System.out.println("--------------------");
		  }
}