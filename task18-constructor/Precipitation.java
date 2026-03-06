class Precipitation{
    String type;
    Precipitation(String type){
        System.out.println("Executing Precipitation Constructor");
        this.type = type;
    }
	
	void getPrecepitation()
	{
		System.out.println("Cloud precipitation type:"+this.type);
	}
}