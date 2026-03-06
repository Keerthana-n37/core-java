class Ipl {

    int matchNumber;
    float ticketPrice;
    char zone;
    boolean nightMatch;
    long audienceCount;
    Batter batter;
    Franchise franchise;
    Venue venue;
    Mentor mentor;
    Advertiser advertiser;

    Ipl(int matchNumber, float ticketPrice, char zone, boolean nightMatch, long audienceCount,
        Batter batter, Franchise franchise, Venue venue, Mentor mentor, Advertiser advertiser) {

        System.out.println("Executing IPL Constructor");

        this.matchNumber = matchNumber;
        this.ticketPrice = ticketPrice;
        this.zone = zone;
        this.nightMatch = nightMatch;
        this.audienceCount = audienceCount;

        this.batter = batter;
        this.franchise = franchise;
        this.venue = venue;
        this.mentor = mentor;
        this.advertiser = advertiser;
    }
	
	void getIpl()
	{
		System.out.println("Match Number: " + this.matchNumber);
        System.out.println("Ticket Price: " + this.ticketPrice);
        System.out.println("Zone: " + this.zone);
        System.out.println("Night Match: " +this.nightMatch);
        System.out.println("Audience Count: " + this.audienceCount);
		
		if(this.batter!=null)
		{
			this.batter.getBatter();
		}
		else
		{
			System.out.println("Batter not found");
		}
		
		if (this.franchise != null) 
		{
            this.franchise.getFranchise();
        } else {
            System.out.println("Franchise is null");
        }
		
		if(this.venue!=null)
		{
			this.venue.getVenue();
		}
		else{
			System.out.println("Venue not found");
		}
		
		if(this.mentor!=null)
		{
			this.mentor.getMentor();
		}
		else{
			System.out.println("Mentor not found");
		}
		
		if(this.advertiser!=null)
		{
			this.advertiser.getAdvertiser();
		}
		else{
			System.out.println("Advertiser not found");
		}
	}
	
}