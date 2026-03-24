class Gum
{
	String brandName;
	String flavor;
	int price;
	boolean sugarFree;
	int piecesPerPack;
	String color;
	
	Gum(String brandName,String flavor,int price,boolean sugarFree,int piecesPerPack,String color)
	{
		this.brandName=brandName;
		this.flavor=flavor;
		this.price=price;
		this.sugarFree=sugarFree;
		this.piecesPerPack=piecesPerPack;
		this.color=color;
	}
	
	void displayGumDetails()
	{
		System.out.println("Executing displayGumDetails in Gum");
		System.out.println("Brand Name: "+this.brandName);
		System.out.println("Flavor: "+this.flavor);
		System.out.println("Price: "+this.price);
		System.out.println("Sugar free: "+this.sugarFree);
		System.out.println("Pieces per pack: "+this.piecesPerPack);
		System.out.println("Color: "+this.color);
		System.out.println("------------------");
	}
}