class Guard{
	String guardName;
	int experienceYears;
	
	Guard(String guardName,int experienceYears)
	{
		this.guardName=guardName;
		this.experienceYears=experienceYears;
	}
	
	void aboutGuard()
	{
		System.out.println("Guard Name:"+this.guardName);
		System.out.println("Experience years:"+this.experienceYears);
	}
}