class GumStore
{
	Gum[] gumList;
	int currentIndex=0;
	
	GumStore(Gum[] gumList)
	{
		this.gumList=gumList;
	}
	
	void saveGum(Gum gum)
	{
		System.out.println("running saveGum method in GumStore");
		
		if(this.gumList!=null && gum!=null)
		{
			int index=this.gumList.length-1;
			
			if(this.currentIndex<= index)
			{
				this.gumList[this.currentIndex] =gum;
				System.out.println("Gum stored at index: "+this.currentIndex);
				this.currentIndex++;
				
				gum.displayGumDetails();
			}
			else{
				System.out.println("gum array is full");
			}
		}else{
			System.out.println("Gum array or gum is null cannot do save operation");
		}
	}
}