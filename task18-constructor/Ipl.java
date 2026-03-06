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

        System.out.println("Match Number: " + this.matchNumber);
        System.out.println("Ticket Price: " + this.ticketPrice);
        System.out.println("Zone: " + this.zone);
        System.out.println("Night Match: " +this.nightMatch);
        System.out.println("Audience Count: " + this.audienceCount);

        System.out.println("Batter Name: " + batter.batterName);
        System.out.println("Franchise Name: " + franchise.franchiseTitle);
        System.out.println("Venue Name: " + venue.venueName);
        System.out.println("Mentor Name: " + mentor.mentorName);
        System.out.println("Advertiser Name: " + advertiser.adName);
    }
}