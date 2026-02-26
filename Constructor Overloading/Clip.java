class Clip{
	String type;
	String color;
	double size;
	String material;
	double price;
	
	Clip()
	{
		System.out.println("Executing the no paramter constructor");
	}
	
	Clip(String type,double price)
	{
		this.type=type;
		this.price=price;
	}
	
	Clip(double size,String type)
	{
		this.size=size;
		this.type=type;
	}
	
	Clip(String type,String color,double size)
	{
		this.type=type;
		this.color=color;
		this.size=size;
	}
	
	Clip(String type,String material,double size,double price)
    {
        this.type=type;
        this.material=material;
        this.size=size;
        this.price=price;
    }
	
	Clip(String type,String color,double size,String material,double price)
	{
		this.type=type;
		this.color=color;
		this.size=size;
		this.material=material;
		this.price=price;
	}
}