class StoreTurbineNames
{
	String[] turbineNames;
	int currentIndex;
	
	StoreTurbineNames(String[] turbineNames)
	{
		this.turbineNames = turbineNames;
	}
	
	void getTurbineName(String turbineName)
	{
		System.out.println("Executing the getTurbineName in StoreTurbineNames");
		System.out.println("Turbine name:" + turbineName);
		
		if(this.turbineNames != null)
		{
			int index = this.turbineNames.length - 1;
			System.out.println("Length:" + index);
			
			if(this.currentIndex <= index)
			{
				this.turbineNames[currentIndex] = turbineName;
				System.out.println("Turbine stored at:" + this.currentIndex);
				currentIndex++;
				System.out.println("Storing another turbineName in index:" + this.currentIndex);
			}
			else{
				System.out.println("turbineNames array is full");
			}
		}
		else{
			System.out.println("turbineNames array null");
		}
	}
}