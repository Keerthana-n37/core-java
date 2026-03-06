class Audience{
    String name;
    Audience(String name){
        System.out.println("Executing Audience Constructor");
        this.name = name;
    }
	
	void getAudience()
	{
		System.out.println("Bell audience name:"+this.name);
	}
}