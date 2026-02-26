class Droplet{
	String color;
	double size;
	String shape;
	String type;
	double weight;
	Droplet(){
		System.out.println("Executing no parameter constructor");		
	}
	
	Droplet(String color)
	{
		this.color=color;
	}
	
	Droplet(String color,double size)
	{
		this.color=color;
		this.size=size;
	}
	
	Droplet(String color,double size,String shape)
	{
		this.color=color;
		this.size=size;
		this.shape=shape;
	}
	
	Droplet(String color,double size,String shape,String type)
	{
		this.color=color;
		this.size=size;
		this.shape=shape;
		this.type=type;
	}
	
	Droplet(String color,double size,String shape,String type,double weight)
	{
		this.color=color;
		this.size=size;
		this.shape=shape;
		this.type=type;
		this.weight=weight;
	}
}