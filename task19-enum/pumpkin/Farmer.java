class Farmer{
	
	String farmerName;
	int experienceYears;
	
	Farmer(String farmerName,int experienceYears)
	{
		this.farmerName=farmerName;
		this.experienceYears=experienceYears;
	}
	
	void aboutFarmer()
	{
		System.out.println("Farmer Name:"+this.farmerName);
		System.out.println("Experince of farmer:"+this.experienceYears);
	}
}
