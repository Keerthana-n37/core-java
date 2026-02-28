class GoogleRunner {

    public static void main(String[] args) {

        Google google = new Google(1,"Google","Larry Page","Sundar Pichai",
                1998,"California",150000,300.5,"Search","Gmail",
                true,"GOOGL",100,"USA","www.google.com",
                92.5,"Alphabet",5000000,4.8,"Technology");
	    google.googleInfo();

        Google google1 = new Google(2,"Google","Larry Page","Sundar Pichai",
                1998,"California",140000,280.0,"Search","YouTube",
                true,"GOOGL",95,"USA","www.google.com",
                90.0,"Alphabet",4800000,4.7,"Technology");
        google1.googleInfo();
		
        Google google2 = new Google(3,"Google India","Larry Page","Sundar Pichai",
                1998,"Hyderabad",20000,50.5,"Search","Maps",
                true,"GOOGL",25,"India","www.google.co.in",
                85.5,"Alphabet",800000,4.6,"Technology");
        google2.googleInfo();
		
        Google google3 = new Google(4,"Google UK","Larry Page","Sundar Pichai",
                1998,"London",10000,40.5,"Search","Drive",
                true,"GOOGL",15,"UK","www.google.co.uk",
                80.0,"Alphabet",600000,4.5,"Technology");
        google3.googleInfo();
		
        Google google4 = new Google(5,"Google Canada","Larry Page","Sundar Pichai",
                1998,"Toronto",8000,30.5,"Search","Photos",
                true,"GOOGL",10,"Canada","www.google.ca",
                75.0,"Alphabet",400000,4.4,"Technology");
        google4.googleInfo();
		
        Google google5 = new Google(6,"Google Australia","Larry Page","Sundar Pichai",
                1998,"Sydney",6000,25.5,"Search","Meet",
                true,"GOOGL",8,"Australia","www.google.com.au",
                70.0,"Alphabet",300000,4.3,"Technology");
        google5.googleInfo();
		
        Google google6 = new Google(7,"Google Japan","Larry Page","Sundar Pichai",
                1998,"Tokyo",12000,35.5,"Search","Translate",
                true,"GOOGL",12,"Japan","www.google.co.jp",
                78.0,"Alphabet",500000,4.6,"Technology");
        google6.googleInfo();
		
        Google google7 = new Google(8,"Google Germany","Larry Page","Sundar Pichai",
                1998,"Berlin",9000,28.5,"Search","Chrome",
                true,"GOOGL",9,"Germany","www.google.de",
                73.0,"Alphabet",350000,4.4,"Technology");
        google7.googleInfo();
		
        Google google8 = new Google(9,"Google France","Larry Page","Sundar Pichai",
                1998,"Paris",7000,22.5,"Search","Docs",
                true,"GOOGL",7,"France","www.google.fr",
                68.0,"Alphabet",250000,4.2,"Technology");
        google8.googleInfo();
		
        Google google9 = new Google(10,"Google Brazil","Larry Page","Sundar Pichai",
                1998,"Rio",5000,20.5,"Search","Cloud",
                true,"GOOGL",6,"Brazil","www.google.br",
                65.0,"Alphabet",200000,4.1,"Technology");
        google9.googleInfo();
    }
}