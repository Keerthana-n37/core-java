class Track{
	String type;
	double length;
	String location;
	String surface;
	int lanes;
	
	Track()
	{
		System.out.println("Executing the no paramter constructor");
	}
	
	Track(String type,int lanes)
	{
		this.type=type;
		this.lanes=lanes;
	}
	
	Track(double length,String surface)
	{
		this.length=length;
		this.surface=surface;
	}
	
	Track(String location,String type,double length)
	{
		this.location=location;
		this.type=type;
		this.length=length;
	}
	
	Track(String surface,int lanes,double length)
	{
		this.surface=surface;
		this.lanes=lanes;
		this.length=length;
	}
	
	Track(String type,double length,String location,String surface,int lanes)
	{
		this.type=type;
		this.length=length;
		this.location=location;
		this.surface=surface;
		this.lanes=lanes;
	}
}