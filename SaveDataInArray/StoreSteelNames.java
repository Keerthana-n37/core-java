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
	
	boolean searchSteelName(String steelName)
	{
		if(steelName != null)
		{
			System.out.println("Searching for the " + steelName + " in array");

			if(this.steelNames != null)
			{
				System.out.println("Searching starts by comparing the names in array");

				for(String name : this.steelNames)
				{
					System.out.println("Comparing " + steelName + " with " + name);

					if(name == steelName) 
					{
						System.out.println("Name found in the array...");
						return true;
					}
				}

				System.out.println("Name not found in the array...");
			}
			else{
				System.out.println("steelNames array is null");
			}
		}
		else{
			System.out.println("steelName is null, search cannot be done");
		}
		return false;
	}
}