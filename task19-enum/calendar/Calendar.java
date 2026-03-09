class Calendar{
	
	int year;
	Publisher publisher;
	CalendarType type;
	
	Calendar(int year,Publisher publisher,CalendarType type)
	{
		this.year=year;
		this.publisher=publisher;
		this.type=type;
	}
	
	void printInfo()
	{
		System.out.println("Year:"+this.year);
		
		if(this.publisher!=null)
		{
			this.publisher.aboutPublisher();
		}
		else
		{
			System.out.println("Publisher is null");
		}
		System.out.println("Calendar Type: " + this.type);
        System.out.println("------------------------");
	}
}