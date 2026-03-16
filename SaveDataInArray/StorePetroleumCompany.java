class StorePetroleumCompany
{
	String[] companyNames;
	int currentIndex;
	
	StorePetroleumCompany(String[] companyNames)
	{
		this.companyNames=companyNames;
	}
	
	void getCompanyName(String companyName)
	{
		System.out.println("Executing the getCompanyName in StorePetroleumCompany");
		System.out.println("Company name:"+companyName);
		
		if(this.companyNames!=null)
		{
			int index = this.companyNames.length-1;
			System.out.println("Storing the companyName,length of the companyNames array is:"+index);
			
			
			if(this.currentIndex <= index)
			{
				this.companyNames[currentIndex]=companyName;
				System.out.println("Company name is stored in index:"+this.currentIndex);
				currentIndex++;
				System.out.println("Storing another companyName in this index:"+this.currentIndex);
			}
			else{
				System.out.println("companyNames array is full cannot store further companyName");
			}
		}
		else{
			System.out.println("companyNames array is null");
		}
	}

	boolean searchCompanyName(String companyName)
	{
		if(companyName!=null)
		{
			System.out.println("Searching for the "+companyName+" in array");
			
			if(this.companyNames!=null)
			{
				System.out.println("Searching starts by comparing the names in array");
				
				for(String name : this.companyNames)
				{
					System.out.println("Comparing "+companyName+" with "+name);
					
					if(name == companyName)
					{
						System.out.println("Name found in the array...");
						return true;
					}
				}
				
				System.out.println("Name not found in the array...");
			}
			else{
				System.out.println("companyNames array is null");
			}
		}
		else{
			System.out.println("companyName is null search operation cannot be done");
		}
		return false;
	}	
}