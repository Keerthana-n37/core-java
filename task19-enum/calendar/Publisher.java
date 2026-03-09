class Publisher{
	
	String name;
	int establishedYear;
	
	Publisher(String name, int establishedYear)
	{
		this.name=name;
		this.establishedYear=establishedYear;
	}
	
	void aboutPublisher()
	{
		System.out.println("Publisher Name:"+this.name);
		System.out.println("Established year:"+this.establishedYear);
	}
}