class Certification{
	String certificateName;
	int year;
	
	Certification(String certificateName,int year)
	{
		this.certificateName=certificateName;
		this.year=year;
	}
	
	void getCertification()
	{
		System.out.println("Coach certification Name: " + this.certificateName);
        System.out.println("Coach certification Year: " + this.year);
	}
}