class Manager{
	String managerName;
	int yearOfExperience;
	
	Manager(String managerName, int yearOfExperience)
	{
		this.managerName=managerName;
		this.yearOfExperience=yearOfExperience;
	}
	
	void aboutManager()
	{
		System.out.println("Manager Name:"+this.managerName);
		System.out.println("Years of experience:"+this.yearOfExperience);
	}
}