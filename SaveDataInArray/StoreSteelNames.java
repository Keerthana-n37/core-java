class StoreSteelNames
{
	String[] steelNames;
	int currentIndex;
	
	StoreSteelNames(String[] steelNames)
	{
		this.steelNames= steelNames;
	}
	
	void getSteelName(String steelName)
	{
		System.out.println("Execting the getSteelName in StoreSteelNames");
		System.out.println("Steel name:"+steelName);
		
		if(this.steelNames!=null)
		{
			int index= this.steelNames.length-1;
			System.out.println("Length:"+index);
			
			if(this.currentIndex<= index)
			{
				this.steelNames[currentIndex]= steelName;
				System.out.println("Steel stored at:"+this.currentIndex);
				currentIndex++;
				System.out.println("Storing another steelName in index:"+this.currentIndex);
			}
			else{
				System.out.println("steelNames array is full");
			}
		}
		else{
			System.out.println("steelNames array is null");
		}
	}
}