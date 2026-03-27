class Gender
{
	static String[] genders= {"Male","Female","Others"};
	
	static void sortAsc()
	{
		System.out.println("Executing sortAsc in Gender");
		for(int index=0;index<genders.length;index++)
		{
			for(int otherIndex=0;otherIndex<genders.length;otherIndex++)
			{
				if(genders[index].charAt(0)> genders[otherIndex].charAt(0))
				{
					String temp= genders[index];
					genders[index]= genders[otherIndex];
					genders[otherIndex]=temp;
				}
			}
		}
	}
	
	static void sortDesc()
	{
		System.out.println("Executing sortDesc in Gender");
		for(int index=0;index<genders.length;index++)
		{
			for(int otherIndex=0;otherIndex<genders.length;otherIndex++)
			{
				if(genders[index].charAt(0)< genders[otherIndex].charAt(0))
				{
					String temp=  genders[index];
					genders[index]= genders[otherIndex];
					genders[otherIndex]= temp;
				}
			}
		}
	}
	
	static void display()
	{
		System.out.println("Executing display method in Gender");
		for(String gender: genders)
		{
			System.out.println(gender);
			System.out.println("---------------------");
		}
	}
}