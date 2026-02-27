class Stadium{
	String name;
	int capacity;
	
	Stadium(String name)
	{
		this.name=name;
		System.out.println("Creating the constructor with string name as parameter");
	}
	
	Stadium(int capacity)
	{
		this.capacity=capacity;
		System.out.println("Creating the constructor with capacity as parameter");
	}
	
	Stadium(String name, int capacity)
	{
		this.name=name;
		this.capacity=capacity;
		System.out.println("Creating the constructor with name and capacity as parameter");
	}
}