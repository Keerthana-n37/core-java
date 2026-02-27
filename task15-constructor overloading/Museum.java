class Museum{
	String name;
	double ticketPrice;
	
	Museum(String name)
	{
		this.name=name;
		System.out.println("Creating the constructor with string name as parameter");
	}
	
	Museum(double ticketPrice)
	{
		this.ticketPrice=ticketPrice;
		System.out.println("Creating the constructor with double ticketPrice as parameter");
	}
	
	Museum(String name,double ticketPrice)
	{
		this.name=name;
		this.ticketPrice=ticketPrice;
		System.out.println("Creating the constructor with name and ticketPrice as parameter");
	}
}