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
}