class Award{
	String awardName;
	int year;
	
	Award(String awardName,int year)
	{
		this.awardName=awardName;
		this.year=year;
	}
	
	void getAward()
	{
		System.out.println("Award Name: " + this.awardName);
        System.out.println("Award Year: " + this.year);
	}
}