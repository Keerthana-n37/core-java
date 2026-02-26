class Rain{
	String type;
	double intensity;
	String season;
	String location;
	int duration;
	
	Rain()
	{
		System.out.println("Executing the no paramter constructor");
	}
	
	Rain(String type,String location)
	{
		this.type=type;
		this.location=location;
	}
	
	Rain(double intensity,int duration)
	{
		this.intensity=intensity;
		this.duration=duration;
	}
	
	Rain(String season,double intensity,String type)
	{
		this.season=season;
		this.intensity=intensity;
		this.type=type;
	}
	
	Rain(String type,String season,int duration)
	{
		this.type=type;
		this.season=season;
		this.duration=duration;
	}
	
	Rain(String type,double intensity,String season,String location,int duration)
	{
		this.type=type;
		this.intensity=intensity;
		this.season=season;
		this.location=location;
		this.duration=duration;
	}
}