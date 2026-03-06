class ScrollWheel{
	
	String type;
	boolean smooth;
	
	ScrollWheel(String type,boolean smooth)
	{
		this.type=type;
		this.smooth=smooth;
		
		System.out.println("ScrollWheel class is executing..");
		System.out.println("ScrollWheel type:"+type);
		System.out.println("ScrollWheel is smooth:"+smooth);
		System.out.println("--------------------");
	}
}