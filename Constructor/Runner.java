class Runner{
    public static void main(String[] args) {

        Bangle bangle = new Bangle("Gold");
		System.out.println("Bangle Details");
        System.out.println("Bangle Color: " + bangle.color);
		System.out.println("-------------------------");

        Anklet anklet = new Anklet("Silver");
		System.out.println("Anklet Details");
        System.out.println("Anklet Material: " + anklet.material);
		System.out.println("-------------------------");

        Coffee coffee = new Coffee("Bru", "Filter");
		System.out.println("Coffee Details");
        System.out.println("Coffee Brand: " + coffee.brand );
        System.out.println("Coffee Type: " + coffee.type );
		System.out.println("-------------------------");

        Ant ant = new Ant("Black", 0.2, "Carpenter");
		System.out.println("Ant Details");
        System.out.println("Ant Color:" + ant.color); 
        System.out.println("Size:" + ant.size);
        System.out.println("Species:" + ant.species);
		System.out.println("-------------------------");

        Bucket bucket = new Bucket("Plastic", 10, "Blue", 150, "Round");
		System.out.println("Bucket Details");
        System.out.println("Bucket Material:" + bucket.material );
        System.out.println ("Capacity:" + bucket.capacity); 
        System.out.println ("Color:" + bucket.color); 
        System.out.println ("Price:" + bucket.price);
        System.out.println("Shape:" + bucket.shape);
		System.out.println("-------------------------");

        Jacket jacket = new Jacket("Puma", "M", "Black", 2500, "Leather");
		System.out.println("Jacket Details");
        System.out.println("Jacket Brand: " + jacket.brand);
        System.out.println("Size: " + jacket.size);
        System.out.println("Color: " + jacket.color);
        System.out.println("Price: " + jacket.price);
        System.out.println("Material: " + jacket.material);
		System.out.println("-------------------------");

        Pocket pocket = new Pocket("Cotton",true,"Double Stitch");
		System.out.println("Pocket Details");
        System.out.println("Fabric Type: " + pocket.fabricType);
        System.out.println("Has Zip: " + pocket.hasZip);
        System.out.println("Stitching Style: " + pocket.stitchingStyle);
		System.out.println("-------------------------");

        Cricket cricket = new Cricket("T20", 11, 20, "India", "Australia",
                                      "Mumbai", "Rohit", "Cummins", "Kumar",
                                      "International", "India", "10-02-2026", "ICC",
                                       180, 6, 9.0, "Virat","WorldCup", "India", "India Won");
        System.out.println("Cricket Match Details:");
        System.out.println("Format: " + cricket.format);
        System.out.println("Players: " + cricket.players);
        System.out.println("Overs: " + cricket.overs);
        System.out.println("Team A: " + cricket.teamA);
        System.out.println("Team B: " + cricket.teamB);
        System.out.println("Venue: " + cricket.venue);
        System.out.println("Captain A: " + cricket.captainA);
        System.out.println("Captain B: " + cricket.captainB);
        System.out.println("Umpire: " + cricket.umpire);
        System.out.println("Match Type: " + cricket.matchType);
        System.out.println("Toss Winner: " + cricket.tossWinner);
        System.out.println("Match Date: " + cricket.matchDate);
        System.out.println("Sponsor: " + cricket.sponsor);
        System.out.println("Total Runs: " + cricket.totalRuns);
        System.out.println("Wickets: " + cricket.wickets);
        System.out.println("Run Rate: " + cricket.runRate);
        System.out.println("Man of Match: " + cricket.manOfMatch);
        System.out.println("Series Name: " + cricket.seriesName);
        System.out.println("Country: " + cricket.country);
        System.out.println("Result: " + cricket.result);
		System.out.println("-------------------------");

        Racket racket = new Racket("Yonex", "Badminton", 300, 5000, "G4",
                                "Black", "Carbon", "Nylon", 27, "Japan");
        System.out.println("Racket Details:");
        System.out.println("Brand:" + racket.brand);
        System.out.println("Type:" + racket.type);
        System.out.println("Weight:" + racket.weight + " grams");
        System.out.println("Price:" + racket.price);
        System.out.println("Grip Size:" + racket.gripSize);
        System.out.println("Color:" + racket.color);
        System.out.println("Material:" + racket.material);
        System.out.println("String Type:" + racket.stringType);
        System.out.println("Length:" + racket.length + " inches");
        System.out.println("Country of Manufacture:" + racket.country);
		System.out.println("-------------------------");

        Helmet helmet = new Helmet("Vega", "FullFace", "M");
		System.out.println("Helmet Details");
        System.out.println("Helmet Brand: " + helmet.brand);
        System.out.println("Type: " + helmet.type);
        System.out.println("Size: " + helmet.size);
		System.out.println("-------------------------");

        Blanket blanket= new Blanket("Wool", "King", "Brown", 2500, "HomeStyle", 2.5);
        System.out.println("Blanket Details:");
        System.out.println("Material:" + blanket.material);
        System.out.println("Size:" + blanket.size);
        System.out.println("Color:" + blanket.color);
        System.out.println("Price:" + blanket.price);
        System.out.println("Brand:" + blanket.brand);
        System.out.println("Weight:" + blanket.weight + " kg");
    
        Bracelet bracelet = new Bracelet("Gold", 120000, "Golden", 25, "Tanishq",
                                    "Floral", "Chain", 18, "Diamond", "Wedding",
                                    "Hook", "India", "1 Year", "Gold Plated",
                                    "Women", "Glossy", "Premium", "Available",
                                    "Round", "Traditional");
        System.out.println("Bracelet Details:");
        System.out.println("Material:" + bracelet.material);
        System.out.println("Price:" + bracelet.price);
        System.out.println("Color:" + bracelet.color);
        System.out.println("Weight:" + bracelet.weight + " grams");
        System.out.println("Brand:" + bracelet.brand);
        System.out.println("Design:" + bracelet.design);
        System.out.println("Type:" + bracelet.type);
        System.out.println("Length:" + bracelet.length + " cm");
        System.out.println("Stone Type:" + bracelet.stoneType);
        System.out.println("Occasion:" + bracelet.occasion);
        System.out.println("Clasp Type:" + bracelet.claspType);
        System.out.println("Country:" + bracelet.country);
        System.out.println("Warranty:" + bracelet.warranty);
        System.out.println("Plating:" + bracelet.plating);
        System.out.println("Gender:" + bracelet.gender);
        System.out.println("Finish:" + bracelet.finish);
        System.out.println("Collection:" + bracelet.collection);
        System.out.println("Availability:" + bracelet.availability);
        System.out.println("Shape:" + bracelet.shape);
        System.out.println("Style:" + bracelet.style);
		System.out.println("-------------------------");

        Necklace necklace = new Necklace("Gold", 50000, "Golden", 50, "Tanishq",
                                         "Temple", "Long", 24, "Ruby", "Festival",
                                         "Hook", "India", "2 Years", "Gold Plated",
                                         "Women", "Matte", "Royal", "Available",
                                         "Oval", "Ethnic");
        System.out.println("Necklace Details:");
        System.out.println("Material: " + necklace.material);
        System.out.println("Price: $" + necklace.price);
        System.out.println("Color: " + necklace.color);
        System.out.println("Weight: " + necklace.weight + " grams");
        System.out.println("Brand: " + necklace.brand);
        System.out.println("Design: " + necklace.design);
        System.out.println("Type: " + necklace.type);
        System.out.println("Length: " + necklace.length + " cm");
        System.out.println("Stone Type: " + necklace.stoneType);
        System.out.println("Occasion: " + necklace.occasion);
        System.out.println("Clasp Type: " + necklace.claspType);
        System.out.println("Country: " + necklace.country);
        System.out.println("Warranty: " + necklace.warranty);
        System.out.println("Plating: " + necklace.plating);
        System.out.println("Gender: " + necklace.gender);
        System.out.println("Finish: " + necklace.finish);
        System.out.println("Collection: " + necklace.collection);
        System.out.println("Availability: " + necklace.availability);
        System.out.println("Shape: " + necklace.shape);
        System.out.println("Style: " + necklace.style);
		System.out.println("-------------------------");

        ShoeLace shoelace = new ShoeLace("Nike", "Black", 120, "Cotton", 150,
                                         "Flat", "Round", "High", "USA", "Medium");
										 System.out.println("ShoeLace Details:");
		System.out.println("Details of shoelace:");							  
        System.out.println("Brand:" + shoelace.brand);
        System.out.println("Color:" + shoelace.color);
        System.out.println("Length:" + shoelace.length + " cm");
        System.out.println("Material:" + shoelace.material);
        System.out.println("Price:" + shoelace.price);
        System.out.println("Type:" + shoelace.type);
        System.out.println("Shape:" + shoelace.shape);
        System.out.println("Durability:" + shoelace.durability);
        System.out.println("Country:" + shoelace.country);
        System.out.println("Size:" + shoelace.size);
		System.out.println("-------------------------");
    }
}