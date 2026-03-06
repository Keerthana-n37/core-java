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
	void displayLionDetails() {

        System.out.println("Lion Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Weight: " + this.weight);
        System.out.println("Gender: " + this.gender);
        System.out.println("Is Wild: " + this.isWild);

        if(this.habitat!=null)
		{
			this.habitat.getHabitat();
		}
		else
		{
			System.out.println("Habitat is null");
		}
		
		if(this.diet!=null)
		{
			this.diet.getDiet();
		}
		else{
			System.out.println("Diet is null");
		}
		
		if(this.zoo!=null)
		{
			this.zoo.getZoo();
		}
		else{
			System.out.println("Zoo is null");
		}
		
		if(this.trainer!=null)
		{
			this.trainer.getTrainer();
		}
		else{
			System.out.println("Trainer is null");
		}
		
		if(this.health!=null)
		{
			this.health.getHealth();
		}
		else{
			System.out.println("Health is null");
		}
    }
	
	
	
}