class SPA{
	int sessionCode;
	double price;
	char packageCode;
	boolean isLuxury;
	long duration;
	
	Specialist specialist;
	Guest guest;
	Therapy therapy;
	Cabin cabin;
	ProductKit productKit;
	
	SPA(int sessionCode, double price, char packageCode, boolean isLuxury, long duration,
        Specialist specialist, Guest guest, Therapy therapy, Cabin cabin, ProductKit productKit)
		{
			this.sessionCode=sessionCode;
			this.price=price;
			this.packageCode=packageCode;
			this.isLuxury=isLuxury;
			this.duration=duration;
			this.specialist=specialist;
			this.guest=guest;
			this.therapy=therapy;
			this.cabin=cabin;
			this.productKit=productKit;
			
		System.out.println("Session Code: " + this.sessionCode);
        System.out.println("Price: " + this.price);
        System.out.println("Level Code: " +this.packageCode);
        System.out.println("Luxury Session: " +this.isLuxury);
        System.out.println("Duration: " + this.duration);
		
		System.out.println("Specialist: " + specialist.name);
        System.out.println("Guest: " + guest.name);
        System.out.println("Therapy: " + therapy.type);
        System.out.println("Cabin: " + cabin.name);
        System.out.println("Product Kit: " + productKit.name);
		}
}