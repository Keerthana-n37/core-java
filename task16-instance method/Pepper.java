class Pepper{
	int productId;
	String productName;
	String type;
	String brand;
	int manufacturingYear;
	String origin;
	int stockAvailable;
	double price;
	String mainUse;
	String secondaryUse;
	boolean organic;
	String qualityGrade;
	int totalSuppliers;
	String country;
	String website;
	double marketDemand;
	String parentCompany;
	int totalCustomers;
	double productRating;
	String category;

    Pepper(int productId, String productName, String type, String brand,
           int manufacturingYear, String origin, int stockAvailable,
           double price, String mainUse, String secondaryUse,
           boolean organic, String qualityGrade, int totalSuppliers,
           String country, String website, double marketDemand,
           String parentCompany, int totalCustomers,
           double productRating, String category)
		   {
			   this.productId=productId;
			   this.productName=productName;
			   this.type=type;
			   this.brand=brand;
			   this.manufacturingYear=manufacturingYear;
			   this.origin=origin;
			   this.stockAvailable=stockAvailable;
			   this.price=price;
			   this.mainUse=mainUse;
			   this.secondaryUse=secondaryUse;
			   this.organic=organic;
			   this.qualityGrade=qualityGrade;
			   this.totalSuppliers=totalSuppliers;
			   this.country=country;
			   this.website=website;
			   this.marketDemand=marketDemand;
			   this.parentCompany=parentCompany;
			   this.totalCustomers=totalCustomers;
			   this.productRating=productRating;
			   this.category=category;   
		   }
		   
	void pepperDetails()
	{
		System.out.println("Product Id:"+productId);
		System.out.println("Product name:"+productName);
		System.out.println("Type:"+type);
		System.out.println("Brand:"+brand);
		System.out.println("Manufacturing year:"+manufacturingYear);
		System.out.println("origin:"+origin);
		System.out.println("Stock Available:"+stockAvailable);
		System.out.println("Price:"+price);
		System.out.println("Main use:"+mainUse);
		System.out.println("Secondary use:"+secondaryUse);
		System.out.println("Organic:"+organic);
		System.out.println("Quality grade:"+qualityGrade);
		System.out.println("Total Suppliers:"+totalSuppliers);
		System.out.println("Country:"+country);
		System.out.println("Website:"+website);
		System.out.println("Market Demand:"+marketDemand);
		System.out.println("Parent Company:"+parentCompany);
		System.out.println("Total customers:"+totalCustomers);
		System.out.println("Product Rating:"+productRating);
		System.out.println("Category:"+category);
		System.out.println("---------------------");
	}	
}