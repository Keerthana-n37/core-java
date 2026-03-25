class CloudSoftwareStore
{
	CloudSoftware[] softwareList;
	int currentIndex=0;
	
	CloudSoftwareStore(CloudSoftware[] softwareList)
	{
		this.softwareList=softwareList;
	}
	
	void saveSoftware(CloudSoftware software)
	{
		System.out.println("Running saveSoftware in CloudSoftwareStore");
		
		if(this.softwareList!=null && software!=null)
		{
			int index=this.softwareList.length-1;
			
			if(currentIndex<= index)
			{
				this.softwareList[this.currentIndex] = software;
				System.out.println("Software saved at index: "+this.currentIndex);
				this.currentIndex++;
				software.displaySoftwareDetails();
			}
			else{
				System.out.println("CloudSoftware storage is full cannot be save into this array");
			}
		}
		else{
			System.out.println("CloudSoftware array or software object is null");
		}
	}
}