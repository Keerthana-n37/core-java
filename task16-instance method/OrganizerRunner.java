class OrganizerRunner {

    public static void main(String[] args) {

        Organizer organizer1 = new Organizer(1,"Ravi Events","Wedding",
                "Royal Planners","Bangalore",150,10,true,"Luxury Weddings",
                "9876543210","ravi@royal.com",25,4.8,true,"12-12-2026",
                "Amit",5000000,"Full Service",false,"Active");
        organizer1.aboutOrganizer();

        Organizer organizer2 = new Organizer(2,"Dream Makers","Corporate",
                "DreamWorks","Hyderabad",200,12,true,"Corporate Events",
                "9876501234","dream@works.com",30,4.6,true,"15-01-2026",
                "TechSoft",3000000,"Corporate",true,"Active");
        organizer2.aboutOrganizer();

        Organizer organizer3 = new Organizer(3,"Fun Fiesta","Birthday",
                "FunTime","Chennai",120,8,false,"Kids Parties",
                "9123456780","fun@fiesta.com",15,4.3,true,"20-02-2026",
                "Riya",200000,"Decoration",false,"Active");
        organizer3.aboutOrganizer();

        Organizer organizer4 = new Organizer(4,"Elite Planners","Wedding",
                "Elite Events","Mumbai",300,15,true,"Destination Weddings",
                "9988776655","elite@events.com",40,4.9,false,"25-03-2026",
                "Karan",8000000,"Premium",true,"Busy");
        organizer4.aboutOrganizer();

        Organizer organizer5 = new Organizer(5,"Star Events","Concert",
                "Star Entertainment","Delhi",180,11,true,"Music Shows",
                "9000012345","star@ent.com",35,4.7,true,"05-04-2026",
                "LiveNation",7000000,"Stage Setup",true,"Active");
        organizer5.aboutOrganizer();

        Organizer organizer6 = new Organizer(6,"Celebrations","Anniversary",
                "Happy Moments","Pune",90,6,false,"Family Events",
                "9012345678","celebrate@moments.com",12,4.2,true,"10-05-2026",
                "Sneha",150000,"Decoration",false,"Active");
        organizer6.aboutOrganizer();

        Organizer organizer7 = new Organizer(7,"Grand Gala","Exhibition",
                "ExpoWorld","Kolkata",140,9,true,"Trade Shows",
                "9090909090","gala@expo.com",20,4.5,true,"18-06-2026",
                "BizCorp",4000000,"Management",true,"Active");
        organizer7.aboutOrganizer();

        Organizer organizer8 = new Organizer(8,"Sparkle Events","Engagement",
                "Sparkle","Jaipur",110,7,true,"Theme Events",
                "9345678901","sparkle@events.com",18,4.4,true,"22-07-2026",
                "Pooja",350000,"Decoration",false,"Active");
        organizer8.aboutOrganizer();

        Organizer organizer9 = new Organizer(9,"Mega Planners","Conference",
                "MegaCorp","Ahmedabad",210,13,true,"Business Conferences",
                "9456789012","mega@corp.com",28,4.6,true,"30-08-2026",
                "FutureLabs",6000000,"Full Service",true,"Active");
        organizer9.aboutOrganizer();

        Organizer organizer10 = new Organizer(10,"Joyful Moments","Baby Shower",
                "Joy Events","Mysore",80,5,false,"Home Events",
                "9567890123","joy@moments.com",10, 4.1,true,"12-09-2026",
                "Ananya",120000,"Decoration",false,"Active");
        organizer10.aboutOrganizer();
    }
}