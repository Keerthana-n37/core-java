class Biscuit{
	
	static double getCost(String name)
	{
		System.out.println("Executing the getCost method in Biscuit...");
		System.out.println("Biscuit name:"+name);
		if(name==null)
		{
			System.out.println("Invalid data,biscuit name cannot be null");
			return 0;
		}
		if(name=="UNIBIC")
		{
		 return 20;
		}
		if(name=="OREO")
		{
			return 10;
		}
		if(name=="DARK FANTASY")
		{
			return 5;
		}
		if(name=="PARLE-G")
		{
			return 10;
		}
		System.out.println(name+"not found in the database....");
		return 0;
	}
	
	static String getShape(String name)
    {  
	    System.out.println("Executing the getShape method in Biscuit...");
		System.out.println("Biscuit name:"+name);
		if(name==null)
		{
			System.out.println("Invalid data,biscuit name cannot be null");
			return null;
		}
		if(name=="UNIBIC")
		{
		 return "circle";
		}
		if(name=="OREO")
		{
			return "double circle with creamy layer in middle";
		}
		if(name=="DARK FANTASY")
		{
			return "circle with chacolate inside ";
		}
		if(name=="PARLE-G")
		{
			return "rectangle";
		}
		System.out.println(name+"not found in the database....");
		return null;
	}
	
	static String[] getFlavours(String name)
	{
		System.out.println("Executing getShape in Biscuit...");
		System.out.println("Name : "+name);
		if(name==null)
		{
			System.out.println("Name is invalid..");
			return null;
		}
		
		if(name=="UNIBIC")
		{
			String[] unibicFlavour={"Fruit and Nut", "Choco Chip", "Cashew"};
			return unibicFlavour;
		}
		if(name=="OREO")
		{
			String[] oreoFlavours={"Vanilla","Strawberry","Toffee","Red Velvet","Mint choco pie"};
			return oreoFlavours;
		}
		if(name=="DARK FANTASY")
		{
			String[] darkFantasyFlavours={"chocolate","Mint chocolate","Dark Chocolate"};
			return darkFantasyFlavours;
		}
		if(name=="PARLE-G")
		{
			String[] parleGFlavour={"Regular","Vanilla"};
			return parleGFlavour;
		}

		System.out.println(name+" is not found in the database...");	
		return null;
	}
	
}