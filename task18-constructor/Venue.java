class Venue {
    String venueName;
	
    Venue(String venueName) {
        System.out.println("Executing Venue Constructor");
        this.venueName = venueName;
    }
	
	void getVenue()
	{
		System.out.println("Ipl venue name:"+this.venueName);
	}
}