class Atmosphere{
    String condition;
    Atmosphere(String condition){
        System.out.println("Executing Atmosphere Constructor");
        this.condition = condition;
    }
	
	void getAtmosphere()
	{
		System.out.println("Atmosphere condition:"+this.condition);
	}
}