class Cap
{
	String branddName;
	String capColor;
	int capPrice;
	String capSize;
	String capMaterial;
	boolean adjustable;
	
	Cap(String branddName,String capColor,int capPrice,String capSize,String capMaterial,boolean adjustable)
	{
		this.brandName=barndName;
		this.capColor=capColor;
		this.capPrice=capPrice;
		this.capSize=capSize;
		this.capMaterial=capMaterial;
		this.adjustable=adjustable;
	}
	
	void displayCapDetails()
	{
		System.out.println("Executing displayCapDetails in Cap");
		System.out.println("Brand name of cap is:"+this.brandName);
		System.out.println("Color of the cap is:"+this.capColor);
		System.out.println("Price of cap is:"+this.capPrice);
		System.out.println("Size of cap is:"+this.capSize);
		System.out.println("Material of cap is:"+this.capMaterial);
		System.out.println("Is cap adjustable:"+this.adjustable);
		System.out.println("-----------------------");
	}
}