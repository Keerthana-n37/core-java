class Patron{
	String fullName;
	Patron(String fullName)
	{
		System.out.println("Executing Patron Constructor");
		this.fullName=fullName;
	}
	
	void getPatron()
	{
		System.out.println("Patron full name:"+this.fullName);
	}
}