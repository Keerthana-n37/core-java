class StoreTreeNames
{
	String[] treeNames;
	int currentIndex;
	
	StoreTree(String[] treeNames)
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
				System.out.println("Storing another treeName in index:"this.currentIndex);
			}
			else{
				System.out.println("treeNames array is full");
			}
		}
		else{
			System.out.println("treeNames array null");
		}
	}
}