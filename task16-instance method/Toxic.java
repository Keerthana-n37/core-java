class Toxic{
	int toxicNo;
	String name;
	String type;
	String source;
	String state;
	double quantity;
	int level;
	String effect;
	boolean dangerous;
	String discoveredBy;
	int year;
	double density;
	double temperature;
	String color;
	String smell;
	double rating;
	String category;
	String location;
	boolean restricted;
	String safetyLevel;
	
	Toxic(int toxicNo, String name, String type, String source,
          String state, double quantity, int level, String effect,
          boolean dangerous, String discoveredBy, int year,
          double density, double temperature, String color,
          String smell, double rating, String category,
          String location, boolean restricted, String safetyLevel)
		  {
			  this.toxicNo=toxicNo;
			  this.name=name;
			  this.type=type;
			  this.source=source;
			  this.state=state;
			  this.quantity=quantity;
			  this.level=level;
			  this.effect=effect;
			  this.dangerous=dangerous;
			  this.discoveredBy=discoveredBy;
			  this.year=year;
			  this.density=density;
			  this.temperature=temperature;
			  this.color=color;
			  this.smell=smell;
			  this.rating=rating;
			  this.category=category;
			  this.location=location;
			  this.restricted=restricted;
			  this.safetyLevel=safetyLevel;
		  }
		  
	void viewToxic()
	{
		System.out.println("Toxic No: " + toxicNo);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Source: " + source);
        System.out.println("State: " + state);
        System.out.println("Quantity: " + quantity);
        System.out.println("Level: " + level);
        System.out.println("Effect: " + effect);
        System.out.println("Dangerous: " + dangerous);
        System.out.println("Discovered By: " + discoveredBy);
        System.out.println("Year: " + year);
        System.out.println("Density: " + density);
        System.out.println("Temperature: " + temperature);
        System.out.println("Color: " + color);
        System.out.println("Smell: " + smell);
        System.out.println("Rating: " + rating);
        System.out.println("Category: " + category);
        System.out.println("Location: " + location);
        System.out.println("Restricted: " + restricted);
        System.out.println("Safety Level: " + safetyLevel);
        System.out.println("---------------------------");
	}	
}