class StoreTreeNames
{
	String[] treeNames;
	int currentIndex;
	
	StoreTreeNames(String[] treeNames)
	{
		this.treeNames=treeNames;
	}
	
	void getTreeName(String treeName)
	{
		System.out.println("Execting the getTreeName in StoreTreeNames");
		System.out.println("Tree name:"+treeName);
		
		if(this.treeNames!=null)
		{
			int index= this.treeNames.length-1;
			System.out.println("Length:"+index);
			
			if(this.currentIndex<=index)
			{
				this.treeNames[currentIndex]= treeName;
				System.out.println("Tree stored at:"+this.currentIndex);
				currentIndex++;
				System.out.println("Storing another treeName in index:"+this.currentIndex);
			}
			else{
				System.out.println("treeNames array is full");
			}
		}
		else{
			System.out.println("treeNames array null");
		}
	}
	
	boolean searchTreeName(String treeName)
	{
		if(treeName != null)
		{
			System.out.println("Searching for the " + treeName + " in array");
			if(this.treeNames != null)
			{
				System.out.println("Searching starts by comparing the names in array");
				for(String name : this.treeNames)
				{
					System.out.println("Comparing " + treeName + " with " + name);

					if(name == treeName)
					{
						System.out.println("Name found in the array...");
						return true;
					}
				}
				System.out.println("Name not found in the array...");
			}
			else{
				System.out.println("treeNames array is null");
			}
		}
		else{
			System.out.println("treeName is null, search cannot be done");
		}
		return false;
	}

	 boolean update(int index, String newName)
    {
        System.out.println("Update by Index");
        if(this.treeNames != null)
        {
            if(index >= 0 && index < this.treeNames.length)
            {
                if(newName != null)
                {
                    System.out.println("Old value: " + this.treeNames[index]);
                    this.treeNames[index] = newName;
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
        if(this.treeNames != null)
        {
            if(oldName != null && newName != null)
            {
                int index = 0;
                for(String name : this.treeNames)
                {
                    if(name != null && name == oldName)
                    {
                        this.treeNames[index] = newName;
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
        if(this.treeNames != null)
        {
            if(index >= 0 && index < this.treeNames.length)
            {
                if(this.treeNames[index] != null)
                {
                    String deleted = this.treeNames[index];
                    this.treeNames[index] = null;
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
        if(this.treeNames != null)
        {
            if(name != null)
            {
                int index = 0;
                for(String value : this.treeNames)
                {
                    if(value != null && value == name)
                    {
                        String deleted = this.treeNames[index];
                        this.treeNames[index] = null;
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