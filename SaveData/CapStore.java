class CapStore
{
	Cap[] caps;
	int currentIndex=0;
	
	CapStore(Cap[] caps)
	{
		this.caps=caps;
	}
	
	void saveCap(Cap cap)
	{
		System.out.println("Executing saveCap method");
		
		if(this.caps!= null && cap!=null)
		{
			System.out.println("Array is not null");
			System.out.println("Cap is not null");
			
			int index= this.caps.length-1;
			
			if(currentIndex <= index)
			{
				this.caps[this.currentIndex]=cap;
				System.out.println("Cap details are saved at index:"+this.currentIndex);
				this.currentIndex++;
				cap.displayCapDetails();
			}
			else{
				System.out.println("Array is full,cannot store");
			}
		}else{
			System.out.println("Cap array is null and cap is also null");
		}
	}
}