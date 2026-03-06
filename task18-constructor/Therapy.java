class Therapy{
	
	String type;
	
	Therapy(String type){
		System.out.println("Executing therapy constructor");
		this.type=type;
	}
	
	void getTherapy()
	{
		System.out.println("Therapy type:"+this.type);
	}
}