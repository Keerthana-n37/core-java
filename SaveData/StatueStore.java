class StatueStore
{
	Statue[] statueCollection;
	int currentIndex=0;
	
	StatueStore(Statue[] statueCollection)
	{
		this.statueCollection= statueCollection;
	}
	
	void saveStatue(Statue statue)
	{
		System.out.println("Running saveStatue method in StatueStore");
		
		if(this.statueCollection!=null && statue!=null)
		{
			System.out.println("Statue array is not null hence storing statue in Statue array");
			if(this.statueCollection!=null && statue!=null)
			{
				System.out.println("Started storing in Statue array");
				
				int index=this.statueCollection.length-1;
				
				if(this.currentIndex<= index)
				{
					this.statueCollection[this.currentIndex]=statue;
					System.out.println("Statue saved at index: "+this.currentIndex);
					this.currentIndex++;
					
					statue.displayStatueDetails();
				}
				else{
					System.out.println("Statue array is full");
				}
			}
			else{
				System.out.println("Statue array is null hence cannot be stored into array");
			}
		}
	}
}