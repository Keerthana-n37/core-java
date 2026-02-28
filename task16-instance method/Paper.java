class Paper{
	int id;
    String name;
    String color;
    String size;
    double price;
    int quantity;
    String type;
    String brand;
    double weight;
    int pages;
    boolean available;
    String quality;
    String material;
    String shape;
    double thickness;
    int packSize;
    String supplier;
    String country;
    double rating;
    String category;
	
	Paper(int id, String name, String color, String size,
          double price, int quantity, String type, String brand,
          double weight, int pages, boolean available,
          String quality, String material, String shape,
          double thickness, int packSize, String supplier,
          String country, double rating, String category)
		  {
			  this.id=id;
			  this.name=name;
			  this.color=color;
			  this.size=size;
			  this.price=price;
			  this.quantity=quantity;
			  this.type=type;
			  this.brand=brand;
			  this.weight=weight;
			  this.pages=pages;
			  this.available=available;
			  this.quality=quality;
			  this.material=material;
			  this.shape=shape;
			  this.thickness=thickness;
			  this.packSize=packSize;
			  this.supplier=supplier;
			  this.country=country;
			  this.rating=rating;
			  this.category=category;
		  }	  
	
    void displayDetails() 
	{
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Color: " + color);
		System.out.println("Size: " + size);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Type: " + type);
		System.out.println("Brand: " + brand);
		System.out.println("Weight: " + weight);
		System.out.println("Pages: " + pages);
		System.out.println("Available: " + available);
		System.out.println("Quality: " + quality);
		System.out.println("Material: " + material);
		System.out.println("Shape: " + shape);
		System.out.println("Thickness: " + thickness);
		System.out.println("Pack Size: " + packSize);
		System.out.println("Supplier: " + supplier);
		System.out.println("Country: " + country);
		System.out.println("Rating: " + rating);
		System.out.println("Category: " + category);
		System.out.println("------------------------");
	}
}