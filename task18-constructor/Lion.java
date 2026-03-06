class Lion{
	String name;
	int age;
	double weight;
	String gender;
	boolean isWild;
	
	Habitat habitat;
	Diet diet;
	Zoo zoo;
	Trainer trainer;
	Health health;
	
	Lion(String name,int age,double weight,String gender,boolean isWild,
	Habitat habitat,Diet diet,Zoo zoo,Trainer trainer,Health health)
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.gender=gender;
		this.isWild=isWild;
		this.habitat=habitat;
		this.diet=diet;
		this.zoo=zoo;
		this.trainer=trainer;
		this.health=health;
	}
	void display() {

        System.out.println("Lion Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Gender: " + gender);
        System.out.println("Is Wild: " + isWild);

        System.out.println("Habitat Location: " + habitat.location);
        System.out.println("Habitat Climate: " + habitat.climate);

        System.out.println("Diet Type: " + diet.foodType);
        System.out.println("Meals Per Day: " + diet.mealsPerDay);

        System.out.println("Zoo Name: " + zoo.zooName);
        System.out.println("Zoo City: " + zoo.city);

        System.out.println("Trainer Name: " + trainer.trainerName);
        System.out.println("Trainer Experience: " + trainer.experience);

        System.out.println("Vaccinated: " + health.vaccinated);
        System.out.println("Last Checkup: " + health.lastCheckup);
    }
	
}