class StoreScooterNames
{
	String[] scooterNames;
	int currentIndex;
	
	StoreScooterNames(String[] scooterNames)
	{
		this.scooterNames = scooterNames;
	}
	
	void getScooterName(String scooterName)
	{
		System.out.println("Executing the getScooterName in StoreScooterNames");
		System.out.println("Scooter name:" + scooterName);
		
		if(this.scooterNames != null)
		{
			int index = this.scooterNames.length - 1;
			System.out.println("Length:" + index);
			
			if(this.currentIndex <= index)
			{
				this.scooterNames[currentIndex] = scooterName;
				System.out.println("Scooter stored at:" + this.currentIndex);
				currentIndex++;
				System.out.println("Storing another scooterName in index:" + this.currentIndex);
			}
			else{
				System.out.println("scooterNames array is full");
			}
		}
		else{
			System.out.println("scooterNames array null");
		}
	}
	
	boolean searchScooterName(String scooterName)
	{
		if(scooterName != null)
		{
			System.out.println("Searching for the " + scooterName + " in array");
			
			if(this.scooterNames != null)
			{
				System.out.println("Searching starts by comparing the names in array");
				
				for(String name : this.scooterNames)
				{
					System.out.println("Comparing " + scooterName + " with " + name);
					
					if(name == scooterName)
					{
						System.out.println("Name found in the array...");
						return true;
					}
				}
				
				System.out.println("Name not found in the array...");
			}
			else{
				System.out.println("scooterNames array is null");
			}
		}
		else{
			System.out.println("scooterName is null, search cannot be done");
		}
		return false;
	}
}