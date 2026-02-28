class Map{
	int mapNo;
	String name;
	String type;
	String region;
	String scale;
	double price;
	int copies;
	String language;
	boolean laminated;
	String publisher;
	int year;
	double width;
	double height;
	String material;
	String color;
	double rating;
	String category;
	String country;
	boolean available;
	String format;
	
	  Map(int mapNo, String name, String type, String region,
        String scale, double price, int copies,String language, boolean laminated,
        String publisher, int year,double width, double height,
        String material, String color, double rating, String category,
        String country, boolean available,String format) 
		{
			this.mapNo=mapNo;
			this.name=name;
			this.type=type;
			this.region=region;
			this.scale=scale;
			this.price=price;
			this.copies=copies;
			this.language=language;
			this.laminated=laminated;
			this.publisher=publisher;
			this.year=year;
			this.width=width;
			this.height=height;
			this.material=material;
			this.color=color;
			this.rating=rating;
			this.category=category;
			this.country=country;
			this.available=available;
			this.format=format;
		}
		
	void printMap()
	{
		System.out.println("Map No:"+mapNo);
		System.out.println("Name:"+name);
		System.out.println("Type:"+type);
		System.out.println("Region:"+region);
		System.out.println("Scale:"+scale);
		System.out.println("Price:"+price);
		System.out.println("Copies:"+copies);
		System.out.println("Language:"+language);
		System.out.println("Laminated:"+laminated);
		System.out.println("Publisher:"+publisher);
		System.out.println("Year:"+year);
		System.out.println("Width:"+width);
		System.out.println("Height:"+height);
		System.out.println("Material:"+material);
		System.out.println("Color:"+color);
		System.out.println("Rating:"+rating);
		System.out.println("Category:"+category);
		System.out.println("Country:"+country);
		System.out.println("Available:"+available);
		System.out.println("Format:"+format);
		System.out.println("------------------");
	}	
}