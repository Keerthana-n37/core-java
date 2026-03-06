class IplRunner{

    public static void main(String[] args) {
        Batter batter = new Batter("Rohit Sharma");
        Franchise franchise = new Franchise("Mumbai Indians");
        Venue venue = new Venue("Wankhede Stadium");
        Mentor mentor = new Mentor("Ricky Ponting");
        Advertiser advertiser = new Advertiser("Dream11");

        Ipl ipl = new Ipl(15, 1200.5f, 'B', true, 800000,
                batter, franchise, venue, mentor, advertiser);
    }
}