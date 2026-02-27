class Zoo{
	String name;
	int numberOfAnimals;
	
	Zoo(String name)
	{
		this.name=name;
		System.out.println("Creating the constructor with string name as parameter");
	}
	
	Zoo(int numberOfAnimals)
	{
		this.numberOfAnimals=numberOfAnimals;
		System.out.println("Creating the constructor with int numberOfAnimals as parameter");
	}
	
	Zoo(String name, int numberOfAnimals)
	{
		this.name=name;
		this.numberOfAnimals=numberOfAnimals;
		System.out.println("Creating the constructor with name and numberOfAnimals as parameter");
	}
}