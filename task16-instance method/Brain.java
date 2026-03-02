class Brain{
	
	int brainId;
	String personName;
	double brainWeight;
	double brainVolume;
	int personAge;
	String gender;
	double iq;
	String dominantHand;
	boolean healthy;
	String region;
	int neurons;
	int synapses;
	double memoryCapacity;
	double reactionTime;
	boolean sleepDeprived;
	boolean activeLifestyle;
	String dietType;
	String disease;
	double creativityLevel;
	String brainActivites;
	
	Brain(int brainId, String personName, double brainWeight, double brainVolume,
          int personAge, String gender, double iq, String dominantHand,
          boolean healthy, String region, int neurons, int synapses,
          double memoryCapacity, double reactionTime, boolean sleepDeprived,
          boolean activeLifestyle, String dietType, String disease,
          double creativityLevel, String brainActivites)
		  {
			  this.brainId=brainId;
			  this.personName=personName;
			  this.brainWeight=brainWeight;
			  this.brainVolume=brainVolume;
			  this.personAge = personAge;
			  this.gender = gender;
			  this.iq = iq;
			  this.dominantHand = dominantHand;
			  this.healthy = healthy;
			  this.region = region;
			  this.neurons = neurons;
			  this.synapses = synapses;
			  this.memoryCapacity = memoryCapacity;
			  this.reactionTime = reactionTime;
			  this.sleepDeprived = sleepDeprived;
			  this.activeLifestyle = activeLifestyle;
			  this.dietType = dietType;
			  this.disease = disease;
			  this.creativityLevel = creativityLevel;
			  this.brainActivites = brainActivites;
		  }
		  
	void aboutBrain() 
	{
        System.out.println("Brain ID: " + brainId);
        System.out.println("Person Name: " + personName);
        System.out.println("Brain Weight: " + brainWeight + " grams");
        System.out.println("Brain Volume: " + brainVolume + " cc");
        System.out.println("Age: " + personAge);
        System.out.println("Gender: " + gender);
        System.out.println("IQ: " + iq);
        System.out.println("Dominant Hand: " + dominantHand);
        System.out.println("Healthy: " + healthy);
        System.out.println("Region: " + region);
        System.out.println("Neurons: " + neurons + " billion");
        System.out.println("Synapses: " + synapses + " trillion");
        System.out.println("Memory Capacity: " + memoryCapacity + " GB");
        System.out.println("Reaction Time: " + reactionTime + " ms");
        System.out.println("Sleep Deprived: " + sleepDeprived);
        System.out.println("Active Lifestyle: " + activeLifestyle);
        System.out.println("Diet Type: " + dietType);
        System.out.println("Disease: " + disease);
        System.out.println("Creativity Level: " + creativityLevel);
        System.out.println("Brain Activities: " + brainActivites);
        System.out.println("----------------------------");
    }	  
}