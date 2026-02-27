class ZooCreator{
	
	static void getZoo()
	{
		System.out.println("Create a new zoo");
		Zoo zoo= new Zoo("Mysore Zoo");
		System.out.println("Zoo name:"+zoo.name);
		System.out.println("Zoo is created");
		System.out.println("---------------");
		
		System.out.println("Create a new zoo1");
		Zoo zoo1= new Zoo(1450);
		System.out.println("Zoo animal count:"+zoo1.numberOfAnimals);
		System.out.println("Zoo1 is created");
		System.out.println("---------------");
		
		System.out.println("Create a new zoo2");
		Zoo zoo2= new Zoo("Bannerghatta Zoo",2260);
		System.out.println("Zoo name:"+zoo2.name);
		System.out.println("Zoo animal count:"+zoo2.numberOfAnimals);
		System.out.println("Zoo2 is created");
		System.out.println("---------------");
	}
	
	static void getZoo(String name)
	{
		System.out.println("Create a new zoo with name:"+name);
		Zoo zoo= new Zoo(name);
		System.out.println("Zoo name:"+zoo.name);
		System.out.println("Zoo iz created using name as argument");
		System.out.println("------------------");
	}
	
	static void getZoo(int numberOfAnimals)
	{
		System.out.println("Create a new zoo with animal count:"+numberOfAnimals);
		Zoo zoo= new Zoo(numberOfAnimals);
		System.out.println("Animal Count in zoo is:"+zoo.numberOfAnimals);
		System.out.println("Zoo is created using numberOfAnimals as argument");
		System.out.println("------------------");
	}
	
	static void getZoo(String name, int numberOfAnimals)
	{
		System.out.println("Create a new zoo with name:"+name+"and animal count:"+numberOfAnimals);
		Zoo zoo=new Zoo(name,numberOfAnimals);
		System.out.println("Zoo name:"+zoo.name);
		System.out.println("Animal count:"+zoo.numberOfAnimals);
		System.out.println("Zoo is created using name and numberOfAnimals as argument");
		System.out.println("------------------");
	}
}