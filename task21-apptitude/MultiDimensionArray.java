class MultiDimensionArray
{
	static int[][] numbers={
		{10,20,30},
		{40,50,60},
		{70,80,90}
	};
	
	static void display()
	{
		System.out.println("Executing display method in MultiDimensionArray");
		for(int index=0; index< numbers.length; index++)
		{
			for(int otherIndex=0; otherIndex<numbers[index].length;otherIndex++)
			{
				System.out.println(numbers[index][otherIndex]+"");
			}
			System.out.println();
		}
	}
	
}