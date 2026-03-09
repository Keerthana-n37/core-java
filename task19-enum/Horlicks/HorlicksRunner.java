class HorlicksRunner{
	
	public static void main(String[] args)
	{
		Manufacturer manufacturer1 = new Manufacturer("Glaxo", 1900);
        Horlicks horlicks1 = new Horlicks(500, manufacturer1, Flavor.CHOCOLATE);
        horlicks1.printInfo();

        Manufacturer manufacturer2 = new Manufacturer("HealthCorp", 1950);
        Horlicks horlicks2 = new Horlicks(750, manufacturer2, Flavor.VANILLA);
        horlicks2.printInfo();

        Manufacturer manufacturer3 = new Manufacturer("NutriFoods", 2000);
		Flavor flavor=Flavor.STRAWBERRY;
        Horlicks horlicks3 = new Horlicks(1000, manufacturer3,flavor);
        horlicks3.printInfo();

        Manufacturer manufacturer4 = new Manufacturer("MaltCorp", 2010);
		Flavor flavor1=Flavor.BUTTERSCOTCH;
        Horlicks horlicks4 = new Horlicks(250, manufacturer4,flavor1);
        horlicks4.printInfo();
	}
}