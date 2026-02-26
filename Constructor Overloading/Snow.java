class Snow{
	String type;
	double temperature;
	String region;
	String color;
	int thickness;
	
	Snow()
	{
		System.out.println("Executing the no paramter constructor");
	}
	
	Snow(String type,String region)
	{
		this.type=type;
		this.region=region;
	}
	
	Snow(double temperature,int thickness)
	{
		this.temperature=temperature;
		this.thickness=thickness;
	}
	
	Snow(String color,String type,double temperature)
	{
		this.color=color;
		this.type=type;
		this.temperature=temperature;
	}
	
	Snow(String type,String region,int thickness)
	{
		this.type=type;
		this.region=region;
		this.thickness=thickness;
	}
	
	Snow(String type,double temperature,String region,String color,int thickness)
	{
		this.type=type;
		this.temperature=temperature;
		this.region=region;
		this.color=color;
		this.thickness=thickness;
	}
}