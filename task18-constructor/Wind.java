class Wind{
    String description;
    Wind(String description){
        System.out.println("Executing Wind Constructor");
        this.description = description;
    }
	
	void getWindDetails()
	{
		System.out.println("Wind description:"+this.description);
	}
}