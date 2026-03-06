class Guest{
	String name;
	
	Guest(String name)
	
	{
		System.out.println("Executing guest constructor");
		this.name=name;
	}
	
	void getGuest()
	{
		System.out.println("Guest name:"+name);
	}
}