class Product
{
	int productId;
	String productName;
	String productCompanyName;
	String manufactureDate;
	String expireDate;
	ProductType type;
    double price;
	double weightInGrams;
	
	Product(int productId, String productName,String productCompanyName,String manufactureDate,String expireDate, ProductType type,double price,double weightInGrams)
	{
		this.productId= productId;
		this.productName = productName;
		this.productCompanyName=productCompanyName;
		this.manufactureDate= manufactureDate;
		this.expireDate = expireDate;
		this.type = type;
		this.price= price;
		this.weightInGrams= weightInGrams;
	}
	
	void display()
	{
		System.out.println("Product ID: "+this.productId);
		System.out.println("Product Company name: "+this.productCompanyName);
		System.out.println("Product manufactureDate: "+this.manufactureDate);
		System.out.println("Product expireDate: "+this.expireDate);
		System.out.println("Product type: "+this.type);
		System.out.println("Product price: "+this.price);
		System.out.println("Product weightInGrams: "+this.weightInGrams);
	}
}
