class Owner{
	String ownerName;
	String ownerEmail;
	
	Owner(String ownerName, String ownerEmail)
	{
		this.ownerName=ownerName;
		this.ownerEmail=ownerEmail;
		System.out.println("Executing owner constructor");
		System.out.println("Owner Name:"+ownerName);
		System.out.println("Owner email:"+ownerEmail);
		System.out.println("-----------------");
	}
}