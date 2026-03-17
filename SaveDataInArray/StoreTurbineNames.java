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
	
	boolean searchTurbineName(String turbineName)
	{
		if(turbineName != null)
		{
			System.out.println("Searching for the " + turbineName + " in array");

			if(this.turbineNames != null)
			{
				System.out.println("Searching starts by comparing the names in array");

				for(String name : this.turbineNames)
				{
					System.out.println("Comparing " + turbineName + " with " + name);

					if(name == turbineName)
					{
						System.out.println("Name found in the array...");
						return true;
					}
				}

				System.out.println("Name not found in the array...");
			}
			else{
				System.out.println("turbineNames array is null");
			}
		}
		else{
			System.out.println("turbineName is null, search cannot be done");
		}
		return false;
	}
	
	
	boolean searchTwoWheelerName(String name)
    {
        if(name != null)
        {
            System.out.println("Searching for " + name + " in array");

            if(this.twoWheelerNames != null)
            {
                System.out.println("Comparing names in the array:");

                for(String tempName : this.twoWheelerNames)
                {
                    System.out.println("Comparing " + name + " with " + tempName);

                    if(tempName == name) 
                    {
                        System.out.println("Name found in the array...");
                        return true;
                    }
                }

                System.out.println("Name not found in the array...");
            }
            else
            {
                System.out.println("twoWheelerNames array is null");
            }
        }
        else
        {
            System.out.println("twoWheelerName is null, search cannot be done");
        }
        return false;
    }
}