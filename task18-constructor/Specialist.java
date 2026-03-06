class Specialist{
	
	String name;
	
	Specialist(String name){
		System.out.println("Executing specialist constructor");
		this.name=name;
	}
	
	void getSpecialist()
	{
		System.out.println("Specialist name:"+this.name);
	}
}
