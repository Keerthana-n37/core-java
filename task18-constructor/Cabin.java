class Cabin{
	
	String name;
	
	Cabin(String name)
	{
		System.out.println("Executing Cabin constructor");
		this.name=name;
	}
	
	void getCabin()
	{
		System.out.println("Cabin name:"+this.name);
	}
}