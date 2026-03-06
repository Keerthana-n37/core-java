class Lighting{
    String style;
    Lighting(String style){
        System.out.println("Executing Lighting Constructor");
        this.style = style;
    }
	
	void getDetails()
	{
		System.out.println("Aquarium lighting style:"+this.style);
	}
}