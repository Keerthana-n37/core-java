class Button{
	String color;
	boolean isWorking;
	double size;
	
	Button(String color,boolean isWorking,double size)
	{
		this.color=color;
		this.isWorking=isWorking;
		this.size=size;
		System.out.println("Button constructor is executing..");
		
	}
	
	void getButton()
	{
		System.out.println("Button color:"+this.color);
		System.out.println("Is button working:"+this.isWorking);
		System.out.println("Button size:"+this.size);
	}
}