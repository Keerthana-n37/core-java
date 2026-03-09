class Court
{
	int caseCapacity;
	Judge judge;
	CourtCategory courtCategory;
	
	Court(int caseCapacity,Judge judge,CourtCategory courtCategory)
	{
		this.caseCapacity=caseCapacity;
		this.judge=judge;
		this.courtCategory=courtCategory;
	}
	
	void printInfo()
	{
		System.out.println("Case Capacity:"+this.caseCapacity);
		
		if(this.judge!=null)
		{
			this.judge.judgeDeatils();
		}
		else
		{
			System.out.println("Judge is null");
		}
		System.out.println("Court category:"+this.courtCategory);
		System.out.println("---------------------");
	}
}