class Product
{
	String productName;
	String make;
	String manufactureDate;
	double cost;
	ProductType type;
	String seller;
	ProductWarranty warrantyYears;
	boolean warrantyExpired;
	int uniqueId;
	String originCountry;
	
	Product(String productName,String make,String manufactureDate,double cost,
	        ProductType type,String seller,ProductWarranty warrantyYears,boolean warrantyExpired,
	        int uniquedId,String originCountry)
	{
		this.productName= productName;
		this.make= make;
		this.manufactureDate= manufactureDate;
		this.cost= cost;
		this.type= type;
		this.seller= seller;
		this.warrantyYears= warrantyYears;
		this.warrantyExpired= warrantyExpired;
		this.uniqueId= uniqueId;
		this.originCountry= originCountry;
	}
			
	void displayProductInfo()
	{
		System.out.println("Executing displayProductInfo in Product class");
		System.out.println("Product Name: "+this.productName);
		System.out.println("Make: "+this.make);
		System.out.println("Manufacture date of product: "+this.manufactureDate);
		System.out.println("Cost of product: "+this.cost);
		System.out.println("Product Type: "+this.type);
		System.out.println("Product seller: "+this.seller);
		System.out.println("Product warranty: "+this.warrantyYears);
		System.out.println("Warranty expired: "+this.warrantyExpired);
		System.out.println("Product uniquedId: "+this.uniqueId);
		System.out.println("Origin country: "+this.originCountry);
		System.out.println("-----------------------");
	}	
}