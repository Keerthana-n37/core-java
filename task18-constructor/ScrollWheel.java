class ScrollWheel{
	
	String type;
	boolean smooth;
	
	ScrollWheel(String type,boolean smooth)
	{
		this.type=type;
		this.smooth=smooth;
		
		System.out.println("ScrollWheel class is executing..");		
	}
	
	void getScrollWheel()
	{
		System.out.println("ScrollWheel type:"+this.type);
		System.out.println("ScrollWheel is smooth:"+this.smooth);
	}
}