class ClothStore
{
	Cloth[] clothItems;
	int currentIndex=0;
	
	ClothStore(Cloth[] clothItems)
	{
		this.clothItems=clothItems;
	}
	
	void saveCloth(Cloth cloth)
	{
		System.out.println("Running saveCloth method in clothStore");
		
		if(this.clothItems!=null && cloth!=null)
		{
			System.out.println("Cloth array is not null,storing the cloth details");
			int index= this.clothItems.length-1;
			
			if(currentIndex<= index)
			{
				this.clothItems[this.currentIndex]=cloth;
				System.out.println("Cloth saved at index:"+this.currentIndex);
				this.currentIndex++;
				
				cloth.displayClothDetails();
			}
			else
			{
				System.out.println("Array is full,cannot be store");
			}
		}
		else{
			System.out.println("cloth array or cloth is null");
		}
	}
}