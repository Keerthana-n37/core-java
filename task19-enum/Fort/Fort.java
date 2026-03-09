class Fort
{ 
    int height;
	String fortName;
	Guard chiefGuard;
	FortType fortType;
	
	Fort(int height,String fortName,Guard chiefGuard,FortType fortType)
	{
		this.height=height;
		this.fortName=fortName;
		this.chiefGuard=chiefGuard;
		this.fortType=fortType;
	}
	
	
	void printInfo()
	{
		System.out.println("Height:"+this.height);
		System.out.println("Fort Name:"+this.fortName);
		
		if(this.chiefGuard!=null)
		{
			this.chiefGuard.aboutGuard();
		}
		else{
			System.out.println("Cheif guard is null");
		}
		
		System.out.println("Fort type:"+this.fortType);
		System.out.println("--------------------");
	}
}