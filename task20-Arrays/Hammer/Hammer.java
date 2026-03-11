class Hammer
{
	boolean[] heavy;
	Handle[] handles;
	
	Hammer(boolean[] heavy, Handle[] handles)
	{
		this.heavy = heavy;
		this.handles = handles;
	}
	
	void display()
	{
		System.out.println("Hammer information");
		
		if(this.heavy!= null)
		{
			System.out.println("Total Hammer:"+this.heavy.length);
			
			for(boolean heavy: this.heavy)
			{
				System.out.println("Is heavy:"+heavy);
			}
		}
		else{
			System.out.println("Heavy is null");
		}
		
		if(this.handles!=null)
		{
			System.out.println("Total Handles:"+this.handles.length);
			for(Handle handle: handles)
			{
				System.out.println("Handle Material:"+handle.material);
				System.out.println("Handle Length:"+handle.length);
			}
		}
		else{
			System.out.println("Handles are null");
		}
	}
}