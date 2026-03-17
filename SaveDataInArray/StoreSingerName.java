class StoreSingerName
{
	String[] singerNames;
	int currentIndex=0;
	
	StoreSingerName(String[] singerNames)
	{
		this.singerNames=singerNames;
	}
	
	void addSingerName(String singerName)
	{
		System.out.println("Executing addSingerName in StoreSinger");
		System.out.println("Singer name:"+singerName);
		
		if(this.singerNames!= null)
		{
			int index = this.singerNames.length-1;
			System.out.println("Storing the singerName,length of the singerNames array is:"+index);

            if (this.currentIndex <= index) 
		    {
				this.singerNames[this.currentIndex] = singerName; 
				System.out.println("Singer name is stored in index: " + this.currentIndex);
				currentIndex++;
				System.out.println("Storing another singerName in this index: " + this.currentIndex);
            } 
		    else{
                System.out.println("singerNames array is full, cannot store further singerName");
            }
		}
		else{
            System.out.println("singerNames array is null");
        }	
	}
	
	boolean searchSingerName(String singerName)
	{
		if(singerName != null)
		{
			System.out.println("Searching for the " + singerName + " in array");

			if(this.singerNames != null)
			{
				System.out.println("Searching starts by comparing the names in array");

				for(String name : this.singerNames)
				{
					System.out.println("Comparing " + singerName + " with " + name);

					if(name == singerName)
					{
						System.out.println("Name found in the array...");
						return true;
					}
				}

				System.out.println("Name not found in the array...");
			}
			else{
				System.out.println("singerNames array is null");
			}
		}
		else{
			System.out.println("singerName is null, search cannot be done");
		}
		return false;
	}
	
	boolean update(int index, String newName)
    {
        System.out.println("Update by Index");

        if(this.singerNames != null)
        {
            if(index >= 0 && index < this.singerNames.length)
            {
                if(newName != null)
                {
                    System.out.println("Old value: " + this.singerNames[index]);
                    this.singerNames[index] = newName;
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

        if(this.singerNames != null)
        {
            if(oldName != null && newName != null)
            {
                int index = 0;
                for(String name : this.singerNames)
                {
                    if(name != null && name == oldName)
                    {
                        this.singerNames[index] = newName;
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

        if(this.singerNames != null)
        {
            if(index >= 0 && index < this.singerNames.length)
            {
                if(this.singerNames[index] != null)
                {
                    String deleted = this.singerNames[index];
                    this.singerNames[index] = null;
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

        if(this.singerNames != null)
        {
            if(name != null)
            {
                int index = 0;
                for(String value : this.singerNames)
                {
                    if(value != null && value == name)
                    {
                        String deleted = this.singerNames[index];
                        this.singerNames[index] = null;
                        System.out.println("Deleted: " + deleted + " at index: " + index);
                        return deleted;
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