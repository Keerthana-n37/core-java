class Strawberry{
	String color;
	double weight;
	String taste;
	String origin;
	double price;
	
	Strawberry()
	{
		System.out.println("Executing the no paramter constructor");
	}
	
	Strawberry(String color,double price)
	{
		this.color=color;
		this.price=price;
	}
	
	Strawberry(double weight,String taste)
	{
		this.weight=weight;
		this.taste=taste;
	}
	
	Strawberry(String origin,String color)
	{
		this.origin=origin;
		this.color=color;
	}
	
	Strawberry(String color,String taste,double weight)
	{
		this.color=color;
		this.taste=taste;
		this.weight=weight;
	}
	
	Strawberry(String color,double weight,String taste,String origin,double price)
	{
		this.color=color;
		this.weight=weight;
		this.taste=taste;
		this.origin=origin;
		this.price=price;
	}
}
