class Judge{
	int serviceYears;
	String specialization;
	
	Judge(int serviceYears,String specialization)
	{
		this.serviceYears=serviceYears;
		this.specialization=specialization;
	}
	
	void judgeDeatils()
	{
		System.out.println("Service years:"+this.serviceYears);
		System.out.println("Specalization:"+this.specialization);
	}
}