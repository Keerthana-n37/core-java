class FarmerStore
{
	Farmer[] farmerList;
	int currentIndex= 0;
	
	FarmerStore(Farmer[] farmerList)
	{
		this.farmerList=farmerList;
	}
	
	void saveFarmer(Farmer farmer)
	{
		System.out.println("Running saveFarmer method in FarmerStore");
		
		if(this.farmerList!=null && farmer!=null)
		{
			int index= this.farmerList.length-1;
			
		    if(currentIndex <= index)
			{
				this.farmerList[this.currentIndex] = farmer;
				System.out.println("Farmer saved at index: "+this.currentIndex);
				this.currentIndex++;
				
				farmer.displayFarmerDetails();
			}
			else
			{
				System.out.println("Farmer array is full");
			}
		}
		else{
			System.out.println("Farmer array or farmer is null cannot do store operation");
		}
	}
}