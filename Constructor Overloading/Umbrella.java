class Umbrella{
	String brand;
	String color;
	double price;
	String type;
	int ribs;
	
	Umbrella()
	{
		System.out.println("Executing the no paramter constructor");
	}
	
	Umbrella(String brand)
	{
		this.brand=brand;
	}
	
	Umbrella(String brand,String color)
	{
		this.brand=brand;
		this.color=color;
	}
	
	Umbrella(String brand,String color,double price)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	Umbrella(String brand,String color,double price,String type)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.type=type;
	}
	
	Umbrella(String brand,String color,double price,String type,int ribs)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.type=type;
		this.ribs=ribs;
	}
}