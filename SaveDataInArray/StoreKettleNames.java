class StoreKettleNames
{
	String[] kettleNames;
	int currentIndex;
	
	StoreKettleNames(String[] kettleNames)
	{
		this.kettleNames=kettleNames;
	}
	
	void getKettleName(String kettleName)
	{
		System.out.println("Executing the getKettleName in StoreKettleNames");
		System.out.println("Kettle name:" + kettleName);
		
		if(this.kettleNames != null)
		{
			int index = this.kettleNames.length - 1;
			System.out.println("Length:" + index);
			
			if(this.currentIndex <= index)
			{
				this.kettleNames[currentIndex] = kettleName;
				System.out.println("Kettle stored at:" + this.currentIndex);
				currentIndex++;
				System.out.println("Storing another kettleName in index:" + this.currentIndex);
			}
			else{
				System.out.println("kettleNames array is full");
			}
		}
		else{
			System.out.println("kettleNames array null");
		}
	}
	
	boolean searchKettleName(String kettleName)
	{
		if(kettleName!=null)
		{
			System.out.println("Searching for the "+kettleName+" in array");
			if(this.kettleNames!=null)
			{
				System.out.println("Searching starts by comparing the names in array");
				
				for(String name: this.kettleNames)
				{
					System.out.println("Comparing "+kettleName+" with "+name);
					
					if(name == kettleName)
					{
						System.out.println("Name found in the array...");
						return true;
					}
				}	
              System.out.println("Name not found in the array...");				
			}
			else{
				System.out.println("kettleNames array is null");
			}
		}
		else{
			System.out.println("kettleName is null search operation cannot be done");
		}
		return false;
	}
}