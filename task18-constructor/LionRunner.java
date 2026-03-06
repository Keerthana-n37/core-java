class LionRunner{
	
	public static void main(String[] args){
    Habitat habitat = new Habitat("Savannah", "Hot");
    Diet diet = new Diet("Meat", 3);
    Zoo zoo = new Zoo("Bannerghatta Zoo", "Bangalore");
    Trainer trainer = new Trainer("Ravi", 10);
    Health health = new Health(true, "01-03-2026");

    Lion lion = new Lion("Simba", 5, 190.5, "Male", true,
                             habitat, diet, zoo, trainer, health);

    lion.displayLionDetails();
	}
}