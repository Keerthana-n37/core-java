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
}