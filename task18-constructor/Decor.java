class Decor{
    String name;
    Decor(String name){
        System.out.println("Executing Decor Constructor");
        this.name = name;
    }
	
	void getDetails()
	{
		System.out.println("Aquarium decor name:"+this.name);
	}
}