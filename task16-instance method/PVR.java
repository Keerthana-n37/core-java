class PVR{
	int pvrNo;
	String name;
	String location;
	String city;
	int screens;
	int seats;
	double ticketPrice;
	boolean foodCourt;
	String manager;
	String owner;
	double rating;
	String category;
	boolean vipAvailable;
	int parkingCapacity;
	String country;
	String state;
	String auditoriumType;
	double area;
	boolean onlineBooking;
	String language;
	
	PVR(int pvrNo, String name, String location, String city,
        int screens, int seats, double ticketPrice, boolean foodCourt,
        String manager, String owner, double rating, String category,
        boolean vipAvailable, int parkingCapacity, String country, String state,
        String auditoriumType, double area, boolean onlineBooking, String language)
		{
			this.pvrNo=pvrNo;
			this.name=name;
			this.location=location;
			this.city=city;
			this.screens=screens;
			this.seats=seats;
			this.ticketPrice=ticketPrice;
			this.foodCourt=foodCourt;
			this.manager=manager;
			this.owner=owner;
			this.rating=rating;
			this.category=category;
			this.vipAvailable=vipAvailable;
			this.parkingCapacity=parkingCapacity;
			this.country=country;
			this.state=state;
			this.auditoriumType=auditoriumType;
			this.area=area;
			this.onlineBooking=onlineBooking;
			this.language=language;
		}
	
    void displayPVR()
	{
		System.out.println("PVR No:"+pvrNo);
		System.out.println("Name:"+name);
		System.out.println("Location:"+location);
		System.out.println("City:"+city);
		System.out.println("Screens:"+screens);
		System.out.println("Seats:"+seats);
		System.out.println("Ticket Price:"+ticketPrice);
		System.out.println("Food Court:"+foodCourt);
		System.out.println("Manager:"+manager);
		System.out.println("Owner:"+owner);
		System.out.println("Rating:"+rating);
		System.out.println("Category:"+category);
		System.out.println("VIP avaliable:"+vipAvailable);
		System.out.println("Parking Capacity:"+parkingCapacity);
		System.out.println("Country:"+country);
		System.out.println("State:"+state);
		System.out.println("Auditorium Type:"+auditoriumType);
		System.out.println("Area:"+area);
		System.out.println("Online booking:"+onlineBooking);
		System.out.println("Language:"+language);
		System.out.println("----------------------");
	}	
}