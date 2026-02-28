class DumbBell{
    int dumbBellNo;
	String brand;
	double weight;
	double length;
	String material;
	String color;
	boolean adjustable;
	int maxWeight;
	int minWeight;
	boolean rubberCoated;
	String type;
	double price;
	String category;
	String usage;
	String location;
	boolean portable;
	int warranty;
	double rating;
	String country;
	boolean stockAvailable;
	
	
	DumbBell(int dumbBellNo, String brand, double weight, double length,
             String material, String color, boolean adjustable, int maxWeight,
             int minWeight, boolean rubberCoated, String type, double price,
             String category, String usage, String location, boolean portable,
             int warranty, double rating, String country, boolean stockAvailable)
			 {
				 this.dumbBellNo=dumbBellNo;
				 this.brand=brand;
				 this.weight=weight;
				 this.length=length;
				 this.material=material;
				 this.color=color;
				 this.adjustable=adjustable;
				 this.maxWeight=this.maxWeight;
				 this.minWeight=minWeight;
				 this.rubberCoated=rubberCoated;
				 this.type=type;
				 this.price=price;
				 this.category=category;
				 this.usage=usage;
				 this.location=location;
				 this.portable=portable;
				 this.warranty=warranty;
				 this.rating=rating;
				 this.country=country;
				 this.stockAvailable=stockAvailable;		 
			 }
			 
	void dumbBellDetails() 
	{
        System.out.println("DumbBell No: " + dumbBellNo);
        System.out.println("Brand: " + brand);
        System.out.println("Weight: " + weight);
        System.out.println("Length: " + length);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Adjustable: " + adjustable);
        System.out.println("Max Weight: " + maxWeight);
        System.out.println("Min Weight: " + minWeight);
        System.out.println("Rubber Coated: " + rubberCoated);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
        System.out.println("Usage: " + usage);
        System.out.println("Location: " + location);
        System.out.println("Portable: " + portable);
        System.out.println("Warranty: " + warranty + " months");
        System.out.println("Rating: " + rating);
        System.out.println("Country: " + country);
        System.out.println("Stock Available: " + stockAvailable);
        System.out.println("----------------------------");
    }
		 
}