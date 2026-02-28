class Trophy{
	int trophyNo;
	String name;
	String type;
	String material;
	double height;
	double weight;
	String color;
	double price;
	String event;
	String awardedTo;
	int year;
	String country;
	String state;
	boolean goldPlated;
	boolean silverPlated;
	boolean bronzePlated;
	String category;
	String sponsor;
	double rating;
	boolean available;
	
	Trophy(int trophyNo, String name, String type, String material,
           double height, double weight, String color, double price,
           String event, String awardedTo, int year, String country,
           String state, boolean goldPlated, boolean silverPlated,
           boolean bronzePlated, String category, String sponsor,
           double rating, boolean available)
		   {
			   this.trophyNo=trophyNo;
			   this.name=name;
			   this.type=type;
			   this.material=material;
			   this.height=height;
			   this.weight=weight;
			   this.color=color;
			   this.price=price;
			   this.event=event;
			   this.awardedTo=awardedTo;
			   this.year=year;
			   this.country=country;
			   this.state=state;
			   this.goldPlated=goldPlated;
			   this.silverPlated=silverPlated;
			   this.bronzePlated=bronzePlated;
			   this.category=category;
			   this.sponsor=sponsor;
			   this.rating=rating;
			   this.available=available;
		   }
		   
    void displayTrophy() 
	{
        System.out.println("Trophy No: " + trophyNo);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Event: " + event);
        System.out.println("Awarded To: " + awardedTo);
        System.out.println("Year: " + year);
        System.out.println("Country: " + country);
        System.out.println("State: " + state);
        System.out.println("Gold Plated: " + goldPlated);
        System.out.println("Silver Plated: " + silverPlated);
        System.out.println("Bronze Plated: " + bronzePlated);
        System.out.println("Category: " + category);
        System.out.println("Sponsor: " + sponsor);
        System.out.println("Rating: " + rating);
        System.out.println("Available: " + available);
        System.out.println("----------------------------");
    }	   
}