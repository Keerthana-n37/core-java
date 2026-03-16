class StorePasta
{
	String[] pastaNames;
	int currentIndex;
	
	StorePasta(String[] pastaNames)
	{
		this.pastaNames= pastaNames;
	}
	
	void getPastaName(String pastaName)
	{
		System.out.println("Executing the getPastaName in StorePasta");
		System.out.println("Pasta name:"+pastaName);
		
		if(this.pastaNames!=null)
		{
			int index=this.pastaNames.length-1;
			System.out.println("Storing the pastaName,length of the array is:"+index);
			
			if(this.currentIndex<=index)
			{
				this.pastaNames[currentIndex]=pastaName;
				System.out.println("pasta name Stored in index:"+this.currentIndex);
				currentIndex++;
				System.out.println("Storing another pastaName in index:"+this.currentIndex);
			}
			else{
				System.out.println("Pasta array full");
			}
		}
		else{
			System.out.println("Pasta array null");
		}
	}
	
	boolean searchPastaName(String pastaName)
	{
		if(pastaName!=null)
		{
			System.out.println("Searching for the "+pastaName+" in array");
			if(this.pastaNames!=null)
			{
				System.out.println("Searching starts by comparing the names in array");
				for(String name: this.pastaNames)
				{
					System.out.println("Comparing "+pastaName+" with "+name);
					if(name == pastaName)
					{
						System.out.println("Name found in the array...");
						return true;
					}
				}	
				System.out.println("Name not found in the array...");				
			}
			else{
				System.out.println("pastaNames array is null");
			}
		}
		else{
			System.out.println("pastaName is null search operation cannot be done");
		}
		return false;
	}
		
}