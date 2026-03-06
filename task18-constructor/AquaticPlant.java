class AquaticPlant{
    String species;
    AquaticPlant(String species){
        System.out.println("Executing AquaticPlant Constructor");
        this.species = species;
    }
	
	void getDetails()
	{
		System.out.println("Aquarium aquatic plant species:"+this.species);
	}
}