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
				this.companyNames[currentIndex]=companyName;
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

	boolean searchCompanyName(String companyName)
	{
		if(companyName!=null)
		{
			System.out.println("Searching for the "+companyName+" in array");
			
			if(this.companyNames!=null)
			{
				System.out.println("Searching starts by comparing the names in array");
				
				for(String name : this.companyNames)
				{
					System.out.println("Comparing "+companyName+" with "+name);
					
					if(name == companyName)
					{
						System.out.println("Name found in the array...");
						return true;
					}
				}
				
				System.out.println("Name not found in the array...");
			}
			else{
				System.out.println("companyNames array is null");
			}
		}
		else{
			System.out.println("companyName is null search operation cannot be done");
		}
		return false;
	}
    
	boolean update(int index, String newName)
    {
        System.out.println(" Update by Index");

        if(this.companyNames != null)
        {
            if(index >= 0 && index < this.companyNames.length)
            {
                if(newName != null)
                {
                    System.out.println("Old value: " + this.companyNames[index]);
                    this.companyNames[index] = newName;
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
	
	boolean update(String newName, String oldName)
    {
        System.out.println("Update by Name");

        if(this.companyNames != null)
        {
            if(newName != null && oldName != null)
            {
                int index = 0;

                for(String name : this.companyNames)
                {
                    if(name != null && name == oldName)
                    {
                        this.companyNames[index] = newName;
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

        if(this.companyNames != null)
        {
            if(index >= 0 && index < this.companyNames.length)
            {
                if(this.companyNames[index] != null)
                {
                    String deleted = this.companyNames[index];
                    this.companyNames[index] = null;

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

        if(this.companyNames != null)
        {
            if(name != null)
            {
                int index = 0;

                for(String value : this.companyNames)
                {
                    if(value != null && value==name)
                    {
                        String deleted = this.companyNames[index];
                        this.companyNames[index] = null;

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