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
				this.companyNames[index]=companyName;
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
	
}