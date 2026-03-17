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
	
	boolean update(int index, String newName)
    {
        System.out.println("Update by Index");
        if(this.modelNames != null)
        {
            if(index >= 0 && index < this.modelNames.length)
            {
                if(newName != null)
                {
                    System.out.println("Old value at index " + index + ": " + this.modelNames[index]);
                    this.modelNames[index] = newName;
                    System.out.println("Updated to: " + newName);
                    return true;
                }
                else{
                    System.out.println("New name is null");
                }
            }
            else{
                System.out.println("Invalid index");
            }
        }
        else{
            System.out.println("Array is null");
        }
        return false;
    }

    boolean update(String oldName, String newName)
    {
        System.out.println("Update by Name");
        if(this.modelNames != null)
        {
            if(oldName != null && newName != null)
            {
                int index = 0;
                for(String tempName : this.modelNames)
                {
                    if(tempName != null && tempName == oldName)
                    {
                        this.modelNames[index] = newName;
                        System.out.println("Updated " + oldName + " to " + newName);
                        return true;
                    }
                    index++;
                }
                System.out.println("Old name not found");
            }
            else{
                System.out.println("Names cannot be null");
            }
        }
        else{
            System.out.println("Array is null");
        }
        return false;
    }

    String delete(int index)
    {
        System.out.println("Delete by Index");
        if(this.modelNames != null)
        {
            if(index >= 0 && index < this.modelNames.length)
            {
                if(this.modelNames[index] != null)
                {
                    String deleted = this.modelNames[index];
                    this.modelNames[index] = null;
                    System.out.println("Deleted: " + deleted + " at index: " + index);
                    return deleted;
                }
                else{
                    System.out.println("No value at index");
                }
            }
            else{
                System.out.println("Invalid index");
            }
        }
        else{
            System.out.println("Array is null");
        }
        return null;
    }

    String delete(String name)
    {
        System.out.println("Delete by Name");
        if(this.modelNames != null)
        {
            if(name != null)
            {
                int index = 0;
                for(String tempName : this.modelNames)
                {
                    if(tempName != null && tempName == name)
                    {
                        this.modelNames[index] = null;
                        System.out.println("Deleted: " + name + " at index: " + index);
                        return name;
                    }
                    index++;
                }
                System.out.println("Name not found");
            }
            else{
                System.out.println("Name is null");
            }
        }
        else{
            System.out.println("Array is null");
        }
        return null;
    }
}