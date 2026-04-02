class ProductRunner
{
	public static void main(String[] args)
	{
		Product[] products = new Product[10];
		ProductOperations operation= new ProductOperations(products);
		Product product1= new Product(101,"Rice","Basmathi","12-07-2025","14-07-2026",ProductType.GROCERY,1000,1000);
		Product product2 = new Product(102,"Mixer","Godrej","20-08-2024","26-07-2030",ProductType.ELECTRONICS, 2500,0);
		Product product3 = new Product(103,"Milk","Amul","2-4-2026","3-4-2026",ProductType.DAIRY,24,500);
		Product product4 = new Product(104,"Curd","Nandini","2-4-2026","5-4-2026",ProductType.DAIRY,48,1000);
		Product product5= new Product(105,"GroundNut","GroundNut","12-07-2025","14-09-2026",ProductType.GROCERY,150,1000);
		Product product6= new Product(106,"Cooking oil","SUnflower oil","2-04-2025","1-07-2026",ProductType.GROCERY,300,1000);
		operation.addProduct(product1);
		operation.addProduct(product2);
		operation.addProduct(product3);
		operation.addProduct(product4);
		operation.addProduct(product5);
		operation.addProduct(product6);
		System.out.println("---------------");
		operation.getProductDetails(104);
		System.out.println("----------------");
		
		operation.getProductPrice("Cooking oil");
		System.out.println("-------------------");
		
		operation.getProductName("Basmathi");
		System.out.println("------------------");
		
		operation.getCompanyName("Milk");
		boolean ref= operation.getCompanyName("Milk");
		System.out.println("Result: "+ref);
		System.out.println("----------------");
		
		operation.getManufactureAndExpireDate("GroundNut");
		System.out.println("-------------------");
		
		operation.updateManufactureAndExpiryDate("Cooking oil","14-03-2025","04-10-2026");
		ref=operation.updateManufactureAndExpiryDate("Cooking oil","14-03-2025","04-10-2026");
		System.out.println("Result:"+ref);
	    System.out.println("---------------");
		
		operation.updatePrice("Rice",1200);
	    double ref1= operation.updatePrice("Rice",1200);
		System.out.println("Updated price: "+ref1);
		
		operation.getProductName(ProductType.ELECTRONICS);
		System.out.println("--------------");
		
		operation.getManufactureDate("Curd");
		System.out.println("-----------");
		
		operation.getExpireDate("Curd");
		System.out.println("----------------");
		
		operation.displayAll();
		System.out.println("-----------------");
		
		operation.deleteProduct("Cooking oil");
		ref=operation.deleteProduct("Cooking oil");
		System.out.println("Result:"+ref);
		System.out.println("----------------");
	}
}
