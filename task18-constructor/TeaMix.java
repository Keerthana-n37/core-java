class TeaMix{
	String mixName;
	TeaMix(String mixName)
	{
		System.out.println("Executing TeaMix constructor");
		this.mixName=mixName;
	}
	
	void getTeaMix()
	{
		System.out.println("Tea mix name is:"+this.mixName);
	}
}