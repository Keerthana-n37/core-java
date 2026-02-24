class Bird{
	public static String getColorByName(String name)
	{
		if(name==null)
		{
			System.out.println("Invalid data name should not be null");
			return null;
		}
		if(name=="Parrot")
		{
			return "Green";
		}
		if(name=="Peacock")
		{
			return "Blue";
		} 
		if(name=="Crow")
		{
			return "Black";
		}
		if(name=="Sparrow")
		{
			return "Brown";
		}
		if(name=="Pigeon")
		{
			return "Grey";
		}
		if(name=="Flamingo")
		{
			return "Pink";
		}
		if(name=="Eagle")
		{
			return "Dark Brown";
		}
		if(name=="Owl")
		{
			return "White";
		}
		if(name=="Kingfisher")
		{
			return "Blue and Orange";
		}
		if(name=="WoodPecker")
		{
			return "Red and Black";
		}
		if(name=="Duck")
		{
			return "White";
		}
		if(name=="Hen")
		{
			return "Brown";
		}
		if(name=="Swan")
		{
			return "White";
		}
		if(name=="Penguin")
		{
			return "Black and white";
		}
		if(name=="Vulture")
		{
			return "Dark Grey";
		}
		if(name=="Falcon")
		{
			return "Grey";
		}
		if(name=="Hawk")
		{
			return "Brown";
		}
		if(name=="Robin")
		{
			return "Red";
		}
		if(name=="Canary")
		{
			return "Yellow";
		}
		if(name=="Kite")
		{
			return "Brown";
		}
		System.out.println("Bird not found in the database");
		return null;
	}
}
