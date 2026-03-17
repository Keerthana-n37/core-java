class StorePasta
{
	String[] pastaNames;
	int currentIndex;
	
	StorePasta(String[] pastaNames)
	{
		this.pastaNames= pastaNames;
	}
	
	void getPastaName(String pastaName)
	{
		System.out.println("Executing the getPastaName in StorePasta");
		System.out.println("Pasta name:"+pastaName);
		
		if(this.pastaNames!=null)
		{
			int index=this.pastaNames.length-1;
			System.out.println("Storing the pastaName,length of the array is:"+index);
			
			if(this.currentIndex<=index)
			{
				this.pastaNames[currentIndex]=pastaName;
				System.out.println("pasta name Stored in index:"+this.currentIndex);
				currentIndex++;
				System.out.println("Storing another pastaName in index:"+this.currentIndex);
			}
			else{
				System.out.println("Pasta array full");
			}
		}
		else{
			System.out.println("Pasta array null");
		}
	}
	
	boolean searchPastaName(String pastaName)
	{
		if(pastaName!=null)
		{
			System.out.println("Searching for the "+pastaName+" in array");
			if(this.pastaNames!=null)
			{
				System.out.println("Searching starts by comparing the names in array");
				for(String name: this.pastaNames)
				{
					System.out.println("Comparing "+pastaName+" with "+name);
					if(name == pastaName)
					{
						System.out.println("Name found in the array...");
						return true;
					}
				}	
				System.out.println("Name not found in the array...");				
			}
			else{
				System.out.println("pastaNames array is null");
			}
		}
		else{
			System.out.println("pastaName is null search operation cannot be done");
		}
		return false;
	}
	
	
    boolean update(int index, String newName)
    {
        System.out.println("Update by Index Operation");

        if(this.pastaNames != null)
        {
            if(index >= 0 && index < this.pastaNames.length)
            {
                if(newName != null)
                {
                    System.out.println("Old value at index " + index + ": " + this.pastaNames[index]);
                    this.pastaNames[index] = newName;
                    System.out.println("Updated to: " + newName);
                    return true;
                }
                else
                {
                    System.out.println("New name is null. Cannot update.");
                }
            }
            else
            {
                System.out.println("Invalid index. Update failed.");
		    }
        }
        else
        {
            System.out.println("Array is null. Update not possible.");
        }

        return false;
    }
	
	boolean update(String newName, String oldName)
	{
		System.out.println("Update by Name Operation");

		if(this.pastaNames != null)
		{
			if(newName != null && oldName != null)
			{
				int index = 0;

				for(String name : this.pastaNames)
				{
					System.out.println("Checking index " + index + ": " + name);

					if(name != null && name == oldName)
					{
						System.out.println("Match found at index: " + index);
						System.out.println("Old value: " + this.pastaNames[index]);

						this.pastaNames[index] = newName;

						System.out.println("Updated to: " + newName);
						return true;
					}
					index++;
				}

				System.out.println("Old name not found, cannot update");
			}
			else
			{
				System.out.println("New name or old name is null, cannot update");
			}
		}
		else
		{
			System.out.println("Array is null, cannot update");
		}

		return false;
	}

    String delete(int index)
    {
        System.out.println("Delete by Index Operation");

        if(this.pastaNames != null)
        {
            if(index >= 0 && index < this.pastaNames.length)
            {
                if(this.pastaNames[index] != null)
                {
                    String deleted = this.pastaNames[index];
                    this.pastaNames[index] = null;

                    System.out.println("Deleted " + deleted + " from index: " + index);
                    return deleted;
				}
                else
                {
                    System.out.println("No value present at index: " + index);
                }
            }
            else
            {
                System.out.println("Invalid index. Delete failed.");
            }
        }
        else
        {
            System.out.println("Array is null. Cannot delete.");
        }

        return null;
    }

    String delete(String name)
    {
        System.out.println("Delete by Name Operation");

        if(this.pastaNames != null)
	    {
            if(name != null)
            {
                int index = 0;

                for(String value : this.pastaNames)
                {
                    System.out.println("Checking index " + index + ": " + value);

                    if(value != null && value == name)
                    {
                        String deleted = this.pastaNames[index];
                        this.pastaNames[index] = null;

                        System.out.println("Deleted '" + deleted + "' from index: " + index);
                        return deleted;
                    }
                    index++;
                }

                System.out.println("Pasta name not found. Delete failed.");
            }
			else
            {
                System.out.println("Given name is null. Cannot delete.");
            }
        }
        else
        {
            System.out.println("Array is null. Cannot delete.");
        }

        return null;
    }
}