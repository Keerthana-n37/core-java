class MugType{
	
	String mugStyle;
	MugType(String mugStyle)
	{
		System.out.println("Executing MugType constructor");
		this.mugStyle=mugStyle;
	}
	
	void getMugType()
	{
		System.out.println("Style of the mug is:"+this.mugStyle);
	}
}