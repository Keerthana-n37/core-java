class LeafExpert{
	String fullName;
	LeafExpert(String fullName)
	{
		System.out.println("Executing LeafExpert constructor");
		this.fullName=fullName;
	}
	
	void getExpert()
	{
		System.out.println("Tea making expert name is:"+this.fullName);
	}
}