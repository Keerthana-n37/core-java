class Support{
    String type;
    Support(String type){
        System.out.println("Executing Support Constructor");
        this.type = type;
    }
	
	void getSupport()
	{
		System.out.println("Bell support type is:"+this.type);
	}
}