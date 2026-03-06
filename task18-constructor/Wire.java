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

	}
	
	void getWire()
	{
		System.out.println("Wire length:"+this.length);
		System.out.println("Wire material:"+this.material);
		System.out.println("Wire is flexible:"+this.flexible);
	}
}