class SoundDesigner{
    String name;
    SoundDesigner(String name){
        System.out.println("Executing SoundDesigner Constructor");
        this.name = name;
    }
	
	void getDesigner()
	{
		System.out.println("Bell sound designer:"+this.name);
	}
}