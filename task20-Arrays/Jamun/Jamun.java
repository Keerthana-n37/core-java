class Jamun
{
	float[] jamunWeights;
	Filling[] fillings;
	
	Jamun(float[] jamunWeights, Filling[] fillings)
	{
		this.jamunWeights= jamunWeights;
		this.fillings = fillings;
	}
	
	void display()
	{
		System.out.println("Jamun information");
		
		if(this.jamunWeights!= null)
		{
			System.out.println("Total jamuns weights:"+this.jamunWeights.length);
			for(float weight : this.jamunWeights)
			{
				System.out.println("Jamun weight:"+weight);
			}
		}
		else{
			System.out.println("jamunWeights is empty");
		}
		
		if(this.fillings!=null)
		{
			System.out.println("Total fillings:"+this.fillings.length);
			for(Filling filling: this.fillings)
			{
				System.out.println("Filling type:"+filling.type);
				System.out.println("Is sweet:"+filling.sweet);
			}
		}
		else{
			System.out.println("Fillings are empty");
		}
	}
}