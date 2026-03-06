class Trainer{
	
	  String trainerName;
	  int experience;
	  
	  Trainer(String trainerName,int experience)
	  {
		  this.trainerName=trainerName;
		  this.experience=experience;
	  }
	  
	  void getTrainer()
	  {
		  System.out.println("Trainer Name: " + this.trainerName);
		  System.out.println("Trainer Experience: " + this.experience);
	  }
}