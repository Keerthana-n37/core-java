class Garlic{
	int code;
	String name;
	String color;
	String type;
	double price;
	int quantity;
	String origin;
	boolean organic;
	double weight;
	int cloves;
	String size;
	String taste;
	String brand;
	String supplier;
	String country;
	double rating;
	String category;
	int packSize;
	double moisture;
	boolean available;
	
	 Garlic(int code, String name, String color, String type,double price, int quantity,
	        String origin,boolean organic, double weight, int cloves,
            String size, String taste, String brand, String supplier, 
			String country,double rating, String category,
           int packSize, double moisture, boolean available)
		   {
			   this.code=code;
			   this.name=name;
			   this.color=color;
			   this.type=type;
			   this.price=price;
			   this.quantity=quantity;
			   this.origin=origin;
			   this.organic=organic;
			   this.weight=weight;
			   this.cloves=cloves;
			   this.size=size;
			   this.taste=taste;
			   this.brand=brand;
			   this.supplier=supplier;
			   this.country=country;
			   this.rating=rating;
			   this.category=category;
			   this.packSize=packSize;
			   this.moisture=moisture;
			   this.available=available;	   
		   }
	
    void showGarlic()
	{
		System.out.println("Code:"+code);
		System.out.println("Name:"+name);
		System.out.println("Color:"+color);
		System.out.println("Type:"+type);
		System.out.println("Price:"+price);
		System.out.println("Quantity:"+quantity);
		System.out.println("Origin:"+origin);
		System.out.println("Organic:"+organic);
		System.out.println("Weight:"+weight);
		System.out.println("Cloves:"+cloves);
		System.out.println("Size:"+size);
		System.out.println("Taste:"+taste);
		System.out.println("Brand:"+brand);
		System.out.println("Supplier:"+supplier);
		System.out.println("Country:"+country);
		System.out.println("Rating:"+rating);
		System.out.println("Category:"+category);
		System.out.println("Pack Size:"+packSize);
		System.out.println("Moisture:"+moisture);
		System.out.println("Available:"+available);
		System.out.println("------------------------");
	}	
}