class AquariumRunner{

    public static void main(String[] args){

        Filter filter = new Filter("Canister Filter");
        Decor decoration = new Decor("Coral Rocks");
        Lighting lighting = new Lighting("LED Blue Light");
        AquaticPlant plants = new AquaticPlant("Amazon Sword");
        FeedingSchedule feeding = new FeedingSchedule("Twice Daily");

        Aquarium aquarium = new Aquarium(250.5, 26.5f, 7.8, 15, true,
                filter, decoration, lighting, plants, feeding);
				
		aquarium.getInfo();		
    }
}