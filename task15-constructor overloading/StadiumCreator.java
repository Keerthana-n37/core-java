class StadiumCreator{
	
	static void getStadium()
	{
		System.out.println("Create a new Stadium");
		Stadium stadium = new Stadium("Chinnaswamy Stadium");
		System.out.println("Stadium name:"+stadium.name);
		System.out.println("Stadium is created...");
		System.out.println("------------------");
		
		System.out.println("Create a new Stadium1");
		Stadium stadium1 = new Stadium(40000);
		System.out.println("Stadium capacity:"+stadium1.capacity);
		System.out.println("Stadium1 is created...");
		System.out.println("------------------");
		
		System.out.println("Create a new Stadium2");
		Stadium stadium2= new Stadium("Chinnaswamy Stadium",53000);
		System.out.println("Stadium name:"+stadium2.name);
		System.out.println("Stadium capacity:"+stadium2.capacity);
		System.out.println("Stadium is created...");
		System.out.println("------------------");
		
	}
	
	static void getStadium(String name)
	{
		System.out.println("Create a new stadium with name:"+name);
		Stadium stadium=new Stadium(name);
		System.out.println("Stadium name:"+stadium.name);
		System.out.println("Stadium is created using name as argument");
		System.out.println("------------------");
	}
	
	static void getStadium(int capacity)
	{
		System.out.println("Create a new stadium with capacity:"+capacity);
		Stadium stadium=new Stadium(capacity);
		System.out.println("Stadium capacity:"+stadium.capacity);
		System.out.println("Stadium is created using capacity as argument");
		System.out.println("------------------");
	}
	
	static void getStadium(String name,int capacity)
	{
		System.out.println("Create a new stadium with name:"+name+"and capacity:"+capacity);
		Stadium stadium=new Stadium(name,capacity);
		System.out.println("Stadium name:"+stadium.name);
		System.out.println("Stadium capacity:"+stadium.capacity);
		System.out.println("Stadium is created using name and capacity as argument");
		System.out.println("------------------");
	}
}