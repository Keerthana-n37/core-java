class BirdLifeSpan{
	public static int getLifeSpanByName(String name)
	{
		if(name==null)
		{
			System.out.println("Invalid data name should not be null");
			return 0;
		}
		if(name=="Parrot")
		{
			return 20;
		}
		if(name=="Peacock")
		{
			return 15;
		}
		if(name=="Crow")
		{
			return 14;
		}
		if(name=="Sparrow")
		{
			return 5;
		}
		if(name=="Pigeon")
		{
			return 6;
		}
		if(name=="Flamingo")
		{
			return 30;
		}
		if(name=="Eagle")
		{
			return 25;
		}
		if(name=="Owl")
		{
			return 12;
		}
		if(name=="Kingfisher")
		{
			return 8;
		}
		if(name=="WoodPecker")
		{
			return 10;
		}
		if(name=="Duck")
		{
			return 10;
		}
		if(name=="Hen")
		{
			return 7;
		}
		if(name=="Swan")
		{
			return 20;
		}
		if(name=="Penguin")
		{
			return 20;
		}
		if(name=="Vulture")
		{
			return 16;
		}
		if(name=="Falcon")
		{
			return 18;
		}
		if(name=="Hawk")
		{
			return 15;
		}
		if(name=="Robin")
		{
			return 2;
		}
		if(name=="Canary")
		{
			return 10;
		}
		if(name=="Kite")
		{
			return 14;
		}
		System.out.println("Bird not found in the database");
		return 0;
	}
}
