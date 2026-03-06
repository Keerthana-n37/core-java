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
		System.out.println("Button color:"+color);
		System.out.println("Is button working:"+isWorking);
		System.out.println("Button size:"+size);
		System.out.println("--------------------");
	}
}