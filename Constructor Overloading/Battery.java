class Battery
{
	String brand;
	int capacity;
	String type;
	double voltage;
	double price;
	
	Battery()
	{
		System.out.println("Executing the no paramter constructor");
	}
	
	Battery(String brand,double voltage)
	{
		this.brand=brand;
		this.voltage=voltage;
	}
	
	Battery(int capacity,double price)
	{
		this.capacity=capacity;
		this.price=price;
	}
	
	Battery(String type,int capacity,double voltage)
	{
		this.type=type;
		this.capacity=capacity;
		this.voltage=voltage;
	}
	
	Battery(String brand, String type, double price)
	{
		this.brand = brand;
		this.type = type;
		this.price = price;
    }
	
	Battery(String brand,int capacity,String type,double voltage,double price)
	{
		this.brand=brand;
		this.capacity=capacity;
		this.type=type;
		this.voltage=voltage;
		this.price=price;
	}
}