class HairDryer{
	String brand;
	int watt;
	String color;
	double price;
	int speedlevels;
	
	HairDryer()
	{
		System.out.println("Executing the no paramter constructor");
	}
	
	HairDryer(String brand,double price)
	{
		this.brand=brand;
		this.price=price;
	}
	
	HairDryer(int watt,int speedlevels)
	{
		this.watt=watt;
		this.speedlevels=speedlevels;
	}
	
	HairDryer(String brand,String color,int watt)
	{
		this.brand=brand;
		this.color=color;
		this.watt=watt;
	}
	
	HairDryer(String color,int speedlevels,double price)
	{
		this.color=color;
		this.speedlevels=speedlevels;
		this.price=price;
	}
	
	HairDryer(String brand,int watt,String color,double price,int speedlevels)
	{
		this.brand=brand;
		this.watt=watt;
		this.color=color;
		this.price=price;
		this.speedlevels=speedlevels;
	}
}