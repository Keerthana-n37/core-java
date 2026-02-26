class Pawn
{
	String color;
    String material;
    double height;
    double weight;
    double price;
	
	Pawn()
	{
		System.out.println("Executing the no paramter constructor");
	}
	
	Pawn(String color,double height)
	{
		this.color=color;
		this.height=height;
	}
	
	Pawn(double price,String material)
	{
		this.material=material;
		this.price=price;
	}
	
	Pawn(double height,double weight)
	{
		this.height=height;
		this.weight=weight;
	}
	
	Pawn(String color,String material,double weight)
	{
		this.color=color;
		this.material=material;
		this.weight=weight;
	}
	
	Pawn(String color,String material,double height,double weight,double price)
	{
		this.color=color;
		this.material=material;
		this.height=height;
		this.weight=weight;
		this.price=price;
	}
}