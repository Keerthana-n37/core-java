class Wire{
	double length;
	String material;
	boolean flexible;
	
	Wire(double length,String material,boolean flexible)
	{
		this.length=length;
		this.material=material;
		this.flexible=flexible;
		System.out.println("Wire class is executing....");
		System.out.println("Wire length:"+length);
		System.out.println("Wire material:"+material);
		System.out.println("Wire is flexible:"+flexible);
		System.out.println("--------------------");
	}
}