class MapRunner{
	public static void main(String[] args) {

        Map map1 = new Map(1,"World Map","Political","World",
                "1:1000000",250.0,100,"English",true,
                "Oxford",2023,40.0,30.0,"Paper","Multicolor",
                4.8,"Education", "India",true,"Printed");
        map1.printMap();

        Map map2 = new Map(2,"India Map","Physical","India",
                "1:500000",150.0,200, "English",false,
                "Navneet",2022, 35.0,25.0,
                "Paper","Color",4.6,"Education","India",true,"Printed");
        map2.printMap();

        Map map3 = new Map(3,"Karnataka Map","Political","Karnataka",
                "1:250000",120.0,150,"English",true,
                "StatePub",2021,30.0,20.0,"Paper","Color",
                4.5,"State","India",true,"Printed");
        map3.printMap();

        Map map4 = new Map(4,"Asia Map","Geographical","Asia",
                "1:800000",200.0,80,"English",true,
                "GeoWorld",2024,45.0,35.0,"Glossy","Multicolor",
				4.7,"Geography","India",true,"Poster");
        map4.printMap();

        Map map5 = new Map(5,"Europe Map","Political","Europe",
                "1:700000",210.0,70,"English",false,
                "MapHouse",2019,42.0,32.0,"Paper","Color",
				4.4,"Geography","UK",true,"Printed");
        map5.printMap();

        Map map6 = new Map(6,"USA Map","Physical","USA",
                "1:600000",180.0,90, "English",true,"AtlasPub",
				2023, 38.0,28.0,"Paper","Color",
                4.6,"Education","USA",true,"Printed");
        map6.printMap();

        Map map7 = new Map(7,"Africa Map","Political","Africa",
                "1:900000",230.0,60,"English",true,
                "GeoWorld",2022,44.0,34.0,"Glossy","Multicolor",
				4.3,"Geography","India",true,"Poster");
        map7.printMap();

        Map map8 = new Map(8,"City Map","Road","Bengaluru",
                "1:10000",100.0,300,"English",false,
                "CityMaps",2023,25.0,18.0,"Paper",
				"Color",4.2,"Travel","India",true,"Folded");
        map8.printMap();

        Map map9 = new Map(9,"Tourist Map","Travel","Goa",
                "1:15000",90.0,250,"English",false,
                "TravelPub",2022, 20.0,15.0,"Paper","Color",
                4.1,"Tourism", "India",true,"Folded");
        map9.printMap();

        Map map10 = new Map(10,"School Atlas","Educational","World",
                "1:1000000",300.0,120,"English",true,
                "Oxford",2023, 50.0,40.0,"Hardcover","Color",
                4.9,"Education", "India",true,"Book");
        map10.printMap();
    }
}