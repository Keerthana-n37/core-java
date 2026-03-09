class Speaker{
	
	int yearOfExperience;
	String constituency;
	
	Speaker(int yearOfExperience,String constituency)
	{
		this.yearOfExperience=yearOfExperience;
		this.constituency=constituency;
	}
	
	void aboutSpeaker()
	{
		System.out.println("Years of Experience:"+this.yearOfExperience);
		System.out.println("Constituency:"+this.constituency);
	}
}