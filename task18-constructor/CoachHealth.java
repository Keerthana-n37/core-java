class CoachHealth{
	String status;
	String lastcheckup;
	
	CoachHealth(String status,String lastcheckup)
	{
		this.status=status;
		this.lastcheckup=lastcheckup;
	}
	
	void getCoachHealth()
	{
		System.out.println("Health Status: " + this.status);
        System.out.println("Last Checkup Date: " + this.lastcheckup);
	}
}