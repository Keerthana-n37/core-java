class Owner{
	String ownerName;
	String ownerEmail;
	
	Owner(String ownerName, String ownerEmail)
	{
		this.ownerName=ownerName;
		this.ownerEmail=ownerEmail;
		System.out.println("Executing owner constructor");
	}
	
	void getOwner()
	{
		System.out.println("Owner Name:"+this.ownerName);
		System.out.println("Owner email:"+this.ownerEmail);
	}
}