class Tone{
    String description;
    Tone(String description){
        System.out.println("Executing Tone Constructor");
        this.description = description;
    }
	
	void getTone()
	{
		System.out.println("Bell tone description is:"+this.description);
	}
}