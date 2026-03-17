class StoreTwoWheelerNames 
{
    String[] modelNames;
    int currentIndex;

    StoreTwoWheelerNames(String[] modelNames) 
	{
        this.modelNames = modelNames;
        this.currentIndex = 0;
    }

    void storeModelName(String modelName) 
    {
		System.out.println("Executing storeModelName in StoreTwoWheelerNames");
		System.out.println("Model name: " + modelName);

		if (this.modelNames != null) 
		{
			int index = this.modelNames.length - 1;
			System.out.println("Storing the storeModelName, length of the modelNames array is: " + index);

			if (this.currentIndex <= index) 
			{
				this.modelNames[this.currentIndex] = modelName; 
				System.out.println("Model name is stored in index: " + this.currentIndex);
				currentIndex++;
				System.out.println("Storing another modelName in this index: " + this.currentIndex);
			} 
			else 
			{
				System.out.println("modelNames array is full, cannot store further modelName");
			}
		} 
		else 
		{
			System.out.println("modelNames array is null");
		}	
    }
	
	boolean searchTwoWheelerName(String name)
    {
        if(name != null)
        {
            System.out.println("Searching for " + name + " in array");

            if(this.modelNames != null)
            {
                System.out.println("Comparing names in the array:");

                for(String tempName : this.modelNames)
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
                System.out.println("modelNames array is null");
            }
        }
        else
        {
            System.out.println("twoWheelerName is null, search cannot be done");
        }
        return false;
    }
}