class Filter{
    String type;
    Filter(String type){
        System.out.println("Executing Filter Constructor");
        this.type = type;
    }
	
	void getDetails()
	{
		System.out.println("Aquarium filter type:"+this.type);
	}
}