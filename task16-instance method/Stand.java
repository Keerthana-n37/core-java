class Stand{
	int standNo;
	String name;
	String type;
	String material;
	double price;
	int quantity;
	String color;
	double height;
	double width;
	boolean foldable;
	String brand;
	String usage;
	String shape;
	double weight;
	String supplier;
	String country;
	double rating;
	String category;
	int warranty;
	boolean available;
	
	
	 Stand(int standNo, String name, String type, String material,
          double price, int quantity, String color,
          double height, double width, boolean foldable,
          String brand, String usage, String shape,
          double weight, String supplier, String country,
          double rating, String category,int warranty, boolean available)
		  {
			  this.standNo=standNo;
			  this.name=name;
			  this.type=type;
			  this.material=material;
			  this.price=price;
			  this.quantity=quantity;
			  this.color=color;
			  this.height=height;
			  this.width=width;
			  this.foldable=foldable;
			  this.brand=brand;
			  this.usage=usage;
			  this.shape=shape;
			  this.weight=weight;
			  this.supplier=supplier;
			  this.country=country;
			  this.rating=rating;
			  this.category=category;
			  this.warranty=warranty;
			  this.available=available;
		  }	
   
    void displayStand()
	{
		System.out.println("Stand No:"+standNo);
		System.out.println("Name:"+name);
		System.out.println("Type:"+type);
	    System.out.println("Material:"+material);
		System.out.println("price:"+price);
		System.out.println("Quantity:"+quantity);
		System.out.println("Color:"+color);
		System.out.println("Height:"+height);
	    System.out.println("Width:"+width);
		System.out.println("Foldable:"+foldable);
		System.out.println("Brand:"+brand);
		System.out.println("Usage:"+usage);
		System.out.println("Shape:"+shape);
	    System.out.println("Weight:"+weight);
		System.out.println("Supplier:"+supplier);
		System.out.println("Country:"+country);
		System.out.println("Rating:"+rating);
		System.out.println("Category:"+category);
	    System.out.println("Warranty:"+warranty);
		System.out.println("Available:"+available);
		System.out.println("---------------------");
	}	
}